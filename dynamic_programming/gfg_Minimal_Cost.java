import java.util.Arrays;

public class gfg_Minimal_Cost {
    // basic code using recursion,it similar to gfg_Geek_Jump code

    public static void main(String args[]) {

        int k = 3;
        int[] height = { 10, 30, 40, 50, 20 };
        int n = height.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(minimumEnergy(height, n - 1, k, dp));
    }

    public static int minimumEnergy(int arr[], int N, int k, int dp[]) {
        if (dp[N] == -1) {
            int min = Integer.MAX_VALUE;

            if (N == 0) {
                return 0;
            }
            for (int i = 1; i <= k; i++) {
                if (N - i >= 0) {
                    int recursiveMin = minimumEnergy(arr, N - i, k, dp) + Math.abs(arr[N] - arr[N - i]);
                    min = Math.min(recursiveMin, min);
                }
            }
            dp[N] = min;
        }
        return dp[N];
    }
}
