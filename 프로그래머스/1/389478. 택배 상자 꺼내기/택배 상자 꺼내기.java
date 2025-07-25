class Solution {
    public int solution(int n, int w, int num) {
                int[] top = new int[w];
        int height = n / w;
        if (n % w == 0) {
            height--;
        }

        int numH = (num - 1) / w;
        int numW = num - w * (numH) - 1;
        if (numH % 2 != 0) {
            numW = w - numW - 1;
        }
        if (height == numH) {
            return 1;
        }

        int left = n % w;

        if (n % w == 0) {
            left = w;
        }

        if (height % 2 == 0) {
            for (int i = 0; i < left; i++) {
                top[i] = 1;
            }
        } else {
            for (int i = w - 1; left-- > 0; i--) {
                top[i] = 1;
            }
        }

        if (top[numW] == 0) {
            return height - numH;
        }

        return height - numH + 1;
    }
}