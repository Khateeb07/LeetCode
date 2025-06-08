class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C=new int[A.length];
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            int count=0;
            l.add(A[i]);
            for(int j=0; j<=i; j++) {
                if(l.contains(B[j])) {
                    count++;
                }
            }
            C[i]=count;
        }
        return C;
    }
}