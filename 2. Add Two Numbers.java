class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        ListNode r=null;
        ListNode head=null;
        boolean flag=true;
        int carry=0;
        while(p!=null && q!=null) {
            ListNode t=null;
            int n=p.val+q.val+carry;
            if(n>9) {
                carry=n/10;
                t=new ListNode(n%10);
            } else { 
                t=new ListNode(n);
                carry=0;
            }
            if(flag==true) {
                r=t;
                head=r;
                flag=false;
            } else {
                r.next=t;
                r=r.next;
            }    
            p=p.next;
            q=q.next;
        }
        while(p!=null) {
            ListNode t=null;
            int n=p.val+carry;
            if(n>9) {
                carry=n/10;
                t=new ListNode(n%10);
            } else {
                t=new ListNode(n);
                carry=0;
            }
            r.next=t;
            r=r.next;
            p=p.next;
        }
        while(q!=null) {
            ListNode t=null;
            int n=q.val+carry;
            if(n>9) {
                carry=n/10;
                t=new ListNode(n%10);
            } else {
                t=new ListNode(n);
                carry=0;
            }
            r.next=t;
            r=r.next;
            q=q.next;
        }
        if(carry>0) {
            ListNode t=null;
            t=new ListNode(carry);
            r.next=t;
            r=r.next;
        }
        return head;
    }
}