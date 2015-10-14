\ProvidesClass{scobolsolopacket}[2015/10/13 version 1.0]
\NeedsTeXFormat{LaTeX2e}
\DeclareOption*{\PassOptionsToClass{\CurrentOption}{article}}
\ProcessOptions\relax
\LoadClass{article}
\RequirePackage[T1]{fontenc}
\RequirePackage[none]{hyphenat}           % prevent hyphenation
\RequirePackage{lmodern}
\RequirePackage{cmap}
\RequirePackage{fixltx2e}
\RequirePackage{microtype}                % makes things pretty
\RequirePackage[normalem]{ulem}           % makes \uline function give identical underlines to text with and without descenders
	\setlength{\ULdepth}{1.15pt}          % adjusts underline position
\RequirePackage[top=0.5in, bottom=0.7in, left=0.3in, right=0.5in]{geometry}
\setlength\parindent{0pt}
\RequirePackage{fancyhdr}                 % allows setting up the footer
	\pagestyle{fancy}
	\renewcommand{\footrulewidth}{0.33pt}
	\renewcommand{\headrulewidth}{0pt}
	\headheight=15pt                      % otherwise it throws warnings and makes it 16 points; this is the minimum possible
	\lfoot{\theTournament}
	\rfoot{\thePacket}
\RequirePackage{amsmath}                  % to get \nobreakdash
\RequirePackage{tipa}                     % additional accents
\RequirePackage{paralist}                 % compact lists
\RequirePackage{setspace}
\RequirePackage{calc}                     % easy number manipulation when setting lengths/widths
\RequirePackage{graphicx}                 % for including the arrow graphics
\RequirePackage{ocg-p}                    % for making the navigation arrows not print
% \RequirePackage{pdfcomment}               % for making the navigation arrows not print
\RequirePackage{ifthen}
\RequirePackage{xcolor}
\RequirePackage{xstring}                  % powermarking-related string manipulation
\RequirePackage{stringstrings}            % powermarking-related string manipulation
\RequirePackage[bookmarks = false]{hyperref}
\hypersetup{
	colorlinks,
	linkcolor = black,
	urlcolor = black,
	citecolor = black,
	linktoc = none,
	bookmarksopen = false
}

\renewcommand{\quote}[1]{``#1''}
\newcommand{\mintitle}[1]{``#1''}
\newcommand{\majtitle}[1]{\textit{#1}}
\newcommand{\foreignterm}[1]{\textit{#1}}
\newcommand{\courtcase}[1]{\textit{#1}}
\newcommand{\species}[1]{\textit{#1}}
\newcommand{\ship}[2]{#1~\textit{#2}}
\newcommand{\modnote}[1]{\textit{(#1)}}
\newcommand{\req}[1]{\uline{#1}}
\newcommand{\extra}[1]{(#1)}
\newcommand{\pg}[2]{\mbox{#1~\small\textcolor{teal}{[#2]}}}
\newcommand{\syl}{$\cdot$}                 % Enclose in {}, i.e. "Syl{\syl}la{\syl}ble", for the spacing to look right.

\newcommand{\question}[1]{#1}
\newcommand{\answer}[1]{\par\vspace*{3pt}Answer: #1}

\newenvironment{tossups}{ % argument is the first tossup number
	\thispagestyle{plain}
	\hspace{0.43in} % Spacer to make the headings line up with the actual question text instead of the question numbers
	\begin{minipage}[t]{6in}
		\fontsize{24pt}{32pt}\selectfont
		\textbf{\theTournament}\\
		\thePacket
	\end{minipage}
	\begin{minipage}[t]{1in}
		\vspace{-24pt}
		\includegraphics[keepaspectratio=true,width=1in]{"nt-logo"}
	\end{minipage}
}{
}

\newcommand{\regulationLabel}[1]{#1.}
\newcommand{\overtimeLabel}[1]{\textsuperscript{TB}#1.}

\newcommand{\scorecheck}{\textbf{\textit{Check the score.}}}
\newcommand{\scorecheckInOvertime}{\textbf{textit{If the score is still tied, continue. If it is not tied, the game is over.}}}
\newcommand{\packetOver}{\textbf{textit{This is the end of the packet.}}}
\newcommand{\regulationOver}{\textbf{textit{This is the end of regulation. Check the score. If it is tied, proceed to overtime tossups. If it is not tied, the game is over.}}}
\newcommand{\overtimeOver}{\textbf{textit{There are no more overtime questions available. If the score is still tied, contact the control room for further instructions.}}}

\newcommand{\altanswers}[1]{[#1]}

\newenvironment{tossup}[5]{ % arguments: #1 the placement ID, #2 the in-packet number, #3 the value 1 for overtime or 0 for regulation, #4 the previous placement ID if defined or -1 if not, #5 and the next placement ID if defined or -1 if not
	\par\vspace{12.5pt} % put some space between this and the previous tossup
	\hypertarget{#1}{}
	\begin{minipage}{\textwidth-5.22pt}
		\begin{minipage}[t]{0.4in}
			\begin{flushright}
				\ifthenelse{#3 = 1}{\overtimeLabel{#2}}{\regulationLabel{#2}}
			\end{flushright}
			\ifthenelse{#4 > -1}{ % i.e., if there is a previous placement
				\begin{ocg}[printocg=never]{navarrows}{navarrows}{1}\hyperlink{#4}{\includegraphics[keepaspectratio=true,width=0.6cm]{"up-arrow"}}\end{ocg}
			}{
			}\ifthenelse{#5 > -1}{ % i.e., if there is a next placement
				\begin{ocg}[printocg=never]{navarrows}{navarrows}{1}\hyperlink{#5}{\includegraphics[keepaspectratio=true,width=0.6cm]{"down-arrow"}}\end{ocg}
			}{
			}
		\end{minipage}
		\hspace{3pt}
		\begin{minipage}[t]{\textwidth-0.4in-5.22pt-3.1pt}
			\begin{spacing}{1.15}
}{
			\end{spacing}
		\end{minipage}
	\end{minipage}
}
