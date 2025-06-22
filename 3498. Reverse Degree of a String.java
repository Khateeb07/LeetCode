class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0; i<s.length(); i++) {
            int revIndex=123-((int)s.charAt(i));
            int product=(i+1)*revIndex;
            sum+=product;
        }
        return sum;
    }
}
