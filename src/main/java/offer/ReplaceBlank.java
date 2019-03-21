package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-21 下午9:31
 * <p>
 * 类说明：
 */
public class ReplaceBlank {
    public String replaceSpace(StringBuffer str){
        StringBuilder stringBuffer=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=' '){
                stringBuffer.append(str.charAt(i));
            }
            else stringBuffer.append("%20");
        }
        return stringBuffer.toString();
    }
}
