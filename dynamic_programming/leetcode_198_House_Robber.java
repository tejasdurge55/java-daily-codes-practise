import java.util.Arrays;

public class leetcode_198_House_Robber {
    public static void main(String args[]) {

        int[] height = { 2, 7, 9, 3, 1 };
        System.out.println(rob(height));
    }

    public static int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);

        return (rob2(nums, nums.length - 1, dp));

    }

    public static int rob2(int[] nums, int N, int[] dp) {
        if (N < 0) {
            return 0;
        }
        if (dp[N] == -1) {

            int pick = nums[N] + rob2(nums, N - 2, dp);
            int notPick = rob2(nums, N - 1, dp);
            dp[N] = Math.max(pick, notPick);
        }
        return dp[N];
    }

}
