import java.util.Arrays;

public class leetcode_213_House_Robber_II_ {
    public static void main(String args[]) {

        int[] height = { 1, 2, 3 };
        System.out.println(rob(height));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int dp1[] = new int[nums.length];
        Arrays.fill(dp1, -1);
        int dp2[] = new int[nums.length];
        Arrays.fill(dp2, -1);
        int leavingLastHouse = (rob2(nums, nums.length - 2, dp1));
        int[] arr2 = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            arr2[i] = nums[i + 1];
        }
        int leavingFirstHouse = (rob2(arr2, arr2.length - 1, dp2));
        return Math.max(leavingLastHouse, leavingFirstHouse);
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
