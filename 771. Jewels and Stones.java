class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0; i<jewels.length(); i++) {
            int ch1=(int)jewels.charAt(i);
            for(int j=0; j<stones.length(); j++) {
                int ch2=(int)stones.charAt(j);
                if(ch1==ch2) count++;
            }
        }
        return count;
    }
}