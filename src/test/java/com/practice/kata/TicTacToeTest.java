package com.practice.kata;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TicTacToeTest {
    @Test
    public void shouldStartWithAnEmptyBoard(){
        TicTacToe ticTacToe = new TicTacToe();
        GameBoard gameBoard = ticTacToe.startGame();
        assertTrue(gameBoard.isEmpty());
    }

    @Test
    public void shouldMarkFirstTurnAsX(){
        TicTacToe ticTocToe = new TicTacToe();
        GameBoard gameBoard = ticTocToe.startGame();
        ticTocToe.play(2,2);
        Assert.assertEquals('X',gameBoard.getTokenAt(2,2));
    }
}
