package 笔试题库.无缓存字符串互异;

public class Main {
    public static void main(String[] args) {
        String Sb="adhjk";
        Boolean c=checkDifferent(Sb);
        System.out.println(c);
    }

    private static Boolean checkDifferent(String iniString) {

        for(int i=0;i<iniString.length();i++){
            for(int j=i+1;j<iniString.length();j++)
                if(iniString.charAt(i)==iniString.charAt(j)){
                    return false;
                }
        }
        return true;
    }
}
