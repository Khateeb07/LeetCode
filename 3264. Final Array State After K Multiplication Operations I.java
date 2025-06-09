class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; k>0; k--, i++) {
            if(i==nums.length) i=0;
            int min=nums[0];
            int minPos=0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j]<min) {
                    min=nums[j];
                    minPos=j;
                }
            }
            nums[minPos]*=multiplier;
        }
        return nums;
    }
}