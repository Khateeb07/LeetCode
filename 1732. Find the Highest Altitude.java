class Solution {
    public int largestAltitude(int[] gain) {
        if(gain.length==0) return 0;
        int[] altitudes=new int[gain.length+1];
        altitudes[0]=0;
        int sum=0;
        for(int i=0; i<gain.length; i++) {
            sum+=gain[i];
            altitudes[i+1]=sum;
        }
        int max=0;
        for(int i=0; i<altitudes.length; i++) {
            if(altitudes[i]>max)
                max=altitudes[i];
        }
        return max>=0 ? max : 0;
    }
}
