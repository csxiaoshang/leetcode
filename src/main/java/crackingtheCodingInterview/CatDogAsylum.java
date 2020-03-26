package main.java.crackingtheCodingInterview;

import java.util.ArrayList;
import java.util.LinkedList;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        int time=0;
        LinkedList<animal> cat=new LinkedList<>();
        LinkedList<animal> dog = new LinkedList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        int length = ope.length;
        for (int i=0;i<length;i++){
            int way=ope[i][0];
            int num = ope[i][1];
            if (way== 1){
                if (num>0){
                    dog.add(new animal(num,time++));
                }else {
                    cat.add(new animal(num,time++));
                }
            }
            animal res=new animal(0,-1);
            if (way == 2){
                animal c = cat.peekFirst();
                animal d = dog.peekFirst();
                if (num == 0){
                    if (c==null&&d==null){
                        continue;
                    }
                    if (c!=null&&d!=null){
                        if (c.time<d.time){
                            res=cat.remove();
                        }else {
                            res=dog.remove();
                        }
                    }
                    if (c==null&&d!=null){
                        res=dog.remove();
                    }
                    if (d==null&&c!=null){
                        res=cat.remove();
                    }
                }else if (num==1){
                    if (d==null){
                        continue;
                    }
                    res=dog.remove();
                }else {
                    if (c==null){
                        continue;
                    }
                    res=cat.remove();
                }
            }
            if (res.time>=0){
                arrayList.add(res.num);
            }
        }
        return arrayList;
    }
    class animal{
        int  num;
        int time;

        animal(int num,int time){
            this.num=num;
            this.time=time;
        }
    }

}
