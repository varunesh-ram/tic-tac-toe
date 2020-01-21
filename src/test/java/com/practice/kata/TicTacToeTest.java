package com.practice.kata;

import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {
    @Test
    public void shouldStartWithAnEmptyBoard(){
        GameBoard gameBoard = new GameBoard();
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.startGame();
        Assert.assertTrue(gameBoard.isEmpty());
    }
}
