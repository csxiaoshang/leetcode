package main.java;

import java.util.HashMap;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-1 下午7:17
 * <p>
 * 类说明：
 */
public class FindWordsThatCanBeFormedbyCharacters1160 {
    public int countCharacters(String[] words, String chars) {
        char[] ch = chars.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        init(map, ch);
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                char tem = words[i].charAt(j);
                if (map.keySet().contains(tem) && map.get(tem) != 0) {
                    map.put(tem, map.get(tem) - 1);
                } else {
                    flag = false;
                    break;
                }
            }
            init(map, ch);
            if (flag == true) {
                res += words[i].length();
            }
        }
        return res;
    }

    void init(HashMap<Character, Integer> map, char[] ch) {
        map.clear();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            if (null == map.get(ch[i])) {
                count = 0;
            } else {
                count = map.get(ch[i]);
            }

            map.put(ch[i], count + 1);

        }
    }
}
