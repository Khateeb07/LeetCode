class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0, j=height.length-1;
        while(i<j) {
            int breadth=height[i]>height[j] ? height[j] : height[i];
            int length=j-i;
            int area=length*breadth;
            if(area>max) max=area;
            if(height[i]>height[j]) {
                j--;
            } else i++;
        }
        return max;
    }
}