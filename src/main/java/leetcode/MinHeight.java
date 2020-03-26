package main.java;

import java.util.ArrayList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-20 下午6:04
 * <p>
 * 类说明： 牛家庄幼儿园为庆祝61儿童节举办庆祝活动,庆祝活动中有一个节目是小朋友们围成一个圆圈跳舞。牛老师挑选出n个小朋友参与跳舞节目,已知每个小朋友的身高h_i。为了让舞蹈看起来和谐,牛老师需要让跳舞的圆圈队形中相邻小朋友的身高差的最大值最小,牛老师犯了难,希望你能帮帮他。
 *
 * 如样例所示:
 * 当圆圈队伍按照100,98,103,105顺时针排列的时候最大身高差为5,其他排列不会得到更优的解。
 * 输入描述:
 * 输入包括两行,第一行为一个正整数n(3 ≤ n ≤ 20)
 * 第二行为n个整数h_i(80 ≤ h_i ≤ 140),表示每个小朋友的身高。
 * 输出描述:
 * 输出一个整数,表示满足条件下的相邻小朋友身高差的最大值。
 */
public class MinHeight {
    ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args) {
        int[] array = {100,98,103,105};
        MinHeight minHeight = new MinHeight();
        minHeight.dfs(array,0);
        for (int i=0;i<minHeight.res.size();i++){
            System.out.println(minHeight.res.get(i));
        }
    }
    private void dfs(int[] array,int start){
        if(start>=array.length){
            StringBuilder sb = new StringBuilder();
            for (int i : array) {
                sb.append(i+" ");
            }
            res.add(sb.toString());
            return;
        }
        for(int i=start;i<array.length;i++){
            swap(array,start,i);
            dfs(array,start+1);
            swap(array,start,i);
        }
    }
    private void swap(int[] num,int i,int j){
        int tem = num[i];
        num[i] = num[j];
        num[j] = tem;
    }
}
