package com.practice.kata;

public class GameBoard {
    private char[][] layout;

    public GameBoard() {
        this.layout = new char[3][3];
    }

    public boolean isEmpty() {
        for (int column = 0; column < 3; column++)
            for(int row = 0; row < 3; row++)
                if (layout[column][row] != '\0')
                    return false;
        return true;
    }

    public void mark(int column, int row) {
        layout[column][row] = 'X';
    }

    public char getTokenAt(int column, int row) {
        return layout[column][row];
    }
}
