package 面试宝典.对象的引用;

 class Obj {
    private String str="default value";
    public void serStr(String str){
        this.str=str;
    }

    @Override
    public String toString() {
        return  str ;
    }
}
public class TestRef{
     private  Obj aObj=new Obj();
     private int aInt=0;

    public Obj getAobj() {
        return aObj;
    }

    public int getaInt() {
        return aInt;
    }
    public  void  changeObj(Obj inObj){
        inObj.serStr("change value");
    }
    public void changeInt(int inInt){
        inInt=1;

        //局部变量不影响成员变量
    }

    public static void main(String[] args) {
        TestRef oRef=new TestRef();
        System.out.println("**********引用类型***********");
        System.out.println("调用changeObj前："+oRef.getAobj());
        oRef.changeObj(oRef.getAobj());
        System.out.println("调用changeObj后："+oRef.getAobj());
        System.out.println("**********基本数据类型**********");
        System.out.println("调用changeInt前："+oRef.getaInt());
        oRef.changeInt(oRef.getaInt());
        System.out.println("调用changeInt后："+oRef.getaInt());

    }
}