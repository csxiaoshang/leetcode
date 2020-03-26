package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-1-6 上午9:34
 * <p>
 * 类说明：
 */
public class ContainerWithMostWater11 {
    /**
     * o(n^2)
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int length = height.length;
        int[] container = new int[length+1];
        for(int i =0;i<length;i++){
            container[i+1] = height[i];
        }
        int max = 0;
        for(int i=1;i<=length;i++){
            for(int j = i+1;j<=length;j++){
                int high = container[i] > container[j] ? container[j] : container[i];
                int temp = high * (j - i);
                max = temp > max ? temp :max;
            }
        }
        return max;
    }
}
