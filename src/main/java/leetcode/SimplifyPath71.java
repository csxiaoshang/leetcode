package main.java.leetcode;

import java.util.ArrayList;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-19 上午9:21
 * <p>
 * 类说明：
 */
public class SimplifyPath71 {
    public String simplifyPath(String path) {
        //先利用 "/" 将字符串分割成一个一个单词
        String[] wordArr = path.split("/");
        //将空字符串（由类似这种"/a//c"的字符串产生）和 "." （"."代表当前目录不影响路径）去掉，保存到 wordList
        ArrayList<String> wordList = new ArrayList<String>();
        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i].isEmpty() || wordArr[i].equals(".")) {
                continue;
            }
            wordList.add(wordArr[i]);
        }
        //wordListSim 保存简化后的路径
        ArrayList<String> wordListSim = new ArrayList<String>();
        //遍历 wordList
        for (int i = 0; i < wordList.size(); i++) {
            //如果遇到 ".."，wordListSim 就删除末尾的单词
            if (wordList.get(i).equals("..")) {
                if (!wordListSim.isEmpty()) {
                    wordListSim.remove(wordListSim.size() - 1);
                }
                //否则的话就加入 wordListSim
            } else {
                wordListSim.add(wordList.get(i));
            }
        }
        //将单词用 "/" 连接
        String ans = String.join("/", wordListSim);
        //开头补上 "/"
        ans = "/" + ans;
        return ans;

    }

}
