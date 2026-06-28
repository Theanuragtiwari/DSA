class Solution {
    public int rob(int[] nums) {
        int [] dp = new int[nums.length +1];
        Arrays.fill(dp, -1);
        return robHouse(0, nums, dp);
    }
    private int robHouse(int i , int[] nums, int[] dp){
        if ( i >= nums.length){
            return 0;
        }
        if ( dp[i] != -1){
            return dp[i];
        }
        int rob = nums[i] + robHouse(i +2, nums, dp);
        int skip = robHouse( i+1 , nums , dp);
        return dp[i] = Math.max(rob , skip);
    }
}