CREATE DOMAIN code_t VARCHAR(32) NOT NULL CHECK(VALUE = UPPER(VALUE) AND LENGTH(VALUE) > 0);
CREATE DOMAIN nullable_code_t VARCHAR(32) CHECK(VALUE = UPPER(VALUE) AND LENGTH(VALUE) > 0);
CREATE DOMAIN sequence_t INTEGER DEFAULT 0 NOT NULL;
CREATE DOMAIN name_t VARCHAR(256) NOT NULL CHECK(LENGTH(VALUE) > 0);
CREATE DOMAIN short_name_t VARCHAR(32) NOT NULL CHECK(LENGTH(VALUE) > 0);
CREATE DOMAIN very_short_name_t VARCHAR(12) NOT NULL CHECK(LENGTH(VALUE) > 0);
CREATE DOMAIN note_t TEXT;
CREATE DOMAIN phone_number_t VARCHAR(32);
CREATE DOMAIN email_t VARCHAR(256) CHECK(VALUE LIKE '%@%'); -- Pretty crappy check

CREATE TABLE Contact (
	id SERIAL PRIMARY KEY,
	name VARCHAR(256) NOT NULL,
	sort_by VARCHAR(256) NOT NULL,
	email_address email_t,
	advance_phone phone_number_t,
	day_of_phone phone_number_t,
	note note_t,
	active BOOLEAN NOT NULL DEFAULT TRUE
);
ALTER SEQUENCE contact_id_seq RESTART WITH 1000;

CREATE TABLE Tournament (
	code code_t PRIMARY KEY,
	date DATE NOT NULL,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	online_stats BOOLEAN NOT NULL DEFAULT TRUE,
	web_xml_role_code code_t UNIQUE,
	tiebreaker_sudden_death BOOLEAN NOT NULL DEFAULT TRUE,
	url TEXT,
	tournament_director_contact_id INTEGER NOT NULL REFERENCES Contact ON UPDATE CASCADE ON DELETE RESTRICT,
	player_message TEXT,
	staff_message TEXT,
	school_message TEXT,
	replacement_question_social_media_policy TEXT,
	championship_rules TEXT,
	championship_match_url VARCHAR(256),
	control_room_room_id INTEGER REFERENCES ROOM ON UPDATE CASCADE ON DELETE RESTRICT,
	questions_complete BOOLEAN NOT NULL DEFAULT FALSE,
	question_download_url TEXT
);
CREATE INDEX tournament_tdcontact_idx ON Tournament(tournament_director_contact_id);
CREATE INDEX tournament_tcontrolroom_idx ON Tournament(control_room_room_id);

CREATE TABLE Account (
	id INTEGER PRIMARY KEY REFERENCES Contact ON UPDATE CASCADE ON DELETE RESTRICT,
	username VARCHAR(64) UNIQUE NOT NULL,
	password_hash CHAR(60) NOT NULL DEFAULT '$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',
	password_reset_token CHAR(64),
	password_reset_token_expiration TIMESTAMP,
	administrator BOOLEAN NOT NULL DEFAULT FALSE,
	writer BOOLEAN NOT NULL DEFAULT FALSE,
	active BOOLEAN NOT NULL DEFAULT TRUE,
	can_receive_unsolicited_messages BOOLEAN NOT NULL DEFAULT FALSE,
	message_email_notifications email_t
);
CREATE INDEX account_contact_idx ON Account(id);

CREATE TABLE School (
	id SERIAL PRIMARY KEY,
	code code_t UNIQUE,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	very_short_name very_short_name_t UNIQUE,
	location VARCHAR(256),
	note note_t
);
ALTER SEQUENCE school_id_seq RESTART WITH 1000;

