class Solution {
    public int numIdenticalPairs(int[] nums) {
        int gpCount=0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(i<j && nums[i]==nums[j])
                    gpCount++;
            }
        }
        return gpCount;
    }
}