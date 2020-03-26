package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-21 下午11:00
 * <p>
 * 类说明：
 */
public class StringtoInteger8 {
    public static void main(String[] args) {
        String s = "  -0012a42";
        StringtoInteger8 ss = new StringtoInteger8();
        System.out.println(ss.myAtoi(s));
    }
    public int myAtoi(String str) {
/*        int res = 0;
        int symbol = 1;
        int flag = 0;
        char[] cc = str.toCharArray();
        for(char c : cc){
            if(c == ' '){
                continue;
            }else if (c < '0' || c> '9'){
                if(flag == 1)
                    return res*symbol;
                if(c == '-'){
                    symbol = -1;
                    flag = 1;
                }else if(c == '+'){
                    flag = 1;
                }else{
                    return res*symbol;
                }
            }else{
                if(res * symbol > Integer.MAX_VALUE/10){
                    return Integer.MAX_VALUE;
                }
                if(res * symbol<Integer.MIN_VALUE/10){
                    return Integer.MIN_VALUE;
                }
                res = res * 10 + c-'0';
            }
        }
        return res*symbol;*/
        str = str.trim();
        char[] charArray = str.toCharArray();
        int i = 0;
        int simbol = 1;
        if (i < charArray.length && (charArray[i] == '+' || charArray[i] == '-')) {
            simbol = charArray[i] == '+' ? 1 : -1;
            i++;
        }

        int data = 0;
        int bigIntMinusTen = Integer.MAX_VALUE / 10;
        for(; i < charArray.length; i++) {
            int number = charArray[i] - '0';
            if (number > 9 || number < 0) {
                break;
            }

            if (data > bigIntMinusTen || (data == bigIntMinusTen && ((simbol == 1 && number > 7 ) || (simbol == -1 && number > 8)))) {
                return simbol == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            data = data * 10 + number;
        }

        return simbol * data;
    }
}
