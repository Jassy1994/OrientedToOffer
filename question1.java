/**
 * Author:Jassy
 * Time:2017/04/10
 * Solution:从二维数组的左上或者右下开始搜索：(代码中从左上)若当前值小于target，则这一行的值都小于target,从下一行开始搜,i++;
 *          若当前值大于target,则这一列都大于target,从下一列开始搜,j--;
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        int row=array.length;
        int col=array[0].length;    
        int i=0;
        int j=col-1;
        int check=0;
        while(i<row && j>=0){
            check=array[i][j];
            if(check>target){
                --j;
            }else if(check<target){
                ++i;
            }else{
                return true;
            }
        }
        return false;
    }
}