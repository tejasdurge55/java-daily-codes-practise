import java.util.Arrays;

public class gfg_Geek_Jump {
    // basic gfg_Geek_Jump code using recursion,it similar to fibonnaci numbers

    // public static void main(String args[]) {
    // int n = 4;
    // int[] height = { 10, 20, 30, 15 };
    // System.out.println(minimumEnergy(height, n - 1));
    // }

    // public static int minimumEnergy(int arr[], int N) {
    // int Twostep = Integer.MAX_VALUE;
    // if (N == 0) {
    // return 0;
    // }
    // int Onestep = minimumEnergy(arr, N - 1) + Math.abs(arr[N] - arr[N - 1]);
    // if (N > 1) {
    // Twostep = minimumEnergy(arr, N - 2) + Math.abs(arr[N] - arr[N - 2]);
    // }
    // return Math.min(Onestep, Twostep);

    // }

    // converting above problem to memoization using dp array

    public static void main(String args[]) {
        int n = 4;
        int[] height = { 10, 20, 30, 10 };
        int[] dp = new int[height.length];
        Arrays.fill(dp, -1);
        System.out.println(minimumEnergy(height, n - 1, dp));
    }

    public static int minimumEnergy(int arr[], int N, int dp[]) {

        if (dp[N] == -1) {
            int Twostep = Integer.MAX_VALUE;
            if (N == 0) {
                return 0;
            }
            int Onestep = minimumEnergy(arr, N - 1, dp) + Math.abs(arr[N] - arr[N - 1]);
            if (N > 1) {
                Twostep = minimumEnergy(arr, N - 2, dp) + Math.abs(arr[N] - arr[N - 2]);
            }
            dp[N] = Math.min(Onestep, Twostep);
        }
        return dp[N];

    }

}
