class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int hwEmp=0;
        for(int i=0; i<hours.length; i++) {
            if(hours[i]>=target)
                hwEmp++;
        }
        return hwEmp;
    }
}