package 笔试题库.KMP算法子串查找;

public class FindChild {
    /**
     * 暴力破解法
     * @param ts 主串
     * @param ps 模式串
     * @return 如果找到，返回在主串中第一个字符出现的下标，否则为-1
     */
    public static int baoLi(String ts,String ps){
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        while (i < t.length && j < p.length) {
            if (t[i] == p[j]) { // 当两个字符相同，就比较下一个
                i++;
                j++;
            } else {
                i = i - j + 1; // 一旦不匹配，i后退
                j = 0; // j归0
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    /**
     * KMP算法（查找子串）
     * @param ts 主串
     * @param ps 模式串
     * @return 如果找到，返回在主串中第一个字符出现的下标，否则为-1
     */
    public static int KMPFind(String ts,String ps){
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        int[] next = getNext(ps);
        while (i < t.length && j < p.length) {
            if (j == -1 || t[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
                i++;
                j++;
            } else {
                // i不需要回溯了
                // i = i - j + 1;
                j = next[j]; // j回到指定位置
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    /**
     * 辅助函数
     * @param ps 模式串
     */
    public static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                if (p[++j]==p[++k]){
                    next[j] = next[k];
                }
                else{
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String aa="ABCABCDHIJK";
        String bb="ABCD";
//        System.out.println(baoLi(aa,bb));
        System.out.println(KMPFind(aa,bb));
    }
}
