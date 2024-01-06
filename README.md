### SoccerStats Java Program

## Table of Contents

1. [Introduction](#1-introduction)
2. [Getting Started](#2-getting-started)
3. [File Requirements](#3-file-requirements)
4. [Sample Input and Output](#4-sample-input-and-output)
5. [Important Notes](#5-important-notes)

## 1. Introduction 

This Java program, SoccerStats, is designed to manage and analyze soccer league statistics based on game scores provided in a comma-separated (.csv) file. The program calculates and displays team records and various statistics. This README provides essential information on using the program, file requirements, and an overview of the provided classes.

## 2. Getting Started

To use this program,

Download the [Team.java]() and [SoccerStats.java]() files.
Ensure you have a valid CSV file with match data (e.g., match_data.csv).

Create a text file containing requests for league statistics (e.g., requests.txt).

## 3.  File Requirements

The CSV file must have the following format:

** Home Team, Away Team, Home Goals, Away Goals ** 

Example CSV file: [Download CSV]()

The text file for instructions/requests must contain one request per line, with possible requests being:

* STATS team
* BEST
* HSCORING

Example requests file: [Download Requests File]()


## 4. Sample Input and Output

Sample input file contents and corresponding output:
 
requests.txt:

STATS Borussia Dortmund
STATS Schalke 04
STATS ULM Warhawks
BEST
HSCORING

match_data.csv:

Werder Bremen,Borussia Dortmund,3,2-   
Hertha BSC Berlin,1. FC Nuernberg,1,1-  
Preussen Muenster,Hamburger SV,1,1-  
Eintracht Frankfurt,1. FC Kaiserslautern,1,1-  
Karlsruher SC,Meidericher SV,1,4-  
<pre>text1. FC Saarbruecken,1. FC Koeln,1,3-  </pre>
TSV 1860 Muenchen,Eintracht Braunschweig,1,1-  
Schalke 04,VfB Stuttgart,2,0-  
Borussia Dortmund,TSV 1860 Muenchen,3,3-  
<pre>1. FC Nuernberg,Werder Bremen,3,0- </pre>
Hamburger SV,1. FC Saarbruecken,4,2-  
<pre>1. FC Kaiserslautern,Schalke 04,2,3- </pre>
Meidericher SV,Eintracht Frankfurt,3,1-  
</pre>1. FC Koeln,Karlsruher SC,6,3-  </pre>
Eintracht Braunschweig,Preussen Muenster,1,0-  
VfB Stuttgart,Hertha BSC Berlin,2,0-  
Werder Bremen,VfB Stuttgart,7,2-  
Hertha BSC Berlin,1. FC Kaiserslautern,2,2-  
Preussen Muenster,Meidericher SV,4,2-  
Eintracht Frankfurt,1. FC Nuernberg,2,3-  
Karlsruher SC,Hamburger SV,0,4-  
</pre>1. FC Saarbruecken,Eintracht Braunschweig,2,2-  </pre>
TSV 1860 Muenchen,1. FC Koeln,1,3-  
Schalke 04,Borussia Dortmund,6,1-  


Output:

TEAM: Borussia Dortmund W: 0 D: 1 L: 2 GF: 6 GA: 12 PTS: 1
TEAM: Schalke 04 W: 3 D: 0 L: 0 GF: 11 GA: 3 PTS: 9
TEAM: ULM Warhawks NOT FOUND
BEST: Schalke 04 W: 3 D: 0 L: 0 GF: 11 GA: 3 PTS: 9
HIGH SCORERS: 1. FC Koeln


## 5. Important Notes:

* Best Team Tie-Breakers:

The "Best" team is determined by the number of points earned by the team. If two teams have the same points earned then the tie-breakers are:
        * Largest goal differential (the difference between goal scored and goals allowed)
        * Most goals scored
(It is technically possible for a file to contain two teams that share all of the above criteria. At this time, this project cannot handle such cases. Beware.)

Thank you so much for taking the time to read through this and potentially use this software for something that benefits you! Please feel free to contact me via email if you have any questions: parkerglenn03@gmail.com
