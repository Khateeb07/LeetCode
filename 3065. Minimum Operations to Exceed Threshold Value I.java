class Solution {
    public int minOperations(int[] nums, int k) {
        int minOperations=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<k) minOperations++;
        }
        return minOperations;
    }
}