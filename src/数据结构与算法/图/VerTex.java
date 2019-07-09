package 数据结构与算法.图;

/*顶点类*/

public class VerTex {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "VerText{" +
                "value='" + value + '\'' +
                '}';
    }

    public VerTex(String value) {
        this.value = value;
    }
}
