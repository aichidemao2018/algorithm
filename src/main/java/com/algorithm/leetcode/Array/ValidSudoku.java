package com.algorithm.leetcode.Array;

/**
 * 有效的数独
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] boards) {
        //存放行 对应的数字
        int row[][] = new int[9][9];
        //存放列对应的数字
        int column[][] = new int[9][9];
        //存放9个方块内不同数字的出现次数
        int shuzuboard[][][] = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char board = boards[i][j];
                if (board != '.') {

                    int index = board - '0' - 1;

                    row[i][index]++;
                    column[j][index]++;
                    shuzuboard[i / 3][j / 3][index]++;
                    if (row[i][index] > 1 || column[j][index] > 1 || shuzuboard[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
