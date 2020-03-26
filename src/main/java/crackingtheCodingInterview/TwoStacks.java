package main.java.crackingtheCodingInterview;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-28 下午10:41
 * <p>
 * 类说明：
 * 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，但不得将元素复制到别的数据结构中。
 */
public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<numbers.length;i++){
            stack.push(numbers[i]);
        }
        Stack<Integer> resStack=new Stack<>();
        while(!stack.isEmpty()){
            int temp=stack.pop();
            while(!resStack.isEmpty()&&resStack.peek()>temp){
                stack.push(resStack.pop());
            }
            resStack.push(temp);
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(!resStack.isEmpty()){
            arrayList.add(resStack.pop());
        }
        return arrayList;
    }
}
