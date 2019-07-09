package 笔试题库.B在A中出现的位置;

public class Test {
    public class StringPattern {
        public int findAppearance(String A, int lena, String B, int lenb) {
//            int result=A.indexOf(B);
//            return result;

            if(lena<lenb)
                return -1;
            if(lena==lenb)
            {
                if(A.equals(B))
                    return 0;
                else
                    return -1 ;
            }

            int i=0;
            while (i<lena-lenb){
                if (A.charAt(i)==B.charAt(0)){
                    String temp=A.substring(i,i+lenb);
                    if (temp.equals(B)){
                        return 0;
                    }
                    else{
                        i++;
                    }
                }
            }

            return -1 ;
        }
    }
}
