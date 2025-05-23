class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int befLeft=1;
        ListNode p=head;
        while(befLeft<left-1) {
            p=p.next;
            befLeft++;
        }
        int constant=0;
        if(left==1) constant=1;
        if(p.next!=null && p.next.next!=null ) {
            ListNode tLeft=null, x=null, y=null, z=null;
            if(left!=1) {
                x=p.next;
                y=x.next;
                z=y.next;
                tLeft=p.next;
            }
            else {
                x=head;
                y=x.next;
                z=y.next;
                tLeft=head;
            }
            while(left<right && y!=null) {
                y.next=x;
                x=y;
                y=z;
               if(z!=null) z=z.next;
                left++;
            }
            if(constant!=1) {
                p.next=x;
                tLeft.next=y;
            } else {
                tLeft.next=y;
                head=x;
            }
        } else if(p.next!=null && left<right) {
            ListNode q=p.next;
            q.next=p;
            head=q;
            p.next=null;
        }
        return head;
    }
}