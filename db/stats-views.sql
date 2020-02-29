CREATE OR REPLACE VIEW Response_v AS
SELECT R.*, COALESCE(replacement_placement_id, base_placement_id) AS actual_placement_id
FROM Response R;
GRANT SELECT ON Response_v TO scobolsolo;


CREATE OR REPLACE VIEW Placement_Conversion_v AS
SELECT
	PH.tournament_code,
	PL.id AS placement_id,
	PL.question_id,
	R.response_type_code,
	COUNT(*) AS response_type_count,
	AVG(1.0 * R.word_end_index / D.text_length) AS average_buzz_depth
FROM Placement PL
	JOIN Response_v R ON R.actual_placement_id = PL.id
	JOIN Performance P ON R.performance_id = P.id
	JOIN Player PY ON P.player_id = PY.id
	JOIN Game G ON P.game_id = G.id
	JOIN Match M ON G.id = M.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Phase PH ON RD.phase_id = PH.id
	LEFT OUTER JOIN Diff D ON R.diff_id = D.id
WHERE PY.exhibition = FALSE
GROUP BY PH.tournament_code, PL.id, PL.question_id, R.response_type_code;
GRANT SELECT ON Placement_Conversion_v TO scobolsolo;


CREATE OR REPLACE VIEW Category_Conversion_v AS
SELECT
	PH.tournament_code,
	PL.category_code,
	R.response_type_code,
	COUNT(*) AS response_type_count,
	AVG(1.0 * R.word_end_index / D.text_length) AS average_buzz_depth
FROM Placement PL
	JOIN Response_v R ON R.actual_placement_id = PL.id
	JOIN Performance P ON R.performance_id = P.id
	JOIN Player PY ON P.player_id = PY.id
	JOIN Game G ON P.game_id = G.id
	JOIN Match M ON G.id = M.id
	JOIN Round RD ON M.round_id = RD.id
	JOIN Phase PH ON RD.phase_id = PH.id
	LEFT OUTER JOIN Question Q ON PL.question_id = Q.id
	LEFT OUTER JOIN Diff D ON R.diff_id = D.id
WHERE PY.exhibition = FALSE
GROUP BY PH.tournament_code, PL.category_code, R.response_type_code;
GRANT SELECT ON Category_Conversion_v TO scobolsolo;

CREATE OR REPLACE VIEW Upcoming_Match_v AS
SELECT M.*
FROM Match M
	LEFT OUTER JOIN Game G ON M.id = G.id
WHERE G.id IS NULL OR (G.outgoing_winning_card_player_id IS NULL AND G.outgoing_losing_card_player_id IS NULL);
GRANT SELECT ON Upcoming_Match_v TO scobolsolo;
