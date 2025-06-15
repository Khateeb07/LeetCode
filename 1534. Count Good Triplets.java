class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    int c1=(arr[i]-arr[j])>0 ? arr[i]-arr[j] : arr[j]-arr[i];
                    int c2=(arr[j]-arr[k])>0 ? arr[j]-arr[k] : arr[k]-arr[j];
                    int c3=(arr[i]-arr[k])>0 ? arr[i]-arr[k] : arr[k]-arr[i];
                    if(c1<=a && c2<=b && c3<=c)
                        count++;
                }
            }
        }
        return count;
    }
}