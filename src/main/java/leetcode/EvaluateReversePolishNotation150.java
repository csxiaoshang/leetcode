package main.java;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-5 上午10:38
 * <p>
 * 类说明：
 */
public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for(String s :tokens){
            if("+".equals(s)||"-".equals(s) || "*".equals(s) || "/".equals(s)){
                int a = deque.pop();
                int b = deque.pop();
                if("+".equals(s)){
                    deque.push(a+b);
                }else if("-".equals(s)){
                    deque.push(b-a);
                }else if("*".equals(s)){
                    deque.push(a*b);
                }else{
                    deque.push(b/a);
                }
            }else{
                deque.push(Integer.valueOf(s));
            }
        }
        return deque.pop();
    }
}
