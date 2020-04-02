package main.java.leetcode;

/**
 * @author ashang  970090853@qq.com
 * @Date 20-4-2 上午7:23
 * <p>
 * 类说明：
 */
public class ValidSudoku36 {
    /**
     * o(3*n^2)
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            int[] hash = new int[10];
            for (int j=0;j<board[0].length;j++){
                if (board[i][j] == '.') {
                    continue;
                }
                int tem = board[i][j] - '0';
                if (tem<1||tem>9 || hash[tem] == 1){
                    return false;
                }else{
                    hash[tem] = 1;
                }
            }
        }
        for (int j = 0;j<board[0].length;j++){
            int[] hash = new int[10];
            for (int i=0;i<board.length;i++){
                if (board[i][j] == '.') {
                    continue;
                }
                int tem = board[i][j] - '0';
                if (tem<1||tem>9 || hash[tem] == 1){
                    return false;
                }else{
                    hash[tem] = 1;
                }
            }
        }
        for (int i=0;i<board.length;i+=3){
            for (int j=0;j<board[0].length;j+=3){
                int[] hash = new int[10];
                for (int k =0;k<3;k++){
                    for (int l = 0;l<3;l++){
                        if (board[i+k][j+l] == '.') {
                            continue;
                        }
                        int tem = board[i+k][j+l] - '0';
                        if (tem<1||tem>9 || hash[tem] == 1){
                            return false;
                        }else{
                            hash[tem] = 1;
                        }
                    }
                }
            }
        }
        return true;
    }
}
