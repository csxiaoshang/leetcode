package main.java.crackingtheCodingInterview;

import java.util.ArrayList;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-6-25 下午6:17
 * <p>
 * 类说明：
 * 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，新建一个栈。该数据结构应支持与普通栈相同的push和pop操作。.
 */
public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curArray=new ArrayList<Integer>(size);
        list.add(curArray);
        for(int i=0;i<ope.length;i++){
            switch(ope[i][0]){
                //1:push
                case 1:
                    //当前数组未满
                    if(curArray.size()!=size){
                        curArray.add(ope[i][1]);
                    }
                    else{
                        curArray=new ArrayList<Integer>(size);
                        list.add(curArray);
                        curArray.add(ope[i][1]);
                    }
                    break;
                //2:pop
                case 2:
                    //当前数组不为空
                    if(curArray.size()!=0){
                        curArray.remove(curArray.size()-1);
                    }
                    else{
                        list.remove(list.size()-1);
                        curArray=list.get(list.size()-1);
                        curArray.remove(curArray.size()-1);
                    }
                    break;
            }
        }
        return list;
    }
}
