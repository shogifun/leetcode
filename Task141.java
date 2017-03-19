/**
 * Created by user on 19.03.2017.
 */
public class Task141 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        if (head.next==null){
            return false;
        }
        ListNode first=head.next;
        ListNode second=head.next.next;
        while (true){
            if (first==null){
                return false;
            }
            if (second==null){
                return false;
            }
            if (first==second){
                return true;
            }
            if (second.next==null){
                return false;
            }
            first=first.next;
            second=second.next.next;
        }
    }
}
