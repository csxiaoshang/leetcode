package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-9 上午11:06
 * <p>
 * 类说明：
 */
public class ImplementTriePrefixTree208 {
    String[] value;
    int cur;
    int length = 16;
    /** Initialize your data structure here. */
    public ImplementTriePrefixTree208() {
        value = new String[length];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(cur == length){
            addLength();
        }
        value[cur++] = word;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        for(int i = 0;i<cur;i++){
            if(value[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(int i = 0;i<cur;i++){
            if(value[i].startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
    private void addLength(){
        String[] tem = new String[length*2];
        int newLength = length*2;
        for(int i = 0;i<length;i++){
            tem[i] = value[i];
        }
        value = tem;
        length = newLength;
    }
}
