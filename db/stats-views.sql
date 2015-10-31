CREATE VIEW Player_Point_v AS
SELECT
	Ph.tournament_code,
	P.player_id,
	SUM(RT.points) AS points
FROM Response R
	JOIN Performance P ON R.performance_id = P.id
	JOIN Player PLAYER ON P.player_id = PLAYER.id
	JOIN Game G ON P.game_id = G.id
	JOIN Match M ON G.id = M.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Round_Group RG ON RD.round_group_id = RG.id
	JOIN Phase Ph ON RG.phase_id = Ph.id
	JOIN Response_Type RT ON R.response_type_code = RT.code
WHERE PLAYER.exhibition = FALSE
GROUP BY Ph.tournament_code, P.player_id;



CREATE VIEW Player_Category_Point_v AS
SELECT
	Ph.tournament_code,
	PLAYER.id AS player_id,
	C.code AS category_code,
	COUNT(R.*) AS tossups_heard,
	SUM(RT.points) AS points
FROM Response R
	JOIN Performance P ON R.performance_id = P.id
	JOIN Player PLAYER ON P.playeR_id = PLAYER.id
	JOIN Game G ON P.game_id = G.id
	JOIN Match M ON G.id = M.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Round_Group RG ON RD.round_group_id = RG.id
	JOIN Phase Ph ON RG.phase_id = Ph.id
	JOIN Response_Type RT ON R.response_type_code = RT.code
	JOIN Placement PL ON R.placement_id = PL.id
	JOIN Question Q on PL.question_id = Q.id
	JOIN Category C ON Q.category_code = C.code
WHERE
	PL.tiebreaker = FALSE AND
	PLAYER.exhibition = FALSE
GROUP BY Ph.tournament_code, PLAYER.id, C.code;


CREATE VIEW Placement_Conversion_v AS
SELECT Ph.tournament_code, PL.id AS placement_id, PL.question_id, R.response_type_code, COUNT(*) AS response_type_count
FROM Placement PL
	JOIN Response R ON R.placement_id = PL.id
	JOIN Performance P ON R.performance_id = P.id
	JOIN Player PLAYER ON P.player_id = PLAYER.id
	JOIN Game G ON P.game_id = G.id
	JOIN Match M ON G.id = M.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Round_Group RG ON RD.round_group_id = RG.id
	JOIN Phase Ph ON RG.phase_id = Ph.id
WHERE PLAYER.exhibition = FALSE
GROUP BY Ph.tournament_code, PL.id, PL.question_id, R.response_type_code;


CREATE VIEW Category_Conversion_v AS
SELECT Ph.tournament_code, Q.category_code, R.response_type_code, COUNT(*) AS response_type_count
FROM Placement PL
	JOIN Response R ON R.placement_id = PL.id
	JOIN Performance P ON R.performance_id = P.id
	JOIN Player PLAYER ON P.player_id = PLAYER.id
	JOIN Game G ON P.game_id = G.id
	JOIN Match M ON G.id = M.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Round_Group RG ON RD.round_group_id = RG.id
	JOIN Phase Ph ON RG.phase_id = Ph.id
	JOIN Question Q ON PL.question_id = Q.id
WHERE PLAYER.exhibition = FALSE
GROUP BY Ph.tournament_code, Q.category_code, R.response_type_code;

CREATE VIEW Player_Match_v AS
SELECT
	Ph.tournament_code,
	Pthis.player_id AS player_id,
	Pthis.id AS performance_id,
	Popp.player_id AS opponent_player_id,
	Popp.id AS opponent_performance_id,
	M.id AS match_id,
	G.id AS game_id
FROM Performance Pthis
	JOIN Match M ON Pthis.game_id = M.id
	JOIN Game G ON M.id = G.id
	JOIN Performance Popp ON Popp.game_id = Pthis.game_id AND Popp.id <> Pthis.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Round_Group RG ON RD.round_group_id = RG.id
	JOIN Phase Ph ON RG.phase_id = Ph.id;

CREATE VIEW Game_v AS
SELECT
	Ph.tournament_code,
	G.id AS game_id,
	M.round_id,
	M.room_id,
	M.winning_card_id, M.losing_card_id,
	G.moderator_staff_id,
	G.tossups_heard,
	G.incoming_winning_card_player_id, G.incoming_losing_card_player_id,
	G.outgoing_winning_card_player_id AS winner_player_id, G.outgoing_losing_card_player_id AS loser_player_id,
	Pwin.id AS winner_performance_id, Plose.id AS loser_performance_id,
	SUM(RTwin.points) AS winner_score, SUM(RTlose.points) AS loser_score
FROM Match M
	JOIN Game G ON M.id = G.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Round_Group RG ON RD.round_group_id = RG.id
	JOIN Phase Ph ON RG.phase_id = Ph.id
	JOIN Performance Pwin ON Pwin.game_id = G.id AND Pwin.player_id = G.outgoing_winning_card_player_id
	JOIN Performance Plose ON Plose.game_id = G.id AND Plose.player_id = G.outgoing_losing_card_player_id
	JOIN Response Rwin ON Pwin.id = Rwin.performance_id
	JOIN Response_Type RTwin ON Rwin.response_type_code = RTwin.code
	JOIN Response Rlose ON Plose.id = Rlose.performance_id
	JOIN Response_Type RTlose ON Rlose.response_type_code = RTlose.code
WHERE
	Rwin.placement_id = Rlose.placement_id AND
	(
		(G.outgoing_winning_card_player_id IS NOT NULL AND G.outgoing_losing_card_player_id IS NOT NULL)
		OR
		Ph.card_system = FALSE
	)
GROUP BY Ph.tournament_code, G.id, M.round_id, M.room_id, M.winning_card_id, M.losing_card_id, G.moderator_staff_id, G.tossups_heard, G.incoming_winning_card_player_id, G.incoming_losing_card_player_id, G.outgoing_winning_card_player_id, G.outgoing_losing_card_player_id, Pwin.id, Plose.id;

CREATE VIEW Player_Record_v AS
SELECT
	SR.tournament_code,
	P.id AS player_id,
	SUM(CASE WHEN GVwin.winner_player_id = P.id THEN 1 ELSE 0 END) AS win_count,
	SUM(CASE WHEN GVlose.loser_player_id = P.id THEN 1 ELSE 0 END) AS loss_count,
	COALESCE(SUM(CASE WHEN GVwin.winner_player_id = P.id THEN GVwin.winner_score ELSE 0 END), 0) + COALESCE(SUM(CASE WHEN GVlose.loser_player_id = P.id THEN GVlose.loser_score ELSE 0 END), 0) AS points,
	(COALESCE(SUM(GVwin.tossups_heard), 0) + COALESCE(SUM(GVlose.tossups_heard), 0))/2 AS tossups_heard
FROM Player P, School_Registration SR, Game_v GVwin, Game_v GVlose
WHERE
	GVwin.game_id = GVlose.game_id AND
	P.school_registration_id = SR.id AND
	(GVwin.winner_player_id = P.id OR GVlose.loser_player_id = P.id) AND
	P.exhibition = FALSE
GROUP BY SR.tournament_code, P.id;

CREATE VIEW Upcoming_Match_v AS
SELECT M.*
FROM Match M
	LEFT OUTER JOIN Game G ON M.id = G.id
WHERE G.id IS NULL OR (G.outgoing_winning_card_player_id IS NULL AND G.outgoing_losing_card_player_id IS NULL)