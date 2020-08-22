package main.java.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @Author 北集
 * @Date 2020/6/28 16:36
 * @Description:
 * Design a data structure that supports all following operations in average O(1) time.
 *
 *
 *
 * insert(val): Inserts an item val to the set if not already present.
 * remove(val): Removes an item val from the set if present.
 * getRandom: Returns a random element from current set of elements (it's guaranteed that at least one element exists
 * when this method is called). Each element must have the same probability of being returned.
 *
 *
 * Example:
 *
 * // Init an empty set.
 * RandomizedSet randomSet = new RandomizedSet();
 *
 * // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomSet.insert(1);
 *
 * // Returns false as 2 does not exist in the set.
 * randomSet.remove(2);
 *
 * // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomSet.insert(2);
 *
 * // getRandom should return either 1 or 2 randomly.
 * randomSet.getRandom();
 *
 * // Removes 1 from the set, returns true. Set now contains [2].
 * randomSet.remove(1);
 *
 * // 2 was already in the set, so return false.
 * randomSet.insert(2);
 *
 * // Since 2 is the only number in the set, getRandom always return 2.
 * randomSet.getRandom();
 */
public class InsertDeleteGetRandom380 {
    Set<Integer> set = new HashSet<>();
    /** Initialize your data structure here. */
    public InsertDeleteGetRandom380() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        }else{
            set.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return 1;
    }
    class Solution1{
        private Integer[] arr;
        private int size;
        private Map<Integer, Integer> map; // value to index
        private Random r;

        /** Initialize your data structure here. */
        public Solution1() {
            arr = new Integer[16];
            size = 0;
            map = new HashMap<>();
            r = new Random();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            Integer index = map.get(val);
            if(null != index) {
                return false;
            }

            if(size == arr.length) {
                Integer[] narr = new Integer[arr.length*2];
                System.arraycopy(arr, 0, narr, 0, arr.length);
                arr = narr;
            }
            arr[size] = val;
            map.put(val, size);
            size++;
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            Integer index = map.get(val);
            if(null == index) {
                return false;
            }
            map.remove(val);
            arr[index] = null;
            if(index != size-1) {
                arr[index] = arr[size-1];
                map.put(arr[index], index);
            }
            size--;
            //System.out.println("val=" + val + ", size=" + size);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int index = r.nextInt(size);
            return arr[index];
        }
    }
}
