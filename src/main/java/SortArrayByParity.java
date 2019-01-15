package main.java;

public class SortArrayByParity {
    public  int[] sortArrayByParity(int[] A){
        int count1=0;
        int count2=0;
        int length=A.length;
        int[] B=new int[length];
        int[] C=new int[length];
        for(int i=0;i<length;i++){
            if(A[i]%2==1){
                C[count2++]=A[i];
            }else{
                B[count1++]=A[i];
            }
        }
        for(int i=0;i<length;i++){
            if(i<count1){
                A[i]=B[i];
            }else {
                A[i]=C[i-count1];
            }
        }
        return A;
    }
}
