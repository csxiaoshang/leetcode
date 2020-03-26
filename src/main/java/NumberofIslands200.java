package main.java;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-2-6 下午8:27
 * <p>
 * 类说明： dfs解决办法
 */
public class NumberofIslands200 {
    int res = 0;
    public int numIslands(char[][] grid) {
        for(int i =0 ;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] != '0'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    private void dfs(char[][] grid,int i,int j){
        if(i < 0 || i>= grid.length || j < 0 || j >= grid[0].length){
            return;
        }
        if(grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}
