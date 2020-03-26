package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-4-18 下午8:34
 * <p>
 * 类说明：
 */
public class InversePairs {
        int cnt;
    public int InversePairs(int [] array) {
         cnt=0;
        if (array!=null)
            mergeSort(array,0,array.length-1);
        return cnt;
    }
    public void mergeSort(int[] array,int start,int end){
        if (start>=end)
            return;
        int mid=(start+end)>>1;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,mid,end);
    }
    public void merge(int[] arrray,int start,int mid,int end){
        int i=start,j=mid+1,k=0;
        int[] tmp=new int[end-start+1];
        while(i<=mid&&j<=end){
            if (arrray[i]<=arrray[j])
                tmp[k++]=arrray[i++];
            else {
                tmp[k++]=arrray[j++];
                cnt+=mid-i+1;
                cnt%=1000000007;
            }
        }
        while (i<=mid)
            tmp[k++]=arrray[i++];
        while (j<=mid)
            tmp[k++]=arrray[j++];
        for (k=0;k<tmp.length;k++)
            arrray[start+k]=tmp[k];
    }
}
