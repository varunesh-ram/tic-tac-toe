package com.practice.kata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TicTacToeTest {
    @Test
    public void shouldStartWithAnEmptyBoard(){
        TicTacToe ticTacToe = new TicTacToe();
        GameBoard gameBoard = ticTacToe.startGame();
        assertTrue(gameBoard.isEmpty());
    }
}
