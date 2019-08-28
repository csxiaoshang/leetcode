package main.java.crackingtheCodingInterview;

public class Successor {
    boolean flag = false;
    public int findSucc(TreeNode root, int p) {
        // write code here
        if (root==null){
            return -1;
        }
        int left = findSucc(root.left,p);
        if (left!=-1){
            return left;
        }
        if (flag){
            return root.val;
        }
        if (root.val==p){
            flag=true;
        }
        return findSucc(root.right,p);
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
