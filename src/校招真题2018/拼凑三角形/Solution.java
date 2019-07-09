package 校招真题2018.拼凑三角形;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] str= bf.readLine().split(" ");
        int[] arr=new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        if (arr[0]+arr[1]>arr[2]){
            System.out.println(arr[0]+arr[1]+arr[2]);
        }
        else {
            System.out.println((arr[0]+arr[1])*2-1);
        }
    }
}