CREATE TABLE School_Registration (
	id SERIAL PRIMARY KEY,
	school_id INTEGER NOT NULL REFERENCES School ON UPDATE CASCADE ON DELETE RESTRICT,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	main_contact_id INTEGER NOT NULL REFERENCES Contact ON UPDATE CASCADE ON DELETE RESTRICT,
	amount_owed NUMERIC(6,2),
	amount_paid NUMERIC(6,2),
	spots_reserved INTEGER,
	note note_t,
	UNIQUE(school_id, tournament_code)
);
ALTER SEQUENCE school_registration_id_seq RESTART WITH 1000;
CREATE INDEX schoolregistration_school_idx ON School_Registration(school_id);
CREATE INDEX schoolregistration_tournament_idx ON School_Registration(tournament_code);
CREATE INDEX schoolregistration_maincontact_idx ON School_Registration(main_contact_id);

CREATE TABLE Waitlist_Entry (
	id SERIAL PRIMARY KEY,
	school_registration_id INTEGER NOT NULL REFERENCES School_Registration ON UPDATE CASCADE ON DELETE RESTRICT,
	sequence sequence_t,
	player_count INTEGER NOT NULL DEFAULT 1 CHECK (player_count > 0),
	note note_t
);
ALTER SEQUENCE waitlist_entry_id_seq RESTART WITH 1000;
CREATE INDEX waitlistentry_schoolregistration_idx ON Waitlist_Entry(school_registration_id);

CREATE TABLE Standby_Entry (
	id SERIAL PRIMARY KEY,
	school_registration_id INTEGER NOT NULL REFERENCES School_Registration ON UPDATE CASCADE ON DELETE RESTRICT,
	sequence sequence_t,
	player_count INTEGER NOT NULL DEFAULT 1 CHECK (player_count > 0),
	note note_t
);
ALTER SEQUENCE standby_entry_id_seq RESTART WITH 1000;
CREATE INDEX standbyentry_schoolregistration_idx ON Standby_Entry(school_registration_id);

CREATE TABLE Technology_Choice (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	very_short_name very_short_name_t UNIQUE,
	sequence sequence_t,
	has_computer BOOLEAN NOT NULL DEFAULT TRUE
);
INSERT INTO Technology_Choice (name, short_name, very_short_name, code, sequence, has_computer) VALUES
('Bringing Own', 'Bringing', 'Bring', 'BRINGING_OWN', 0, true),
('Needs One Provided', 'We Provide', 'Need', 'NEEDS_COMPUTER_PROVIDED', 100, true),
('No Computer', 'None', 'None', 'NO_COMPUTER', 200, false),
('Not Yet Chosen', 'TBD', 'TBD', 'TBD', 999, false);

CREATE TABLE Staff (
	id SERIAL PRIMARY KEY,
	contact_id INTEGER NOT NULL REFERENCES Contact ON UPDATE CASCADE ON DELETE RESTRICT,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	school_registration_id INTEGER REFERENCES Registration ON UPDATE CASCADE ON DELETE RESTRICT, -- implies tournament
	note note_t,
	technology_choice_code code_t REFERENCES Technology_Choice ON UPDATE CASCADE ON DELETE RESTRICT DEFAULT 'TBD'
);
ALTER SEQUENCE staff_id_seq RESTART WITH 1000;
CREATE INDEX staff_contact_idx ON Staff(contact_id);
CREATE INDEX staff_tournament_idx ON Staff(tournament_code);
CREATE INDEX staff_schoolregistration_idx ON Staff(school_registration_id);
CREATE INDEX staff_technologychoice_idx ON Staff(technology_choice_code);


