import java.util.*;

class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }

    private boolean isPrime(int num) {
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}