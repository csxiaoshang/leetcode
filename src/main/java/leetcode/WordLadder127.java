package main.java.leetcode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-25 上午8:06
 * <p>
 * 类说明：
 * 127. Word Ladder
 * Medium
 *
 * 3035
 *
 * 1145
 *
 * Add to List
 *
 * Share
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation
 * sequence from beginWord to endWord, such that:
 *
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list.
 * Note:
 *
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * You may assume no duplicates in the word list.
 * You may assume beginWord and endWord are non-empty and are not the same.
 * Example 1:
 *
 * Input:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * Output: 5
 *
 * Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * Example 2:
 *
 * Input:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 *
 * Output: 0
 *
 * Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
 */
public class WordLadder127 {
    private final static String a = "asdff";
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        String day = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(day);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> integers = list.iterator();
        while (integers.hasNext()) {
            int i = integers.next();
            if (i == 2) {
                integers.remove();
            }
        }
        System.out.println(list);

        System.out.println(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println("------------------------");
        int count = 30;
        LocalDate curData = LocalDate.parse("2020-06-10");
        System.out.println(curData.isBefore(LocalDate.now()));
        System.out.println(curData.isBefore(LocalDate.parse("2020-06-10")));
        System.out.println(curData.isBefore(LocalDate.parse("2020-06-09")));

        while (count-- > 0) {
            System.out.println(curData);
            curData = curData.plus(1, ChronoUnit.DAYS);
        }
        String urlString = "/test1,/test2,/test3";
        System.out.println(Arrays.asList(urlString.split(",")));
        List<String> urls = new ArrayList<>();
        urls.addAll(Arrays.asList(urlString.split(",")));
        urls.add("/test1");
        urls.add("/test2");
        urls.add("/test3");
        String[] urlArray =  urls.toArray(new String[0]);
        for (String s : urlArray) {
            System.out.println(s);
        }

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        LinkedList<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> set = new HashSet<>();
        set.add(beginWord);
        int count = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                String curString = queue.peek();
                queue.poll();
                count++;
                for (String targetString : wordList) {
                    if (set.contains(targetString)) {
                        continue;
                    }
                    if (isOnlyChangeOneLetter(curString, targetString)) {
                        if (targetString.equals(endWord)) {
                            return count;
                        }
                        set.add(targetString);
                        queue.offer(targetString);
                    }
                }
            }
        }
        return 0;
    }

    private boolean isOnlyChangeOneLetter(String curString, String targetString) {
        int count = 0;
        for (int i = 0; i < curString.length(); i++) {
            if (curString.charAt(i) != targetString.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return count == 1;
    }

}
