class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums [0];
        }
        int dp1[]= new int[n+1];
        Arrays.fill(dp1,-1);
        int dp2[]= new int[n+1];
        Arrays.fill(dp2,-1);
        int case1 = helper(nums , dp1 , 0 , n-2);
        int case2 = helper(nums , dp2 , 1 , n-1);
        return Math.max(case1 , case2);
    }
    public int helper(int nums[] , int dp[] , int st , int en){

        if (st > en) {
            return 0;
        }
        if (dp[st] != -1) {
            return dp[st];
        }
        int inc = nums[st] + helper(nums , dp , st+2 , en);
        int exc = helper(nums , dp , st+1 , en);
        dp[st] = Math.max(inc , exc);
        return dp[st];
    }
}