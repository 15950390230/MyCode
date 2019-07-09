package 数据结构与算法.哈希表.学生信息;

public class StuInfo {
    private int age ;
    private int count;
//返回散列函数值

/*散列函数*/

    @Override
    public String toString() {
        return "StuInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }

    public StuInfo(int age) {
        this.age = age;
    }

    public StuInfo() {
    }

    public int hashCode(){
        return age%10;

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public StuInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }
}
