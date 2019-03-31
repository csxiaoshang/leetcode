package main.java.offer;

import java.util.Stack;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-31 下午8:50
 * <p>
 * 类说明：
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int count=0;
        int push=0;
        int num=0;
        while(count<popA.length){
            if (!stack.isEmpty()){
                if (stack.peek()==popA[count])
                {
                    count++;
                    stack.pop();
                }
            }
/*            if (pushA[push]==popA[count]){
                push++;
                count++;
            }*/
            if (push<pushA.length)
            stack.push(pushA[push++]);
            num++;
            if (num>popA.length*2)
                return false;
        }
        return true;
    }
}
