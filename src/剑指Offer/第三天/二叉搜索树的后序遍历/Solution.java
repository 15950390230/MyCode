package 剑指Offer.第三天.二叉搜索树的后序遍历;
/*
* 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
* 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。*/
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int count=sequence.length;
        if(count==0)
            return false;
        return isRight(sequence,0,count-1);

    }
/**BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），
 * 如果去掉最后一个元素的序列为T，那么T满足：T可以分成两段，前一段（左子树）
 * 小于x，后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。完美的递归定义 : ) 。
 * */
    private boolean isRight(int[] sequence, int start, int end) {
        if(start>=end) return true;
        int i=end-1;
        while(sequence[i]>sequence[end]&&i>start) i--;//循环找到比根节点小的最后一个数也就是左子树的根节点
        for(int j=start;j<i;j++){
            if(sequence[j]>sequence[end])
                return false;//判断左子树有没有元素比根节点的值大
        }
        return isRight(sequence,start,i)&&isRight(sequence,i+1,end-1);


    }
}
