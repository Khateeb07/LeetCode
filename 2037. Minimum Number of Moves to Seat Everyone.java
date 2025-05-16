class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        for(int i=0; i<seats.length-1; i++) {
            int minIndex=i, temp;
            for(int j=i+1; j<seats.length; j++) {
                if(seats[j]<seats[minIndex])
                    minIndex=j;
            }
            temp=seats[minIndex];
            seats[minIndex]=seats[i];
            seats[i]=temp;
            minIndex=i;
            for(int j=i+1; j<students.length; j++) {
                if(students[j]<students[minIndex])
                    minIndex=j;
            }
            temp=students[minIndex];
            students[minIndex]=students[i];
            students[i]=temp;
        }
        int moves=0;
        for(int i=0; i<students.length; i++) {
            moves+=Math.abs(seats[i]-students[i]);
        }
        return moves;
    }
}