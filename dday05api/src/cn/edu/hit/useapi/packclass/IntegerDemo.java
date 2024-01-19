package cn.edu.hit.useapi.packclass;

public class IntegerDemo {
    /*包装类：将基本数据类型，包装成类，变成引用数据类型
     * ---------------------------------------------------
     * 手动装箱：调用方法，手动将基本数据类型，包装成类
     *       - public Integer(int value) : 通过构造方法（过时）
     *       - public static Integer valueOf(int i) : 通过静态方法
     *
     * 手动拆箱：调用方法，手动将包装类，拆成基本数据类型
     *
     *       - public int intValue(): 以int返回Integer的数值*/
    public static void main(String[] args) {
        int num = 10;
        // Integer i1 = new Integer(num); 已经被淘汰了

        /*根据查看的源码，这个速度加快，使用了一个类IntegerCache来储存了-128-127的整数类数组，在这个范围内直接取出，不在就需要创建后输出
         * 这个IntegerCache是一个静态成员内部类 */
        Integer i1 = Integer.valueOf(10);

        // 拆箱：
        int i = i1.intValue();
        // jdk5后自动装箱和拆箱
        Integer i2 = num;
        int i3 = i2;


        /*常用方法：
         * public static String toBinaryString(int i)    转二进制
         * public static String toOctalString(int i)     转八进制
         * public static String toHexString(int i)       转十六进制
         * public static int parseInt(String s)          数字字符串转为数字*/
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.parseInt(10 + "123"));

        test();
    }

    public static void test() {
        String s = "10,50,30,20,40";
        String[] ss = s.split(",");
        int[] arr = new int[ss.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ss.length; i++) {
            arr[i] = Integer.parseInt(ss[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }


}
