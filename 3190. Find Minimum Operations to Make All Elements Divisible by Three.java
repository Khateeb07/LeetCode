class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%3==2) {
                count++;
            } else if(nums[i]%3==1) {
                count++;
            }
        }
        return count;
    }
}