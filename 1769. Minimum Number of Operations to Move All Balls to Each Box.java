class Solution {
    public int[] minOperations(String boxes) {
        int[] result=new int[boxes.length()];
        for(int i=0; i<boxes.length(); i++) {
            int moves=0;
            for(int j=0; j<boxes.length(); j++) {
                char ch=boxes.charAt(j);
                if(ch=='1')
                    moves+=Math.abs(i-j);
            }
            result[i]=moves;
        }
        return result;
    }
}