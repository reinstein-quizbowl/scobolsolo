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
	questions_complete BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE Account (
	id INTEGER PRIMARY KEY REFERENCES Contact ON UPDATE CASCADE ON DELETE RESTRICT,
	username VARCHAR(64) UNIQUE NOT NULL,
	password_hash CHAR(60) NOT NULL DEFAULT '$2a$16$XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',
	password_reset_token CHAR(64),
	password_reset_token_expiration TIMESTAMP,
	administrator BOOLEAN NOT NULL DEFAULT FALSE,
	writer BOOLEAN NOT NULL DEFAULT FALSE,
	active BOOLEAN NOT NULL DEFAULT TRUE,
);

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

CREATE TABLE Waitlist_Entry (
	id SERIAL PRIMARY KEY,
	school_registration_id INTEGER NOT NULL REFERENCES School_Registration ON UPDATE CASCADE ON DELETE RESTRICT,
	sequence sequence_t,
	player_count INTEGER NOT NULL DEFAULT 1 CHECK (player_count > 0),
	note note_t
);
ALTER SEQUENCE waitlist_entry_id_seq RESTART WITH 1000;

CREATE TABLE Standby_Entry (
	id SERIAL PRIMARY KEY,
	school_registration_id INTEGER NOT NULL REFERENCES School_Registration ON UPDATE CASCADE ON DELETE RESTRICT,
	sequence sequence_t,
	player_count INTEGER NOT NULL DEFAULT 1 CHECK (player_count > 0),
	note note_t
);
ALTER SEQUENCE standby_entry_id_seq RESTART WITH 1000;

CREATE TABLE Staff (
	id SERIAL PRIMARY KEY,
	contact_id INTEGER NOT NULL REFERENCES Contact ON UPDATE CASCADE ON DELETE RESTRICT,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	school_registration_id INTEGER REFERENCES Registration ON UPDATE CASCADE ON DELETE RESTRICT, -- implies tournament
	note note_t
);

CREATE TABLE Staff_Role (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	very_short_name very_short_name_t UNIQUE,
	sequence sequence_t,
	may_enter_any_match BOOLEAN NOT NULL DEFAULT FALSE,
	may_enter_matches_in_assigned_room BOOLEAN NOT NULL DEFAULT TRUE
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
	initial_card_id INTEGER REFERENCES Card ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies Tournament
	note note_t,
	UNIQUE(initial_card_id)
);
ALTER SEQUENCE player_id_seq RESTART WITH 1000;

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

CREATE TABLE Buzzer (
	id SERIAL PRIMARY KEY,
	school_registration_id INTEGER NOT NULL REFERENCES Registration ON UPDATE CASCADE ON DELETE RESTRICT,-- implies the tournament
	room_id INTEGER REFERENCES Room ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies tournament
	label VARCHAR(256)
);

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

CREATE TABLE Round_Group (
	id SERIAL PRIMARY KEY,
	phase_id INTEGER NOT NULL REFERENCES Phase ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	name name_t,
	short_name short_name_t,
	sequence sequence_t, -- within Phase
	start_time VARCHAR(16), -- not proper, but more usable
	UNIQUE(tournament_code, name),
	UNIQUE(tournament_code, short_name)
);
ALTER SEQUENCE round_group_id_seq RESTART WITH 1000;

CREATE TABLE Round (
	id SERIAL PRIMARY KEY,
	round_group_id INTEGER REFERENCES Round_Group ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	name name_t,
	short_name short_name_t,
	sequence sequence_t, -- within RoundGroup
	lunch_after BOOLEAN NOT NULL DEFAULT FALSE,
	UNIQUE(round_group_id, name),
	UNIQUE(round_group_id, short_name)
);
ALTER SEQUENCE round_id_seq RESTART WITH 1000;

CREATE TABLE Card (
	id SERIAL PRIMARY KEY,
	phase_id INTEGER NOT NULL REFERENCES Phase ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	name name_t,
	short_name short_name_t,
	sequence sequence_t,
	UNIQUE(tournament_code, name),
	UNIQUE(tournament_code, short_name)
);
ALTER SEQUENCE card_id_seq RESTART WITH 1000;

CREATE TABLE Match (
	id SERIAL PRIMARY KEY,
	round_id INTEGER NOT NULL REFERENCES Round ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament (and round group and phase)
	room_id INTEGER NOT NULL REFERENCES Room ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	winning_card_id INTEGER NOT NULL REFERENCES Card ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	losing_card_id INTEGER NOT NULL REFERENCES Card ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	UNIQUE(round_id, room_id),
	UNIQUE(round_id, winning_card_id),
	UNIQUE(round_id, losing_card_id)
);
ALTER SEQUENCE match_id_seq RESTART WITH 1000;

