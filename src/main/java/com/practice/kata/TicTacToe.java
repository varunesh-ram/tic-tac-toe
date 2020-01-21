package com.practice.kata;

public class TicTacToe {
    private GameBoard gameBoard;

    public GameBoard startGame() {
        gameBoard = new GameBoard();
        return gameBoard;
    }

    public void play(int column, int row) {
        gameBoard.mark(column,row);
    }
}
