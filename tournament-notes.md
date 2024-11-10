# Question futzing
* Change `--` and `---` to proper em dashes (or en dashes if appropriate).
* Change straight double quotes to curly quotes, in both question text and answer lines. There will still be some straight double quotes because of umlauts.
* Check question text _and answer lines_ for these strings that are usually incorrect:
	* `--`
	* `"` (okay if `\"`)
	* `,”`
	* `.”` (okay if the enquoted text is a complete sentence [or multiple sentences])
	* `, “` (okay if a comma would go there if the enquoted text were replaced by unenquoted text)
* Make sure the question descriptions are presentable, since they will eventually be shown publicly.
* Use the "Render All" page to verify that everything renders with no explicit errors and no obvious problems. (Search the page for `Couldn’t convert`, and consider also scanning it visually.)
* Skim the PDFs to make sure the questions render correctly that way too. Pay more attention to the Championship Match questions, since those will actually be read from PDFs in the normal course of events.

# Before emailing staff with instructions
* Make sure they all have _active_ accounts. This means activating the accounts of people who already had them and creating new accounts for people who didn't.
* Update `web/instructions/index.jsp` and `web/instructions/championship-match.jsp` if necessary (at least update the year in the menu)

# Before the tournament
* On the tournament-edit page:
	* Make sure the control room is set
	* Make sure registration is closed
	* Make sure all packets are assigned to rounds, including replacement sources
	* Check "Online Stats?"
* Make sure that the school, player, and staff messages are accurate (including wifi password, control room, etc.).
* Make sure cards that end 5–2 or better have final messages about the championship match. Maybe we want to do this for all cards (e.g., to advertise the awards ceremony).
* Back up the database.
* Run the database maintenance "queries".

# Early the morning of the tournament
* Restart the server so that the cached menu updates.
* Shut down as many other services running on the same server as possible (e.g., Masonic and maybe the development instance of the Solo app).
* Back up the database.

# At the tournament
* Make sure there are printed copies of all questions in the control room.
* Make sure a buzzer system is available and set up for the championship match in advance (and that it can be kept until the finals end).
* Make sure there's a _single-sided_ printed copy of the championship-match questions for buzzpoint tracking (in addition to the moderator's copy if they plan to read from paper).
* Make sure notes are kept at the award ceremony on which category winners did not pick up their ribbon.

# After the tournament
* Set player ranks.
* Post a wrap-up.
* Post the championship match scoresheet and set the value of `Tournament.championship_match_url` accordingly.
* Re-enable disabled sites on the same server.
* Restart the server the day after the tournament so that the cached menu updates.
* Archive messages so they won't still show up next year.
* Deactivate contacts who just finished their senior year.
* Deactivate other contacts who should, in your judgment, be deactivated (e.g., retiring coaches, former staff who haven't worked in a long time).
* Deactivate all accounts except Reinstein's and Jonah's.
* Back up the database.
* Run the database maintenance "queries".
* Update the QBWiki, including the pain-in-the-neck records portion.
