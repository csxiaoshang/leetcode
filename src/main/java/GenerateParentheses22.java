package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-9 上午9:35
 * <p>
 * 类说明：
 */
public class GenerateParentheses22 {

/**
*@Description: o(2^(2*n))的复杂度 生成所有可能括号组合，然后找出符合要求的括号组合
 * 递归的生成括号组合
*@param: null
*@return:
*@Author: ashang
*@date: 20-1-9上午9:58
*/
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(new char[2*n],0);
        return res;
    }
    private void generate(char[] ch, int pos){
        if(pos == ch.length){
            if(valid(ch)){
                res.add(new String(ch));
            }
        }else{
            ch[pos] = '(';
            generate(ch,pos+1);
            ch[pos] = ')';
            generate(ch,pos+1);
        }
    }
    private boolean valid(char[] ch){
        int oSize = 0;
        int cSize = 0;
        for(int i =0 ;i<ch.length;i++){
            if(oSize < cSize){
                return false;
            }
            if(ch[i] == '('){
                oSize++;
            }else{
                cSize++;
            }
        }
        return oSize == cSize;
    }
}
