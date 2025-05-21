class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p=head;
        ListNode q=head;
        while(q.next!=null) {
            q=p.next;
            int gcd=(p.val<q.val)?p.val:q.val;
            while(gcd>0) {
                if(p.val%gcd==0 && q.val%gcd==0) {
                    break;
                }
                gcd--;
            }
            ListNode r=new ListNode(gcd);
            r.next=q;
            p.next=r;
            p=q;
        }
        return head;
    }
}