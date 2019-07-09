package 笔试题库.长串相乘;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*有两个用字符串表示的非常大的大整数,
算出他们的乘积，也是用字符串表示。
不能用系统自带的大整数类型。*/
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader be=new BufferedReader(new InputStreamReader(System.in));
        String[] data=be.readLine().split(" ");
        char[] chars1=data[0].toCharArray();
        char[] chars2=data[1].toCharArray();
//        System.out.println(Arrays.toString(chars1));
//        System.out.println(Arrays.toString(chars2));
        int[] int1=new int[chars1.length];
        int[] int2=new int[chars2.length];
        int[] res=new int[chars1.length+chars2.length];
        for (int i = 0; i < chars1.length; i++) {
            int1[i]=chars1[chars1.length-1-i]-'0';
//            System.out.println(int1[i]);
        }
//        System.out.println(Arrays.toString(int1));

        for (int i = 0; i < chars2.length; i++) {
            int2[i]=chars2[chars2.length-1-i]-'0';
//            System.out.println(int2[i]);
        }
//        System.out.println(Arrays.toString(int2));
        for(int i = 0; i < int1.length; i++){
            for(int j = 0; j < int2.length; j++){
                res[i+j] += int1[i]*int2[j];
                if(res[i+j]>=10){//进位处理
                    res[i+j+1] += res[i+j]/10;
                    res[i+j] %= 10;
                }
            }
        }
        //将乘积转换为字符串
        StringBuffer result = new StringBuffer();
        for(int i = res.length-1;i >= 0; i--){
            if(i==res.length-1&&res[res.length-1]==0){//处理最高位是0的情况，其不应该显示
                continue;
            }
            result.append(res[i]);
        }
        System.out.println(result.toString());

    }
}
