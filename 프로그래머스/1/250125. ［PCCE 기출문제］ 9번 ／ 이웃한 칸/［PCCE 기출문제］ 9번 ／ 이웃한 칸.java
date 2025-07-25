import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int hCheck = h + dh[i];
            int wCheck = w + dw[i];

            if (0 <= hCheck && hCheck < board.length && 0 <= wCheck && wCheck < board[0].length) {
                if (Objects.equals(board[h][w], board[hCheck][wCheck])) {
                    count++;
                }
            }
        }

        return count;
    }
}