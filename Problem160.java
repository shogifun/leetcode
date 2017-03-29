/**
 * Created by user on 28.03.2017.
 */
public class Problem160 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    private ListNode lastA;
    private ListNode lastB;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if ((headA==null)||(headB==null)){
            return null;
        }
        int lA=lenghtOfList(headA);
        int lB=lenghtOfList(headB);
        ListNode iterA=headA;
        ListNode iterB=headB;
        if(lastA!=lastB){
            return null;
        }
        if (lA>lB){
            for (int i=0;i<lA-lB;i++){
                iterA=iterA.next;
            }
        }
        else{
            for (int i=0;i<lB-lA;i++){
                iterB=iterB.next;
            }
        }
        while ((iterA!=null)&&(iterB!=null)){
            if (iterA==iterB) {
                return iterA;
            }
            iterA=iterA.next;
            iterB=iterB.next;
        }
        return null;
    }
    int lenghtOfList(ListNode node){
        if (node.next==null){
            if (lastA==null){
                lastA=node;
            }
            lastB=node;
            return 1;
        }
        else {
            return lenghtOfList(node.next)+1;
        }
    }
}
