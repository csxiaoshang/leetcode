package main.java.leetcode;

import java.util.*;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-5-11 上午11:05
 * <p>
 * 类说明：
 */
public class CourseScheduleII210 {
    public static void main(String[] args) {
        int[][] nums = {{1, 0}};
        findOrder(2, nums);
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        LinkedList<Integer> queue = new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        HashMap<Integer, Integer> indegree = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i=0; i < prerequisites.length; i++) {
            int key = prerequisites[i][1];
            int value = prerequisites[i][0];
            set.add(value);
            set.add(key);
            indegree.put(value, indegree.getOrDefault(value, 0) + 1);
            if (!graph.containsKey(key)) {
                graph.put(key, new ArrayList<>());
            }
            List list = graph.get(key);
            list.add(value);
        }
        for (int i : set) {
            if (indegree.getOrDefault(i,0) == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            Integer temp = queue.poll();
            res[count++] = temp;
            for (int val : graph.getOrDefault(temp, new ArrayList<>())) {
                int num = indegree.get(val);
                if (num == 1) {
                    queue.offer(val);
                }
                indegree.put(val,num-1);
            }
        }
        for (int i : set) {
            if (indegree.getOrDefault(i,0) != 0) {
                return new int[0];
            }
        }
        //**************主要修改的地方********************//
        HashSet<Integer> resSet = new HashSet<>();
        for (int i = 0; i < count; i++) {
            resSet.add(res[i]);
        }
        //有些课是独立存在的，这些课可以随时上，添加进来
        for (int i = 0; i < numCourses; i++) {
            if (!resSet.contains(i)) {
                res[count++] = i;
            }
        }
        return res;
    }
}
