package main.java;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int glength=g.length;
        int slength=s.length;
        int i=0,j=0;
        int count=0;
        while(i<glength&&j<slength){
            if (s[j]>g[i]){
                i++;
                j++;
                count++;
            }else {
                j++;
            }
        }
        return count;
    }
    public void play(){

    }
}
