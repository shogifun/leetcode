/**
 * Created by user on 18.03.2017.
 */
public class Problem203 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head.next==null){
            if (head.val==val){
                return null;
            }
            else {
                return head;
            }
        }
        if(head.val==val){
            head=notValNode(head.next,val);
        }

        recursion(head,val);
        return head;
    }
    public void recursion(ListNode node,int val){
        if(node.next==null){
            if(node.val==val){
                node=null;
            }
            return;
        }
        if(node.next.val==val){
           node.next=notValNode(node.next,val);
            if(node.next==null){
                return;
            }
        }
        recursion(node.next,val);
    }
    public ListNode notValNode(ListNode node,int val){
        if(node.val!=val){
            return node;
        }
        if(node.next==null){
            return null;
        }
        return notValNode(node.next,val);
    }
}
