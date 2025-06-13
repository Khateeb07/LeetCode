class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result=0;
        for(int i=0; i<nums.size(); i++) {
            int count1=0;
            int temp=i;
            while(temp>0) {
                if((temp&1)==1) count1++;
                temp=temp>>1;
            }
            if(count1==k)
                result+=nums.get(i);
        }
        return result;
    }
}