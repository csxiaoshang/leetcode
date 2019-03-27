package main.java.offer;

/**
 * @author ashang  liuys@bupt.edu.cn
 * @Date 19-3-27 下午7:16
 * <p>
 * 类说明：
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if (target==0)
            return 0;
        if (target==1)
            return 1;
        if (target==2)
            return 2;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