CREATE TABLE Staff_Role (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	very_short_name very_short_name_t UNIQUE,
	sequence sequence_t,
	may_enter_any_match BOOLEAN NOT NULL DEFAULT FALSE,
	may_enter_matches_in_assigned_room BOOLEAN NOT NULL DEFAULT TRUE,
	may_view_questions BOOLEAN NOT NULL DEFAULT FALSE,
	may_enter_matches_before_usually_permitted BOOLEAN NOT NULL DEFAULT FALSE
);
INSERT INTO Staff_Role (name, short_name, very_short_name, code, sequence) VALUES
('Tournament Director', 'TD', 'TD', 'TOURNAMENT_DIRECTOR', 0),
('Moderator', 'Moderator', 'Mod', 'MODERATOR', 100),
('Scorekeeper', 'Scorekeeper', 'SK', 'SCOREKEEPER', 200),
('Statistician', 'Statistician', 'Stats', 'STATISTICIAN', 300),
('On Call', 'On Call', 'On Call', 'ON_CALL', 999);

CREATE TABLE Staff_Assignment (
	id SERIAL PRIMARY KEY,
	staff_id INTEGER NOT NULL REFERENCES Staff ON UPDATE CASCADE ON DELETE RESTRICT, -- implies tournament
	room_id INTEGER NOT NULL REFERENCES Room ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies tournament
	note TEXT,
	phase_id INTEGER NOT NULL REFERENCES Phase ON UPDATE CASCADE ON DELETE RESTRICT,
	staff_role_code code_t REFERENCES Staff_Role ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE INDEX staffassignment_staff_idx ON Staff_Assignment(staff_id);
CREATE INDEX staffassignment_room_idx ON Staff_Assignment(room_id);
CREATE INDEX staffassignment_phase_idx ON Staff_Assignment(phase_id);
CREATE INDEX staffassignment_staffrole_idx ON Staff_Assignment(staff_role_code);

CREATE TABLE School_Year (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	very_short_name very_short_name_t UNIQUE,
	sequence sequence_t
);
INSERT INTO School_Year (name, short_name, very_short_name, code, sequence) VALUES
('Sixth Grade',    'Sixth',    '6',  '6',  60),
('Seventh Grade',  'Seventh',  '7',  '7',  70),
('Eighth Grade',   'Eighth',   '8',  '8',  80),
('Ninth Grade',    'Ninth',    '9',  '9',  90),
('Tenth Grade',    'Tenth',    '10', '10', 100),
('Eleventh Grade', 'Eleventh', '11', '11', 110),
('Twelfth Grade',  'Twelfth',  '12', '12', 120);

CREATE TABLE Player (
	id SERIAL PRIMARY KEY,
	contact_id INTEGER NOT NULL REFERENCES Contact ON UPDATE CASCADE ON DELETE RESTRICT,
	school_registration_id INTEGER REFERENCES Registration ON UPDATE CASCADE ON DELETE RESTRICT, -- implies tournament
	school_year_code nullable_code_t REFERENCES School_Year ON UPDATE CASCADE ON DELETE RESTRICT,
	rank_within_school INTEGER CHECK (rank_within_school IS NULL OR rank_within_school > 0),
	seed INTEGER CHECK (seed IS NULL OR seed > 0),
	note note_t,
	initial_card_id INTEGER REFERENCES Card ON UPDATE CASCADE ON DELETE RESTRICT,
	exhibition BOOLEAN NOT NULL DEFAULT FALSE,
	UNIQUE(contact_id, school_registration_id)
);
ALTER SEQUENCE player_id_seq RESTART WITH 1000;
CREATE INDEX player_contact_idx ON Player(contact_id);
CREATE INDEX player_schoolregistration_idx ON Player(school_registration_id);
CREATE INDEX player_schoolyear_idx ON Player(school_year_code);


CREATE TABLE Room (
	id SERIAL PRIMARY KEY,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	name name_t,
	short_name short_name_t,
	game_room BOOLEAN NOT NULL DEFAULT TRUE,
	note note_t,
	sequence sequence_t,
	UNIQUE(tournament_code, name),
	UNIQUE(tournament_code, short_name)
);
ALTER SEQUENCE room_id_seq RESTART WITH 1000;
CREATE INDEX room_tournament_idx ON Room(tournament_code);

CREATE TABLE Buzzer (
	id SERIAL PRIMARY KEY,
	school_registration_id INTEGER NOT NULL REFERENCES Registration ON UPDATE CASCADE ON DELETE RESTRICT,-- implies the tournament
	room_id INTEGER REFERENCES Room ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies tournament
	label VARCHAR(256)
);
CREATE INDEX buzzer_schoolregistration_idx ON Buzzer(school_registration_id);
CREATE INDEX buzzer_room_idx ON Buzzer(room_id);

CREATE TABLE Phase (
	id SERIAL PRIMARY KEY,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	name name_t,
	short_name short_name_t,
	sequence sequence_t,
	card_system BOOLEAN NOT NULL,
	note note_t,
	UNIQUE(tournament_code, name),
	UNIQUE(tournament_code, short_name)
);
ALTER SEQUENCE phase_id_seq RESTART WITH 1000;
CREATE INDEX phase_tournament_idx ON Phase(tournament_code);

CREATE TABLE Round (
	id SERIAL PRIMARY KEY,
	phase_id INTEGER NOT NULL REFERENCES Phase ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the Tournament
	name name_t,
	short_name short_name_t,
	sequence sequence_t, -- within RoundGroup
	lunch_after BOOLEAN NOT NULL DEFAULT FALSE,
	start_time VARCHAR(16), -- not proper, but more usable
	earliest_entry_allowed TIMESTAMP, -- NULL means always allowed
	UNIQUE(round_group_id, name),
	UNIQUE(round_group_id, short_name)
);
ALTER SEQUENCE round_id_seq RESTART WITH 1000;
CREATE INDEX round_roundgroup_idx ON Round(round_group_id);

CREATE TABLE Card (
	id SERIAL PRIMARY KEY,
	phase_id INTEGER NOT NULL REFERENCES Phase ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	initial_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE SET NULL, -- also implies the tournament
	name name_t,
	short_name short_name_t,
	sequence sequence_t,
	UNIQUE(initial_player_id),
	UNIQUE(phase_id, name),
	UNIQUE(phase_id, short_name)
);
ALTER SEQUENCE card_id_seq RESTART WITH 1000;
CREATE INDEX card_phase_idx ON Card(phase_id);

CREATE TABLE Match (
	id SERIAL PRIMARY KEY,
	round_id INTEGER NOT NULL REFERENCES Round ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament (and round group and phase)
	room_id INTEGER NOT NULL REFERENCES Room ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	winning_card_id INTEGER NOT NULL REFERENCES Card ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	losing_card_id INTEGER NOT NULL REFERENCES Card ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	UNIQUE(round_id, winning_card_id),
	UNIQUE(round_id, losing_card_id)
);
ALTER SEQUENCE match_id_seq RESTART WITH 1000;
CREATE INDEX match_round_idx ON Match(round_id);
CREATE INDEX match_room_idx ON Match(room_id);

CREATE TABLE Game (-- 1-1 with Match
	id INTEGER PRIMARY KEY REFERENCES Match ON UPDATE CASCADE ON DELETE RESTRICT,
	moderator_staff_id INTEGER REFERENCES Staff ON UPDATE CASCADE ON DELETE RESTRICT,
	tossups_heard INTEGER CHECK(tossups_heard IS NULL OR tossups_heard > 0),
	incoming_winning_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE SET NULL, -- NULL when the Game is set up from the first feeding result and the second isn't in yet
	incoming_losing_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE SET NULL, -- NULL when the Game is set up from the first feeding result and the second isn't in yet
	outgoing_winning_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- NULL when the Game is set up but hasn't been played yet
	outgoing_losing_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- NULL when the Game is set up but hasn't been played yet
	scorekeeper_staff_id INTEGER REFERENCES Staff ON UPDATE CASCADE ON DELETE RESTRICT,
	CHECK(incoming_winning_card_player_id IS NOT NULL OR incoming_losing_card_player_id IS NOT NULL),
	CHECK((outgoing_winning_card_player_id IS NULL AND outgoing_losing_card_player_id IS NULL) OR (incoming_winning_card_player_id = outgoing_winning_card_player_id AND incoming_losing_card_player_id = outgoing_losing_card_player_id) OR (incoming_winning_card_player_id = outgoing_losing_card_player_id AND incoming_losing_card_player_id = outgoing_winning_card_player_id)) 
);
CREATE INDEX game_id_idx ON Game(id);
CREATE INDEX game_moderatorstaff_idx ON Game(moderator_staff_id);
CREATE INDEX game_scorekeeperstaff_idx ON Game(moderator_staff_id);
CREATE INDEX game_incomingwinningcardplayer_idx ON Game(incoming_winning_card_player_id);
CREATE INDEX game_incominglosingcardplayer_idx ON Game(incoming_losing_card_player_id);
CREATE INDEX game_outgoingwinningcardplayer_idx ON Game(outgoing_winning_card_player_id);
CREATE INDEX game_outgoinglosingcardplayer_idx ON Game(outgoing_losing_card_player_id);

CREATE TABLE Performance (
	id SERIAL PRIMARY KEY,
	game_id INTEGER NOT NULL REFERENCES Game ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	player_id INTEGER NOT NULL REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions,
	UNIQUE (game_id, player_id)
);
ALTER SEQUENCE performance_id_seq RESTART WITH 1000;
CREATE INDEX performance_player_idx ON Performance(player_id);
CREATE INDEX performance_game_idx ON Performance(game_id);
CREATE INDEX performance_player_game_idx ON Performance(player_id, game_id);

CREATE TABLE Category_Group (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	sequence sequence_t
);

CREATE TABLE Category (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	sequence sequence_t,
	category_group_code code_t REFERENCES Category_Group ON UPDATE CASCADE ON DELETE RESTRICT,
	allow_pronunciation_guide_suppression BOOLEAN NOT NULL DEFAULT TRUE,
	active BOOLEAN NOT NULL DEFAULT TRUE
);
CREATE INDEX category_categorygroup_idx ON Category(category_group_code);

CREATE TABLE Category_Use (
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	needs INTEGER CHECK (needs IS NULL OR needs > 0),
	PRIMARY KEY (category_code, tournament_code)
);
CREATE INDEX categoryuse_category_idx ON Category_Use(category_code);
CREATE INDEX categoryuse_tournament_idx ON Category_Use(tournament_code);

CREATE TABLE Question (
	id SERIAL PRIMARY KEY,
	description TEXT,
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	writer_account_id INTEGER REFERENCES Account ON UPDATE CASCADE ON DELETE RESTRICT,
	text TEXT,
	answer TEXT,
	note TEXT,
	question_status_code code_t DEFAULT 'DRAFTED' REFERENCES Question_Status ON UPDATE CASCADE ON DELETE RESTRICT
);
ALTER SEQUENCE question_id_seq RESTART WITH 1000;
CREATE INDEX question_category_idx ON Question(category_code);
CREATE INDEX question_writeraccount_idx ON Question(writer_account_id);
CREATE INDEX question_questionstatus_idx ON Question(question_status_code);

CREATE TABLE Question_Status (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	sequence sequence_t
);
INSERT INTO Question_Status (code, name, short_name, sequence) VALUES
('ANSWER_CHOSEN', 'Answer Chosen', 'Answer', 100),
('DRAFTED', 'Drafted', 'Draft', 200),
('READY_FOR_REVIEW', 'Ready for Review', 'Review', 300),
('APPROVED', 'Approved', 'Approved', 400);

CREATE TABLE Diff (
	id SERIAL PRIMARY KEY,
	question_id INTEGER NOT NULL REFERENCES Question ON UPDATE CASCADE ON DELETE RESTRICT,
	revision_number INTEGER NOT NULL,
	editor_account_id INTEGER NOT NULL REFERENCES Account ON UPDATE CASCADE ON DELETE RESTRICT,
	question_status_code code_t REFERENCES Question_Status ON UPDATE CASCADE ON DELETE RESTRICT,
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	text TEXT,
	answer TEXT,
	note TEXT, -- Question.note
	remark TEXT, -- a remark specific to this editing
	edit_distance INTEGER NOT NULL CHECK(edit_distance >= 0),
	text_length INTEGER NOT NULL CHECK(text_length >= 0),
	timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	UNIQUE(question_id, revision_number)
);
ALTER SEQUENCE diff_id_seq RESTART WITH 1000;
CREATE INDEX diff_question_idx ON Diff(question_id);
CREATE INDEX diff_editoraccount_idx ON Diff(editor_account_id);
CREATE INDEX diff_questionstatus_idx ON Diff(question_status_code);
CREATE INDEX diff_category_idx ON Diff(category_code);

CREATE VIEW Current_Diff AS
SELECT D.*
FROM Diff D
JOIN (SELECT question_id, MAX(revision_number) AS current_revision_number FROM Diff D GROUP BY question_id) A ON D.question_id = A.question_id AND D.revision_number = A.current_revision_number;
GRANT SELECT ON Current_Diff TO scobolsolo;

CREATE TABLE Packet (
	id SERIAL PRIMARY KEY,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	round_id INTEGER UNIQUE REFERENCES Round ON UPDATE CASCADE ON DELETE RESTRICT,
	sequence sequence_t DEFAULT 0,
	note note_t,
	replacement_packet_id INTEGER REFERENCES Packet ON UPDATE CASCADE ON DELETE RESTRICT,
	questions_public BOOLEAN NOT NULL DEFAULT FALSE
);
ALTER SEQUENCE packet_id_seq RESTART WITH 1000;
CREATE INDEX packet_tournament_idx ON Packet(tournament_code);
CREATE INDEX packet_round_idx ON Packet(round_id);
CREATE INDEX packet_replacementpacket_idx ON Packet(replacement_packet_id);

CREATE TABLE Placement (
	id SERIAL PRIMARY KEY,
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	question_id INTEGER REFERENCES Question ON UPDATE CASCADE ON DELETE RESTRICT,
	packet_id INTEGER NOT NULL REFERENCES Packet ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	number INTEGER,
	tiebreaker BOOLEAN NOT NULL DEFAULT FALSE,
	scorecheck_after BOOLEAN NOT NULL DEFAULT FALSE,
	UNIQUE(question_id, packet_id)
);
ALTER SEQUENCE placement_id_seq RESTART WITH 1000;
CREATE INDEX placement_question_idx ON Placement(question_id);
CREATE INDEX placement_packet_idx ON Placement(packet_id);
CREATE INDEX placement_category_idx ON Placement(category_code);

CREATE VIEW Placement_v AS
SELECT
	PL.id AS placement_id, PL.category_code, PL.question_id, PL.packet_id, PL.number, PL.tiebreaker, PL.scorecheck_after,
	P.tournament_code, P.name AS packet_name, P.short_name AS packet_short_name, P.round_id, P.sequence AS packet_sequence, P.note AS packet_note, P.replacement_packet_id, P.questions_public
FROM Placement PL
	JOIN Packet P ON PL.packet_id = P.id;
GRANT SELECT ON Placement_v TO scobolsolo;

CREATE TABLE Response_Type (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	sequence sequence_t,
	points INTEGER NOT NULL,
	is_default BOOLEAN NOT NULL DEFAULT FALSE,
	multiple_allowed_for_same_create table placement
	BOOLEAN NOT NULL DEFAULT FALSE,
	is_attempt BOOLEAN NOT NULL DEFAULT TRUE,
	allows_further_attempts_to_same_question_in_match BOOLEAN NOT NULL DEFAULT FALSE,
	show_in_reports BOOLEAN NOT NULL DEFAULT TRUE
);
INSERT INTO Response_Type (code, name, short_name, sequence, points) VALUES
('CORRECT', 'Correct Answer', 'Correct', 100, 1),
('INTERRUPT', 'Incorrect Interrupt', 'Interrupt', 200, 0),
('INCORRECT_AT_END', 'Incorrect at End', 'Incorrect at End', 300, 0);

CREATE TABLE Response (
	id SERIAL PRIMARY KEY,
	performance_id INTEGER NOT NULL REFERENCES Performance ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	response_type_code code_t REFERENCES Response_Type ON UPDATE CASCADE ON DELETE RESTRICT,
	base_placement_id INTEGER NOT NULL REFERENCES Placement ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	replacement_placement_id INTEGER REFERENCES Placement ON UPDATE CASCADE ON DELETE RESTRICT -- also implies the tournament; it would be nice to check against contradictions,
	diff_id INTEGER REFERENCES Diff ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the question_id, which is also implied by whichever placement_id is in use
	location INTEGER CHECK(location IS NULL OR location >= 0) -- the 0-based index of the first character of the "word" on which the player buzzed
	UNIQUE(performance_id, base_placement_id)
);
ALTER SEQUENCE response_id_seq RESTART WITH 1000;
CREATE INDEX response_diff_idx ON Response(diff_id);
CREATE INDEX response_performance_idx ON Response(performance_id);
CREATE INDEX response_responsetype_idx ON Response(response_type_code);
CREATE INDEX response_baseplacement_idx ON Response(base_placement_id);
CREATE INDEX response_replacementplacement_idx ON Response(replacement_placement_id);

CREATE TABLE Pronunciation_Guide_Suppression (
	id SERIAL PRIMARY KEY,
	account_id INTEGER NOT NULL REFERENCES Account ON UPDATE CASCADE ON DELETE RESTRICT,
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	UNIQUE(account_id, category_code)
);
ALTER SEQUENCE pronunciation_guide_suppression_id_seq RESTART WITH 1000;
CREATE INDEX pronunciationguidesuppression_account_idx ON Pronunciation_Guide_Suppression(account_id);
CREATE INDEX pronunciationguidesuppression_category_idx ON Pronunciation_Guide_Suppression(category_code);

CREATE TABLE Message (
	id SERIAL PRIMARY KEY,
	from_account_id INTEGER NOT NULL REFERENCES Account ON UPDATE CASCADE ON DELETE RESTRICT,
	to_account_id INTEGER NOT NULL REFERENCES Account ON UPDATE CASCADE ON DELETE RESTRICT,
	text TEXT NOT NULL,
	sent_timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	acknowledged_timestamp TIMESTAMP, 
	archived BOOLEAN NOT NULL DEFAULT FALSE
);
ALTER SEQUENCE message_id_seq RESTART WITH 1000;
CREATE INDEX message_fromaccount_idx ON Message(from_account_id);
CREATE INDEX message_toaccount_idx ON Message(to_account_id);



CREATE VIEW Web_Login AS
SELECT username, password_hash
FROM Account
WHERE Account.active = TRUE;

CREATE VIEW Web_Roles AS 
SELECT A.username, 'ADMINISTRATOR' AS role
FROM Account A
WHERE A.active = true AND A.administrator = true
UNION ALL
SELECT A.username, 'LOGIN' AS role
FROM Account A
WHERE A.active = true
UNION ALL
SELECT A.username, 'WRITER' AS role
FROM Account A
WHERE A.writer = true
UNION ALL
SELECT A.username, T.web_xml_role_code AS role
FROM Account A
	JOIN Contact C ON A.id = C.id
	JOIN Staff S ON S.contact_id = C.id
	JOIN Tournament T ON S.tournament_code = T.code
WHERE A.active = true
;
