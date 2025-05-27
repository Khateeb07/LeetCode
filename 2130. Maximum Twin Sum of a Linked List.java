class Solution {
    public int pairSum(ListNode head) {
        int max=0;
        ListNode p=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(p!=null) {
            list.add(p.val);
            p=p.next;
        }
        int n=list.size();
        for(int i=0; i<n; i++) {
            if(max<(list.get(i)+list.get(n-1-i)))
                max=(list.get(i)+list.get(n-1-i));
        }
        return max;
    }
}