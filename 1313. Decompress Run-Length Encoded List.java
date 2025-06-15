class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<nums.length; i+=2) {
            while(nums[i]>0) {
                arr.add(nums[i+1]);
                nums[i]--;
            }
        }
        int[] result=new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            result[i]=arr.get(i);
        }
        return result;
    }
}