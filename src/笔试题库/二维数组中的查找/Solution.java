package 笔试题库.二维数组中的查找;

    public class Solution {
        public boolean Find(int target, int [][] array) {
            for (int i = 0; i <array.length ; i++) {
                int low = 0;
                int high = array[i].length - 1;
                int middle = 0;
                while(low <= high)
                {
                    middle = (low + high) / 2;
                    if(array[i][middle] > target){
                        high = middle - 1;
                    }else if(array[i][middle] < target)
                    {
                        //比关键字小则关键字在右区域
                        low = middle + 1;
                    }
                    else{
//                    找到了
                        return true;
                    }
                }

            }
            return false;
        }
    }
