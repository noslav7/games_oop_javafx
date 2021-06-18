package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (board[0][0] == 1 && board[0][1] == 1 & board[0][2] == 1 && board[0][3] == 1 && board[0][4] == 1) {
            rsl = true;
        } else if (board[1][0] == 1 && board[1][1] == 1 & board[1][2] == 1 && board[1][3] == 1 && board[1][4] == 1) {
            rsl = true;
        } else if (board[2][0] == 1 && board[2][1] == 1 & board[2][2] == 1 && board[2][3] == 1 && board[2][4] == 1) {
            rsl = true;
        } else if (board[3][0] == 1 && board[3][1] == 1 & board[3][2] == 1 && board[3][3] == 1 && board[3][4] == 1) {
            rsl = true;
        } else if (board[4][0] == 1 && board[4][1] == 1 & board[4][2] == 1 && board[4][3] == 1 && board[4][4] == 1) {
            rsl = true;
        } else if (board[0][0] == 1 && board[1][0] == 1 & board[2][0] == 1 && board[3][0] == 1 && board[4][0] == 1) {
            rsl = true;
        } else if (board[0][1] == 1 && board[1][1] == 1 & board[2][1] == 1 && board[3][1] == 1 && board[4][1] == 1) {
            rsl = true;
        } else if (board[0][2] == 1 && board[1][2] == 1 & board[2][2] == 1 && board[3][2] == 1 && board[4][2] == 1) {
                rsl = true;
        } else if (board[0][3] == 1 && board[1][3] == 1 & board[2][3] == 1 && board[3][3] == 1 && board[4][3] == 1) {
            rsl = true;
        } else if (board[0][4] == 1 && board[1][4] == 1 & board[2][4] == 1 && board[3][4] == 1 && board[4][4] == 1) {
            rsl = true;
        }
            return rsl;
    }
}
