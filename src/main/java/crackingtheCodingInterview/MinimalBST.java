package main.java.crackingtheCodingInterview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimalBST {
    public int buildMinimalBST(int[] vals) {
        // write code here+
        return high(vals);
    }
    int high(int[] vals){
        if (vals.length<=2)
            return vals.length;
        int mid=vals.length/2;
        return Math.max(high(Arrays.copyOfRange(vals,0,mid)),high(Arrays.copyOfRange(vals,mid+1,vals.length-1)))+1;
    }
}
