/**
 * Created by user on 19.03.2017.
 */
public class Problem98 {
    public  class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
    public  boolean result=true;
    public  int comp=Integer.MIN_VALUE;
    public boolean isLeft=false;
    public  boolean isValidBST(TreeNode root) {
            if(root==null) return true;
            if((root.left==null)&&(root.right==null)) return true;
            check(root);
            return result;
        }
    public  void check(TreeNode node){
        if(!result) return;
        if(node==null) return;
        check(node.left);
        if(!isLeft){
            comp=node.val;
            isLeft=true;
        }else if (comp>=node.val){
            result=false;
            return;
        }else {
            comp=node.val;
        }
        check(node.right);
    }
    public static void main(String ... ar){

    }
}
