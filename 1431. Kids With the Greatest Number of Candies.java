class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies=0;
        for(int i=0; i<candies.length; i++) {
            if(candies[i]>maxCandies)
                maxCandies=candies[i];
        }
        ArrayList<Boolean> maxC=new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            if((candies[i]+extraCandies)>=maxCandies) {
                maxC.add(true);
            } else {
                maxC.add(false);
            }
        }
        return maxC;
    }
}