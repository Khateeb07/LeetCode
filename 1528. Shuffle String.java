class Solution {
    public String restoreString(String s, int[] indices) {
        String result="";
        for(int i=0; i<indices.length; i++) {
            int j=0;
            while(indices[j++]!=i);
            result+=s.charAt(--j);
        }
        return result;
    }
}