package main.java.crackingtheCodingInterview;

import java.util.ArrayList;

public class Path {
    public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
        return check(a, b)||check(b,a);
    }

    boolean check(UndirectedGraphNode left,UndirectedGraphNode right){
        if (left==null||right==null){
            return false;
        }
        if (left==right)
            return true;
        if (left.label==-1){
            return false;
        }
        left.label=-1;
        for (UndirectedGraphNode node:left.neighbors){
            if (check(node,right))
                return true;
        }
        return false;
    }
    public class UndirectedGraphNode {
        int label = 0;
        UndirectedGraphNode left = null;
        UndirectedGraphNode right = null;
        ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

        public UndirectedGraphNode(int label) {
            this.label = label;
        }
    }
}
