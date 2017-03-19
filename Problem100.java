import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 19.03.2017.
 */
public class Problem100 {
    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public LinkedList<Integer> first=new LinkedList<>();
    public LinkedList<Integer> second=new LinkedList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        toArray(first,p,0);
        toArray(second,q,0);
        return first.equals(second);
    }
    public void toArray(LinkedList list,TreeNode node,int i){
        if(node==null) {
            list.addLast(0);
            return;
        }
        toArray(list,node.left,-1);
        list.addLast(node.val);
        toArray(list,node.right,1);
    }
}
