class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i<heights.length-1; i++) {
            int max=0, pos=0;
            for(int j=i; j<heights.length; j++) {
                if(heights[j]>max) {
                    max=heights[j];
                    pos=j;
                }
            }
            heights[pos]=heights[i];
            heights[i]=max;
            String temp=names[pos];
            names[pos]=names[i];
            names[i]=temp;
        }
        return names;
    }
}
