package 数据结构与算法.字符串.替换空格;

public class Demo1 {
    public static void main(String[] args) {
        String sc="we are happy";
        String cd=replaceKongGe(sc);
        System.out.println(cd);
    }
    public  static  String  replaceKongGe(String str){
        char[] arr=str.toCharArray();
        StringBuffer strb=new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==' '){
                strb.append("%20");
            }else{
                strb.append(arr[i]);
            }
        }
        return strb.toString();
    }
}
