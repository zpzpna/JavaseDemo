import java.util.Scanner;

public class StringBuilderDemo {
    /*StringBuilder介绍
     * 字符串的缓冲区，理解为一个容器，可以存储任意数据类型，但是一进入容器就变成字符串*/
    public static void main(String[] args) {
        met();
        huiwen();
        int[] arr = {1, 2, 3, 4, 5};
        String s = array2string(arr);
        System.out.println(s);
    }

    public static void ti() {
        long start = System.currentTimeMillis();
        // 用来计数，1970.1.到现在的毫秒数
        String s = "a";
        for (int i = 0; i < 10000000; i++) {
            s += "A";
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start));
        // StringBuilder效果：提高字符串运算效率
    }

    public static void cons() {
        /*StringBuilder构造
         * 空参：造一个容纳16字符容器，如果超过就会自动扩充
         * 可以放字符数组，字符串，辅助初始化
         * 或者用数字指定初始大小*/
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder(32);
        StringBuilder s2 = new StringBuilder("asd");

    }

    public static void met() {
        /*StringBuilder 常用方法
         * append：添加数据，并且返回对象本身
         * reverse：将缓冲区内容反转
         * length()，长度
         * toString():转换为String类型*/

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = s1.append("blue");
        System.out.println(s2 == s1);
        // 注意：返回对象本身可以不断的链式使用方法，也可以无限substring，但length()不行
        StringBuilder s3 = s2.append(1).append(2).append(3).reverse();
        System.out.println(s3);
    }

    public static void huiwen() {
        // string和stringbuilder转换
        // 一个是直接创建sb，一个使用tostring
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        StringBuilder s = new StringBuilder(ss);
        // 注意要使用相同类型比较，而且不可以使用链式比较一个变量
        if (ss.equals(s.reverse().toString())) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }

    }

    public static String array2string(int[] arr) {
        // 将数组中值变成字符串输出
        // 拼接用stringbuilder的append
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(",");
        }
        sb.append(arr[arr.length - 1]).append("]");

        return sb.toString();
    }
}
