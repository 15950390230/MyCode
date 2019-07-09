package 面试宝典.值传递与引用传递;
class Obj{
    private int anInt;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
    public void changeInt(){
        this.anInt=1;
    }
}
public class TestRef {
    public static void main(String[] args) {

        Obj a=new Obj();
        Obj b=a;
        b.changeInt();
        System.out.println("a:"+a.getAnInt());
        System.out.println("b:"+b.getAnInt());

    }
}
