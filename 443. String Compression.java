class Solution {
    public int compress(char[] chars) {
        char ch1, ch2;
        int i=0, pos, freq=0;
        if(i==chars.length)
            return 0;
        ch1=chars[i];
        pos=i;
        while(i<chars.length) {
            ch2=chars[i];
            if(ch1!=ch2) {
                if(freq>9) {
                    chars[pos]=ch1;
                    int pow=1, temp=freq;
                    while(freq>9) {
                        pow*=10;
                        freq/=10;
                    } freq=0;
                    while(pow>0) {
                        chars[++pos]=(char)(temp/pow+48);
                        temp%=pow;
                        pow/=10;
                    }
                } else if(freq>1 && freq<10) {
                    chars[pos]=ch1;
                    chars[++pos]=(char)(freq+48);
                } else
                    chars[pos]=ch1;
                ch1=chars[i];
                pos++;
                freq=1;
            } else
                freq++;
            i++;
        }
        if(freq>9) {
            chars[pos]=ch1;
            int pow=1, temp=freq;
            while(freq>9) {
                pow*=10;
                freq/=10;
            } freq=0;
            while(pow>0) {
                chars[++pos]=(char)(temp/pow+48);
                temp%=pow;
                pow/=10;
            }
        }
        if(freq>1) {
            chars[pos]=ch1;
            chars[pos+1]=(char)(freq+48);
            return pos+2;
        }
        if(freq==1) {
            chars[pos]=ch1;
        }
        return pos+1;
    }
}
