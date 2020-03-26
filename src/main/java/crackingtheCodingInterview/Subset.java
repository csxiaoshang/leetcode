package main.java.crackingtheCodingInterview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import  java.util.*;

import static com.sun.jmx.snmp.agent.SnmpMibNode.sort;

/**
 * @author ashang  970090853@qq.com
 * @Date 19-10-20 下午9:34
 * <p>
 * 类说明：
 */
public class Subset {
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
        if (A == null || A.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tem = new ArrayList<>();
        tem.add(A[0]);
        res.add(tem);
        for (int i = 1; i < A.length; i++) {
            ArrayList<ArrayList<Integer>> headRes = new ArrayList<>();
            ArrayList<Integer> head = new ArrayList<>();
            head.add(A[i]);
            headRes.add(head);
            for (ArrayList<Integer> arrayList : res) {
                ArrayList<Integer> mid = new ArrayList<>();
                mid.addAll(arrayList);
                mid.add(A[i]);
                headRes.add(mid);
            }
            res.addAll(headRes);
        }
        for (ArrayList<Integer> arrayList : res) {
            Collections.reverse(arrayList);
        }
        Collections.reverse(res);
        return res;
    }
}
