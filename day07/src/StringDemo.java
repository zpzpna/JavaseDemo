public class StringDemo {
    /*String类特点
     * 唯一一个有特殊生成方式的类
     * 只要出现""这种字符串，就是创建一个对象
     * 一旦创建就不可以更改，注意，是字符串内容不可以改
     * 多次赋字符串没有事，这是因为本质上是给了个新的地址代替原有对象地址
     *
     * 口诀：创建后不可改，可以共享
     * */
    /*比较
     * 不能用==比较地址，*/
    public static void main(String[] args) {
        // 内存：字符串常量池。如果用""创建对象且之前没有用过，就会创建新的对象，否则共享池里对象
        // 字符串常量池在堆里（jdk>=7） 之前版本在方法区
        // 字符串对象比较特例
        String s1 = "123";
        String s2 = "123";
        System.out.println(s1 == s2); // true


        strVS();

        printi();

        sub();

        repl();
    }

    public static void strVS() {
        /*String构造方法
         * 1.无参构造，生成空串
         * 2.字符数组，将字符连接构造为一个对象
         * 3.根据传入的字符串创建
         * 这三个方法没有直接""方便，一般都是用""创建*/

        /*String对象直接创建和构造方法创建区别
         * 构造方法会在堆中开辟自己的空间，存放字符串常量池中对应字符串副本，注意：存的是底层的字符数组的地址！
         * 字符串底层数组：字节类型！
         * 双引号会进字符串常量池
         *
         * 此时==就会报错，用equals
         *
         * 最直接回答：内存地址不同
         * */

        /*字符串比较
         * equals : 大小写敏感
         * equalsIgnoreCase： 忽视大小写*/
        String ss = "aaa";
        System.out.println(ss.equals("aAa"));
        System.out.println(ss.equalsIgnoreCase("aAa"));
    }

    public static void printi() {
        /*字符串遍历和统计
         * toCharArray；转变为char[] 数组返回
         * charAt(int i )返回对应i位置字符
         * length()：不同于数组length，这里是一个方法，数组里length是一个属性*/
        String arr = "word";
        char[] chars = arr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length(); i++) {
            System.out.print(arr.charAt(i));
        }
        System.out.println();
    }

    public static void sub() {
        // 字符串截取
        String s = "hit.edu.cn";
        String s1 = s.substring(4);//指定首，直接到末端
        String s2 = s.substring(4, 7); //指定首尾，不包含尾
        System.out.println(s1);
        System.out.println(s2);

        // 用来对收到的收集生成 172****8383 这种字符串

    }

    public static void repl() {
        // 字符串替换
        String s = "hitsz";
        String s1 = s.replace("sz", "wh");
        System.out.println(s1);
        // 可以用来做敏感词替换

        /*还有replaceAll方法
         * publci String replaceAll(String regex,String newStr)*/
    }

    public static void splitre() {
        // 字符串切割

        // 根据传入的正则表达式规则切割
        // 最简单可以用','
        // .代表任意字符，如果只想要用.切割就用\\,来做
        // 注意没有得到想要的切割时都要尝试\\

    }

}
