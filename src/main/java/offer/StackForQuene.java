package main.java.offer;

import java.util.Stack;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-27 下午5:19
 * <p>
 * 类说明：
 */
public class StackForQuene {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.empty())
           return stack2.pop();
        while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
           return stack2.pop();
    }
}
