package 数据结构与算法.树结构.赫夫曼树_最优二叉树.数据压缩之创建赫夫曼树;

import java.io.*;
import java.util.*;

public class TestHuffmanCode {
    public static void main(String[] args) {
//
//        String msg="can you can a can as a can canner can a can";
//        byte[] bytes=msg.getBytes();
////        //        进行赫夫曼编码
//        byte[] b=huffmanzip(bytes);
////        使用赫夫曼编码进行解码
//        byte[] newbytes=decode(huffCodes,b);
////        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(newbytes));
        String src="";
        String dst="";
//        try {
//            zipFile(src,dst);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            UnZip("src",dst);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    解压文件
    public static void UnZip(String src,String dsc) throws Exception {
//        创建一个输入流
        InputStream is = new FileInputStream("drc.zip");
        ObjectInputStream ois =new ObjectInputStream(is);
//        读取byte数组
        byte[] b=(byte[])ois.readObject();
//        读取赫夫曼编码表
        Map<Byte,String> code=(Map<Byte,String>)ois.readObject();
        ois.close();
        is.close();
//        解码
       byte[] bytes= decode(code,b);
//       创建一个输出流存取解码后的文件
        OutputStream os=new FileOutputStream(dsc);
        os.write(bytes);
        os.close();

    }
//压缩文件
    public static void zipFile(String src,String dst) throws IOException{

//            创建一个输入流
            InputStream is=new FileInputStream(src);
//            创建一个和输入流只想的文件大小一样的byte数组
            byte[] b=new byte[is.available()];
//            读取文件内容
            is.read(b);
            is.close();
            byte[] bytezip=huffmanzip(b);
            OutputStream os=new FileOutputStream(dst);
            ObjectOutputStream oos=new ObjectOutputStream(os);
//            把压缩后的byte数组写入文件
            oos.writeObject(bytezip);
//            把赫夫曼编码表写入文件
            oos.writeObject(huffCodes);
            oos.close();
            os.close();
    }


//使用指定的赫夫曼编码表进行解码
    private static byte[] decode(Map<Byte, String> huffCodes, byte[] bytes) {
        StringBuilder sb=new StringBuilder();
//        把byte数组转换为一个二进制的字符串
        for (int i=0;i<bytes.length;i++) {
            byte b=bytes[i];
//            判断是否是最后一数如果是则不补齐八位
            boolean flag=(i==bytes.length-1);
          sb.append(byteToBitStr(!flag,b));
        }
//        System.out.println(sb.toString());


//        把字符串按照指定的赫夫曼编码进行解码
//        把赫夫曼编码的字符串进行键值调换
        Map<String, Byte> map=new HashMap<>();
        for (Map.Entry<Byte,String> entry:huffCodes.entrySet()) {
            map.put(entry.getValue(),entry.getKey());
        }
//        创建一个集合用于存放byte
        List<Byte> list=new ArrayList<>();
//        处理字符串
        for (int i = 0; i <sb.length(); ) {
            int count=1;
            boolean flag=true;
            //取出一个byte
            Byte b=null;
            while (flag){
                String Key=sb.substring(i,i+count);
                 b=map.get(Key);
                if (b==null)
                {
                    count++;
                }
                else
                {flag=false;}
            }
            System.out.println(b);
            list.add(b);
            i+=count;
        }
//        System.out.println(list);
        byte[] b=new byte[list.size()];
        for (int i = 0; i <b.length ; i++) {
            b[i]=list.get(i);
        }
        return b;
    }
//将字符串转换为8位
    private static String byteToBitStr(Boolean flag,byte b){
        int temp =b;
        if (flag){
            temp |=256;
        }
        String str=Integer.toBinaryString(temp);
//        获取后八位
        if (flag){
            return str.substring(str.length()-8);
        }
        else
        {
            return str;
        }
    }
    /*进行赫夫曼压缩的方法*/
    public static byte[] huffmanzip(byte[] bytes) {
//        统计每一个字符出现的次数并放入集合中
        List<Node> nodes=getNodes(bytes);
//        创建一颗赫夫曼树
        Node tree=creatHuffmanTree(nodes);
//        System.out.println(tree);
//        创建赫夫曼编码表
        Map<Byte,String>huffCodes=getCodes(tree);
//        System.out.println(huffCodes);
//        编码
        byte[] b=zip(bytes,huffCodes);
        return b;
    }

    private static byte[] zip(byte[] bytes, Map<Byte, String> huffCodes) {
        StringBuilder sb=new StringBuilder();
//      把需要压缩的数组转换为处理过的二进制数组
       for (byte b:bytes){
           sb.append(huffCodes.get(b));
       }
//        System.out.println(sb.toString());
//       定义长度
        int len;
        if (sb.length()%8==0){
            len=sb.length()/8;
        }
        else
        {
            len=sb.length()/8+1;

        }
//        System.out.println(sb.toString());

//        用于存储压缩后的byte
        byte[] by=new byte[len];
        int index=0;
//        记录新的byte的位置
        for (int i = 0; i <sb.length() ; i+=8) {
            String  sbs;
            if (i+8>sb.length()){
                sbs= sb.substring(i);
            }else{
                sbs= sb.substring(i,i+8);
            }
            byte num=(byte) Integer.parseInt(sbs,2);
            by[index]=num;
            index++;
//            System.out.println(sbs+":"+num);

        }
        return by;
        

    }

    private static List<Node>getNodes(byte[] bytes){
        List<Node> nodes =new ArrayList<>();
        Map<Byte,Integer>counts=new HashMap<>();
//        统计每一个byte出现的次数
        for (byte b : bytes){
            Integer count=counts.get(b);
            if (count==null){
                counts.put(b,1);
            }
            else
            {
                counts.put(b,count+1);
            }
        }
//        System.out.println(counts);
//        把每一个键值对转换为Node对象
//        Map.Entry将map转为entry方便去取出key和value
        for(Map.Entry<Byte, Integer> entry: counts.entrySet()){
            nodes.add(new Node(entry.getKey(),entry.getValue()));
        }
        return nodes;

    }
    /*
    * 创建赫夫曼树
    * */
    private static Node creatHuffmanTree(List<Node> nodes){
        while (nodes.size()>1)
        {
////            先排序
        Collections.sort(nodes);
//        取出两个权值最低的二叉树
            Node left= nodes.get(nodes.size()-1);
            Node right= nodes.get(nodes.size()-2);
            Node parent=new Node(null,left.weight+right.weight);
//        System.out.println(nodes);
//            把之前取出来的两颗二叉树移除
            parent.left=left;
            parent.right=right;
            nodes.remove(left);
            nodes.remove(right);
//            添加新的节点把新创建的二叉树加入集合
            nodes.add(parent);

        }


        return nodes.get(0);
    }
//   赫夫曼编码
//    用于临时存取路径
    static StringBuilder sb=new StringBuilder();
//    用于存储赫夫曼编码
    static Map<Byte,String> huffCodes=new HashMap<>();
//    根据赫夫曼树获赫夫曼编码
    private static Map<Byte,String>getCodes(Node tree){
        if (tree==null){
            return null;

        }
        getCodes(tree.left,"0",sb);
        getCodes(tree.right,"1",sb);
        return huffCodes;
    }

    private static void getCodes(Node node, String code, StringBuilder sb) {
        StringBuilder sb2=new StringBuilder(sb);
        sb2.append(code);
        if (node.data==null){
            getCodes(node.left,"0",sb2);
            getCodes(node.right,"1",sb2);
        }
        else{
            huffCodes.put(node.data,sb2.toString());
        }
    }
}
