package main.java.offer;

import java.util.LinkedList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-28 下午7:52
 * <p>
 * 类说明：
 */
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n<1||m<1)
            return -1;
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i=0;i<n;i++)
            linkedList.add(i);
        int start=0;
        while(linkedList.size()!=1){
            start=(start+m-1)%linkedList.size();
            linkedList.remove(start);
        }
        return linkedList.get(0);
    }
}
