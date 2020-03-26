package main.java.crackingtheCodingInterview;

public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        return Math.abs(high(root.right)-high(root.left))>1?false:true;
    }
    int high(TreeNode node){
        if (node==null){
            return 0;
        }
        return Math.max(high(node.left),high(node.right))+1;
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

