# TicTacToe
===========

Rules
* a game has nine fields in a 3x3 grid
* there are two players in the game (X and O)
* a player can take a field if not already taken
* players take turns taking fields until the game is over
  * a game is over when all fields in a row are taken by a player
  * a game is over when all fields in a column are taken by a player
  * a game is over when all fields in a diagonal are taken by a player
  * a game is over when all fields are taken
  
# Purpose

  This game is developed using Java programming language to practise pair programming, Test Driven Development approach and solid principles.
 

# Functional cases:
- Player take alternate turns
-  players can't take already occupied field
-  Game Over on below 17 Conditions
  1) Player 1 (X) wins by taking all fields in 1st row first
  2) Player 1 (X) wins by taking all fields in 2nd row first
  3) Player 1 (X) wins by taking all fields in 3rd row first
  4) Player 1 (X) wins by taking all fields in 1st column first
  5) Player 1 (X) wins by taking all fields in 2nd column first
  6) Player 1 (X) wins by taking all fields in 3rd column first
  7) Player 1 (X) wins by taking all fields in top-left to bottom-right diagonal first
  8) Player 1 (X) wins by taking all fields in top-right to bottom-left diagonal first

  9) Player 2 (O) wins by taking all fields in 1st row first
  10) Player 2 (O) wins by taking all fields in 2nd row first
  11) Player 2 (O) wins by taking all fields in 3rd row first
  12) Player 2 (O) wins by taking all fields in 1st column first
  13) Player 2 (O) wins by taking all fields in 2nd column first
  14) Player 2 (O) wins by taking all fields in 3rd column first
  15) Player 2 (O) wins by taking all fields in top-left to bottom-right diagonal first
  16) Player 2 (O) wins by taking all fields in top-right to bottom-left diagonal first

  17) Players taking all 9 fields without falling in above 16 cases - no win


# Prerequisites
To run this program below softwares needs to be installed
```
Java - Version 1.8 or above
Maven - For Dependency management
JUnit - Version 4.13 (added dependency in pom.xml)
Any IDE which supports Java
```