CREATE TABLE Game (-- 1-1 with Match
	id INTEGER PRIMARY KEY REFERENCES Match ON UPDATE CASCADE ON DELETE RESTRICT,
	moderator_staff_id INTEGER REFERENCES Staff ON UPDATE CASCADE ON DELETE RESTRICT,
	tossups_heard INTEGER CHECK(tossups_heard IS NULL OR tossups_heard > 0),
	incoming_winning_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- NULL when the Game is set up from the first feeding result and the second isn't in yet
	incoming_losing_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- NULL when the Game is set up from the first feeding result and the second isn't in yet
	outgoing_winning_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- NULL when the Game is set up but hasn't been played yet
	outgoing_losing_card_player_id INTEGER REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- NULL when the Game is set up but hasn't been played yet
	CHECK(incoming_winning_card_player_id IS NOT NULL OR incoming_losing_card_player_id IS NOT NULL),
	CHECK((outgoing_winning_card_player_id IS NULL AND outgoing_losing_card_player_id IS NULL) OR (incoming_winning_card_player_id = outgoing_winning_card_player_id AND incoming_losing_card_player_id = outgoing_losing_card_player_id) OR (incoming_winning_card_player_id = outgoing_losing_card_player_id AND incoming_losing_card_player_id = outgoing_winning_card_player_id)) 
);

CREATE TABLE Performance (
	id SERIAL PRIMARY KEY,
	game_id INTEGER NOT NULL REFERENCES Game ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	player_id INTEGER NOT NULL REFERENCES Player ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions,
	UNIQUE (game_id, player_id)
);
ALTER SEQUENCE performance_id_seq RESTART WITH 1000;

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
	category_group_code code_t REFERENCES Category_Group ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE Category_Use (
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	needs INTEGER CHECK (needs IS NULL OR needs > 0),
	PRIMARY KEY (category_code, tournament_code)
);

CREATE TABLE Question (
	id SERIAL PRIMARY KEY,
	tournament_code code_t REFERENCES Tournament ON UPDATE CASCADE ON DELETE RESTRICT,
	description TEXT,
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	writer_account_id INTEGER REFERENCES Account ON UPDATE CASCADE ON DELETE RESTRICT,
	text TEXT,
	answer TEXT,
	note TEXT,
	question_status_code code_t DEFAULT 'DRAFTED' REFERENCES Question_Status ON UPDATE CASCADE ON DELETE RESTRICT,
	UNIQUE(tournament_code, description)
);
ALTER SEQUENCE question_id_seq RESTART WITH 1000;

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
	text TEXT NOT NULL,
	answer TEXT NOT NULL,
	note TEXT, -- Question.note
	remark TEXT, -- a remark specific to this editing
	edit_distance INTEGER NOT NULL,
	timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	UNIQUE(question_id, revision_number)
);
ALTER SEQUENCE diff_id_seq RESTART WITH 1000;

CREATE TABLE Approval (
	id SERIAL PRIMARY KEY,
	diff_id INTEGER NOT NULL REFERENCES Diff ON UPDATE CASCADE ON DELETE RESTRICT,
	approver_account_id INTEGER NOT NULL REFERENCES Account ON UPDATE CASCADE ON DELETE RESTRICT,
	timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	UNIQUE(diff_id, approver_account_id)
);
ALTER SEQUENCE approval_id_seq RESTART WITH 1000;

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

CREATE TABLE Placement (
	id SERIAL PRIMARY KEY,
	category_code code_t REFERENCES Category ON UPDATE CASCADE ON DELETE RESTRICT,
	question_id INTEGER REFERENCES Question ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament, if not NULL
	packet_id INTEGER NOT NULL REFERENCES Packet ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	sequence sequence_t,
	tiebreaker BOOLEAN NOT NULL DEFAULT FALSE,
	scorecheck_after BOOLEAN NOT NULL DEFAULT FALSE,
	UNIQUE(question_id, packet_id)
);
ALTER SEQUENCE placement_id_seq RESTART WITH 1000;

CREATE TABLE Response_Type (
	code code_t PRIMARY KEY,
	name name_t UNIQUE,
	short_name short_name_t UNIQUE,
	sequence sequence_t,
	points INTEGER NOT NULL,
	is_default BOOLEAN NOT NULL DEFAULT FALSE,
	multiple_allowed_for_same_placement BOOLEAN NOT NULL DEFAULT FALSE,
	is_attempt BOOLEAN NOT NULL DEFAULT TRUE,
	allows_further_attempts_to_same_question_in_match BOOLEAN NOT NULL DEFAULT FALSE,
	show_for_non_exhibition_players BOOLEAN NOT NULL DEFAULT TRUE,
	show_for_exhibition_players BOOLEAN NOT NULL DEFAULT FALSE
);
INSERT INTO Response_Type (code, name, short_name, sequence, points) VALUES
('CORRECT', 'Correct Answer', 'Correct', 100, 1),
('INTERRUPT', 'Incorrect Interrupt', 'Interrupt', 200, 0),
('INCORRECT_AT_END', 'Incorrect at End', 'Incorrect at End', 300, 0);

CREATE TABLE Response (
	id SERIAL PRIMARY KEY,
	performance_id INTEGER NOT NULL REFERENCES Performance ON UPDATE CASCADE ON DELETE RESTRICT, -- implies the tournament
	placement_id INTEGER NOT NULL REFERENCES Placement ON UPDATE CASCADE ON DELETE RESTRICT, -- also implies the tournament; it would be nice to check against contradictions
	response_type_code code_t REFERENCES Response_Type ON UPDATE CASCADE ON DELETE RESTRICT,
	replacement_for_placement_id INTEGER REFERENCES Placement ON UPDATE CASCADE ON DELETE RESTRICT,
	UNIQUE(performance_id, placement_id)
);
ALTER SEQUENCE response_id_seq RESTART WITH 1000;



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
