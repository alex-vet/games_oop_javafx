package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 1) {
                if (checkVertical(board,row) || checkHorizontal(board,row)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkHorizontal(int[][] board,int row) {
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkVertical(int[][] board, int column) {
        for (int[] row : board) {
            if (row[column] != 1) {
                return false;
            }
        }
        return true;
    }
}
