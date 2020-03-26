    package main.java.crackingtheCodingInterview;

    public class Checker {
        public boolean checkBST(TreeNode root) {
            // write code here
            return method(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        private boolean method(TreeNode root,int min,int max){
            if (root == null){
                return true;
            }


            if (root.val<min || root.val>max){
                return false;
            }
            return method(root.left,min,root.val)&&method(root.right,root.val,max);
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
