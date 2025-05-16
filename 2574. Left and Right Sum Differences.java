class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer=new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int j=0, k=i+1, leftSum=0, rightSum=0;
            while(j<i) leftSum+=nums[j++];
            while(k<nums.length) rightSum+=nums[k++];
            answer[i]=Math.abs(leftSum-rightSum);
        }
        return answer;
    }
}