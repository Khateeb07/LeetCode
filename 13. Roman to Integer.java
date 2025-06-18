class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        String keys="IVXLCDM";
        int[] values={1, 5, 10, 50, 100, 500, 1000};
        for(int i=0; i<7; i++) {
            map.put(keys.charAt(i), values[i]);
        }
        int sum=0;
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='I' && i+1<s.length()) {
                if(s.charAt(i+1)=='V') {
                    sum+=4;
                    i++;
                    continue;
                } else if(s.charAt(i+1)=='X') {
                    sum+=9;
                    i++;
                    continue;
                }
            } else if(ch=='X' && i+1<s.length()) {
                if(s.charAt(i+1)=='L') {
                    sum+=40;
                    i++;
                    continue;
                } else if(s.charAt(i+1)=='C') {
                    sum+=90;
                    i++;
                    continue;
                }
            } else if(ch=='C' && i+1<s.length()) {
                if(s.charAt(i+1)=='D') {
                    sum+=400;
                    i++;
                    continue;
                } else if(s.charAt(i+1)=='M') {
                    sum+=900;
                    i++;
                    continue;
                }
            }
            sum+=map.get(ch);
        }
        return sum;
    }
}
