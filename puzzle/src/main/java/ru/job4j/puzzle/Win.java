package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board) {
        boolean result = true;
        int row = 0;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
            row++;
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = true;
        int column = 0;
        for (int row = 0; row < board[column].length; row++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
            column++;
        }
        return result;
    }

    public static boolean isMono(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if ((monoHorizontal(board)) || (monoVertical(board))) {
                    result = true;
                    break;
                }
            }
        return result;
    }
}
