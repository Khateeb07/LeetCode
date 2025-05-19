class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(map.get(ch)!=null) {
                int freq=map.get(ch)+1;
                map.put(ch, freq);
            } else {
                map.put(ch, 1);
            }
        }
        int maxVowelFreq=0;
        int maxConsFreq=0;
        for(Character key : map.keySet()) {
            int freq=map.get(key);
            if((key=='a' || key=='e' || key=='i' || key=='o' || key=='u') && maxVowelFreq<freq)
                maxVowelFreq=freq;
            else if((key!='a' && key!='e' && key!='i' && key!='o' && key!='u') && maxConsFreq<freq)
                maxConsFreq=freq;
        }
        return maxVowelFreq+maxConsFreq;
    }
}