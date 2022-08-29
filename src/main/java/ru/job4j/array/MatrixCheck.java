package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i < row + 1; i++) {
            for (int j = 0; j < board[row].length - 1; j++) {
                if (board[row][j] == ' ') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
