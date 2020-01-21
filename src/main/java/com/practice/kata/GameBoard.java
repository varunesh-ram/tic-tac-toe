package com.practice.kata;

public class GameBoard {
    private char[][] layout;

    public GameBoard() {
        this.layout = new char[3][3];
    }

    public boolean isEmpty() {
        for (int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                if (layout[i][j] != '\0')
                    return false;
        return true;
    }
}
