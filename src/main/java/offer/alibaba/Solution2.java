package main.java.offer.alibaba;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-3-23 下午5:30
 * <p>
 * 类说明：
 * https://www.nowcoder.com/discuss/389640?type=2&order=0&pos=2&page=1
 */
public class Solution2 {
    private static class Node {
        int x;
        int y;
        int step;
        int fly;

        Node(int x, int y, int step, int fly) {
            this.x = x;
            this.y = y;
            this.step = step;
            this.fly = fly;
        }
    }

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            char[][] ch = new char[n][m];
            int[][] visit = new int[n][m];
            for (int i = 0; i < n; i++) {
                String str = in.next();
                ch[i] = str.toCharArray();
            }
            for (int i =0;i<n;i++){
                for (int j =0;j<m-1;j++){
                    System.out.print(ch[i][j]);
                }
                System.out.println(ch[i][m-1]);
            }
            System.out.println("start");
            LinkedList<Node> queue = new LinkedList<>();
            int sx = 0, sy = 0;
            // find start node
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (ch[i][j] == 'S') {
                        sx = i;
                        sy = j;
                        i = n;
                        break;
                    }
                }
            }
            queue.add(new Node(sx, sy, 0, 0));
            while (!queue.isEmpty()) {
                Node node = queue.peek();
                queue.remove();
                int indexX = node.x;
                int indexY = node.y;
                visit[indexX][indexY] = 1;
                if (ch[indexX][indexY] == 'E') {
                    System.out.println(node.step);
                    break;
                }
                for (int i = 0; i < 4; i++) {
                    int x = indexX + dx[i];
                    int y = indexY + dy[i];
                    if(x>=0&&x<n&&y>=0&&y<m&&visit[x][y]!=1&&ch[x][y]!='#'){
                        queue.add(new Node(x, y, node.step + 1, 0));
                    }
                }
            }
        }
    }

}
