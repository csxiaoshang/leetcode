package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-29 下午8:26
 * <p>
 * 类说明：
 */
public class StackIncloudeMin {
    /**
     * 下面写的是队列
     */
/*    int min;
    int head=0;
    int index=0;
    int [] stack=new int[100];
    public void push(int node) {
        if (index==0)
            min=0;
        else
            min=stack[min]<node?min:index;
        stack[index++]=node;
    }

    public void pop() {
        head++;
        if (head>min){
            int mins=stack[head];
            int num=head;
            for (int i=head+1;i<index;i++){
                if (mins>=stack[i]){
                    mins=stack[i];
                    num=i;
                }
            }
            min=num;
        }
    }

    public int top() {
        return stack[index];
    }

    public int min() {
        return stack[min];
    }*/
    int min;  //定义最小的下标
    ​int head=0;  //栈底下标   默认为零即可，这是我已开始看错题目了，写成队列搞的
​    int index=0; //定义栈顶下标
    int [] stack=new int[100];
    public void push(int node) {
        //压栈的时候要考虑最小值
        if (index==0)
            min=0;
        else
            min=stack[min]<node?min:index;
        stack[index++]=node;
    }

    public void pop() {
        index--;
        if (index<=min){
            int mins=stack[head];
            int num=head;
            for (int i=head+1;i<index;i++){
                if (mins>=stack[i]){
                    mins=stack[i];
                    num=i;
                }
            }
            min=num;
        }
    }

    public int top() {
        return stack[index-1];
    }

    public int min() {
        //直接数组下标查找最小值，时间复杂度为o(1)
        return stack[min];
    }
}
