\ProvidesClass{scobolsolo}[2014/09/14 version 1.0]
\NeedsTeXFormat{LaTeX2e}
\DeclareOption*{\PassOptionsToClass{\CurrentOption}{article}}
\ProcessOptions\relax
\LoadClass[11pt]{article}

\RequirePackage[
		colorlinks,
		linkcolor=black,
		urlcolor=black,
		citecolor=black,
		linktoc=none,
		bookmarks=false,
		bookmarksopen=false,
		pdfauthor={New Trier Scobol Solo}
	]{hyperref}
	\def\UrlFont{\em}

\RequirePackage[T1]{fontenc}
\RequirePackage{lmodern}
\RequirePackage{longtable}
\RequirePackage{makecell}
\RequirePackage{multicol}
\RequirePackage{paralist}
\RequirePackage{enumitem}
\RequirePackage{transparent}

\RequirePackage[table]{xcolor}
	\definecolor{gray}{gray}{0.8}

\RequirePackage{graphicx}
\RequirePackage{etoolbox}
\RequirePackage[none]{hyphenat}
\frenchspacing

\RequirePackage{array}
	\newcolumntype{C}[1]{>{\centering\hspace{0pt}}m{#1}}

\RequirePackage{amsmath} % \nobreakdash
\RequirePackage[normalem]{ulem}
	\setlength\ULdepth{2pt}

\RequirePackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}

\RequirePackage{titlesec}
	\titlespacing\section{0pt}{0pt}{-8pt}
	\titlespacing\subsection{0pt}{0pt}{-8pt}
	\titlespacing\subsubsection{0pt}{0pt}{0pt}

\RequirePackage{draftwatermark}
	\SetWatermarkText{\includegraphics{nt-logo-background.pdf}}
	\SetWatermarkAngle{0}

\setlength\parindent{0pt}
\setlength\parskip{7pt}

\newlength{\RegularSize}	\setlength\RegularSize{12pt}
\newlength{\RegularLH}		\setlength\RegularLH{14.5pt}
\newcommand{\NormalFont}{\fontsize{\RegularSize}{\RegularLH}\selectfont}

\newcommand{\TournamentTitle}[1]{\fontsize{36pt}{40pt}\selectfont \textbf{#1} \NormalFont}
\newcommand{\Subtitle}[1]{\fontsize{24pt}{32pt}\selectfont \textbf{#1} \NormalFont}
\newcommand{\CardNumberHeader}[1]{\textbf{\fontsize{160pt}{172pt}\selectfont #1} \NormalFont}
\newcommand{\RoomHeader}[1]{\textbf{\fontsize{84pt}{96pt}\selectfont #1} \NormalFont}
\newcommand{\InitialPossessor}[1]{Initial Possessor: #1}
\newcommand{\CardTradingInstructionsForPlayer}[2]{
	Before each match, the players give their cards to the moderator. \\
	After each match, the winner takes the card closer to #1 \\
	and the loser takes the card closer to #2. \\
	Players then follow their new cards.
}
\newcommand{\CardTradingInstructionsForRoom}[2]{
	Before each match, collect the players' cards and verify that both players are in the correct room. \\
	\emph{Make sure that players are in the correct rooms before beginning each match.} \\
	\emph{If the wrong pairings play, there is no fair way for the tournament to recover.} \\
	After each match, give the card closer to #1 to the winner \\
	and the card closer to #2 to the loser. \\
	Players then follow their new cards.
}
\newcommand{\ColumnHeader}[1]{\color{white} \textbf{#1}}
\newcommand{\SmallColumnHeader}[1]{\color{white} \fontsize{8pt}{9pt}\selectfont #1 \NormalFont}
\newcommand{\RoundNumber}[1]{#1}
\newcommand{\RoundTime}[1]{#1}
\newcommand{\RoomNumber}[1]{#1}
\newcommand{\OpponentCard}[1]{#1}
\newcommand{\CardBye}[1]{\textit{bye}}
\newcommand{\NoMatchForRoom}[1]{\textit{no match}}
\newcommand{\CardLunchLine}[1]{\multicolumn{2}{c}{\textbf{Lunch}} & \multicolumn{2}{c}{\textit{go to the cafeteria}} \tabularnewline}
\newcommand{\RoomLunchLine}[1]{\multicolumn{2}{c}{\textbf{Lunch}} & \multicolumn{2}{c}{\textit{go to the cafeteria}} \tabularnewline}
\newcommand{\CardFinalMessage}[1]{\fontsize{16pt}{20pt}\selectfont\textbf{#1}}

\pagestyle{empty}

% For transparency
\makeatletter
\def\CT@@do@color{%
  \global\let\CT@do@color\relax
        \@tempdima\wd\z@
        \advance\@tempdima\@tempdimb
        \advance\@tempdima\@tempdimc
        \kern-\@tempdimb
\transparent{0.5}%
        \leaders\vrule
                \hskip\@tempdima\@plus  1fill
        \kern-\@tempdimc
        \hskip-\wd\z@ \@plus -1fill }
\makeatother
