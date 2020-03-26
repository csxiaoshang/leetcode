package main.java.offer;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-25 下午8:18
 * <p>
 * 类说明：
 */
public class StringFindFirstUnique {
    int[] count = new int[256];
    int index =1;
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(count[ch] == 0){
            count[ch] = index++;
        }else{
            count[ch] = -1;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char res = '#';
        int first = Integer.MAX_VALUE;
        for(int i = 0;i<256;i++){
            if(count[i]!=0&&count[i]!=-1&&count[i]<first){
                res = (char)i;
                first = count[i];
            }
        }
        return res;
    }
}
