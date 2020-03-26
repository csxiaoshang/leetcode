package main.java.offer;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-26 上午9:40
 * <p>
 * 类说明：
 */
public class NodeGetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return pNode;
        }
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }

            while (pNode.left != null) {
                pNode = pNode.left;
            }

            return pNode;
        } else {
            while (pNode.next != null) {
                if (pNode.next.left == pNode) {
                    return pNode.next;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
