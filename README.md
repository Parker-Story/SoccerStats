### SoccerStats Java Program

## Table of Contents

1. [Introduction](#1-introduction)
2. [Getting Started](#2-getting-started)
3. [File Requirements](#3-file-requirements)
4. [Sample Input and Output]()

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
Example requests file: [Download Requests File]()

The text file for instructions/requests must contain one request per line, with possible requests being:

* STATS team
* BEST
* HSCORING


## 4. Sample Input and Output

Sample input file contents and corresponding output:
 
Input (requests.txt):

STATS Borussia Dortmund
STATS Schalke 04
STATS ULM Warhawks
BEST
HSCORING

Output (match_data.csv):

TEAM: Borussia Dortmund W: 0 D: 0 L: 1 GF: 2 GA: 3 PTS: 0
TEAM: Schalke 04 W: 1 D: 0 L: 0 GF: 2 GA: 0 PTS: 3
TEAM: ULM Warhawks NOT FOUND
BEST: Meidericher SV W: 1 D: 0 L: 0 GF: 4 GA: 1 PTS: 3
HIGH SCORERS: NONE
