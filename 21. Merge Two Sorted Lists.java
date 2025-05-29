class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        ListNode p=list1;
        ListNode q=list2;
        ListNode t=null;
        ListNode head=null;
        boolean loopcheck=false;
        while(p!=null && q!=null) {
            if(p.val<=q.val) {
                if(t==null) {
                    t=p;
                    head=t;
                    p=p.next;
                    loopcheck=true;
                    continue;
                }
                t.next=p;
                p=p.next;
            } else {
                if(t==null) {
                    t=q;
                    head=t;
                    q=q.next;
                    loopcheck=true;
                    continue;
                }
                t.next=q;
                q=q.next;
            }
            t=t.next;
        }
        while(p!=null) {
            if(loopcheck==false) {
                t=p;
                head=t;
                p=p.next;
                loopcheck=true;
                continue;
            }
            t.next=p;
            p=p.next;
            t=t.next;
        }
        while(q!=null) {
            if(loopcheck==false) {
                t=q;
                head=t;
                q=q.next;
                loopcheck=true;
                continue;
            }
            t.next=q;
            q=q.next;
            t=t.next;
        }
        return head;
    }
}