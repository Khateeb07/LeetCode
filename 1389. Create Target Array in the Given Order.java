class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result=new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int val=nums[i];
            int pos=index[i];
            if(i!=pos) {
                int k=i;
                while(k>pos) {
                    result[k]=result[k-1];
                    k--;
                }
            }
            result[pos]=val;
        }
        return result;
    }
}