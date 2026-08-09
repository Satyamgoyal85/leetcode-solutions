class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actual_sum= n*(n+1)/2;
        int given_sum=0;
        for (int sum:nums){
            given_sum+=sum;
        }
        return actual_sum-given_sum;
    }
}