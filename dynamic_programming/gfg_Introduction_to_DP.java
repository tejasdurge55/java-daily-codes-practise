
public class gfg_Introduction_to_DP {
    // basic fibonaaci code using recursion
    /*
     * public static void main(String args[]) {
     * int n = 20;
     * System.out.println(topDown(n));
     * }
     * 
     * public static long topDown(int n) {
     * if (n == 1 || n == 0) {
     * return n;
     * }
     * long left = topDown(n - 1);
     * long right = topDown(n - 2);
     * return (left + right);
     * }
     */

    // fibonaaci code using dp Memoization
    /*
     * public static void main(String args[]) {
     * int n = 60;
     * long dp[] = new long[n + 1];
     * System.out.println(topDown(n, dp));
     * }
     * 
     * public static long topDown(int n, long dp[]) {
     * 
     * if (n == 1 || n == 0) {
     * return n;
     * }
     * if (dp[n] == 0) {
     * long ans = (topDown(n - 1, dp) + topDown(n - 2, dp));
     * dp[n] = ans;
     * return ans;
     * } else {
     * return dp[n];
     * }
     * }
     */

    // fibonaaci code using dp Tabulation
    /*
     * public static void main(String args[]) {
     * int n = 60;
     * long dp[] = new long[n + 1];
     * System.out.println(bottomUp(n, dp));
     * }
     * 
     * static long bottomUp(int n, long dp[]) {
     * dp[0] = 0;
     * dp[1] = 1;
     * for (int i = 2; i <= n; i++) {
     * dp[i] = dp[i - 1] + dp[i - 2];
     * }
     * return dp[n];
     * }
     */

    // fibonaaci code using dp Tabulation ans space optimization

    public static void main(String args[]) {
        int n = 6;
        System.out.println(bottomUp(n));
        System.out.println(topDown(n));

    }

    static long topDown(int n) {

        long dp[] = new long[n + 1];
        return (topDown2(n, dp));

    }

    static long topDown2(int n, long dp[]) {
        if (n == 1 || n == 0) {
            return n;
        }
        if (dp[n] == 0) {
            long ans = (topDown2(n - 1, dp) + topDown2(n - 2, dp));
            dp[n] = ans;
            return ans;
        } else {
            return dp[n];
        }
    }

    static long bottomUp(int n) {
        long prev2 = 0;
        long prev = 1;
        for (int i = 2; i <= n; i++) {
            long current = prev + prev2;
            prev2 = prev;
            prev = current;

        }
        return prev;
    }
}