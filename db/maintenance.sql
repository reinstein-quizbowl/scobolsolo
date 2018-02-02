$ psql -U jonah -W -d scobolsolo
(enter password)
reindex database scobolsolo;
vacuum full;
analyze;
\q

