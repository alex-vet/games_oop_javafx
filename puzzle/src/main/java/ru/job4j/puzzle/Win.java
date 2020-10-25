package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int[] row : board) {
            for (int index = 0; index < row.length; index++) {
                if (checkVertical(board,index)) {
                    return true;
                }
            }
            if (checkHorizontal(row)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkHorizontal(int[] row) {
        boolean rsl = true;
        for (int el : row) {
            if (el != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    private static boolean checkVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int[] row : board) {
            if (row[column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
