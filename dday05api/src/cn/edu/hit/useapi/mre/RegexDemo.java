package cn.edu.hit.useapi.mre;

public class RegexDemo {
    public static void main(String[] args) {
        /*正则表达式：用一个字符串作为规则校验其他的字符串
         *
         * 1.字符类：
         * --------------------------------------------
         * [abc]         只能是a,b,c中一个字符
         * [^abc]        除了abc外的任意一个字符
         * [a-zA-Z]      a到z，A到Z，包括边界
         * [a-z[m-p]]    a到d或m到p，也可以写作[a-zm-p],本质上不同范围间如果是或，[]任意加，默认不同范围间没有&&就是或，有了就是且
         * [a-z&&[def]]  d，e，f中一个字符
         * [a-z&&[^bc]]  a到z除了bc
         * [a-z&&[^m-p]] a到z除了m到p
         * --------------------------------------------
         * []代表一个字符限制
         * [^]代表非
         * -代表范围
         * &&代表同时发生，不写代表可发生可不发生
         * */

        /*虽然有的时候不同范围不加[]也可以，不过&&时必须加上，其他情况最好加上,
         *
         * 具体来说，就是一个字符有多个范围规则&&时，一般右边的一个规则用一次[]嵌套
         * 总共n个&&连起来的规则，会n-1次嵌套[]*/
        System.out.println("s".matches("[a-z&&[^b-s]]"));
        System.out.println("s".matches("[a-z&&[^b-s&&[^a]]]"));

        /*预定义字符类
         * -------------------------
         *  .    任意字符
         *  \d   一个数字        [0-9]
         *  \D   非数字          [^0-9]
         *  \s   一个空白字符     [ \t\n\x0B\f\r]
         *  \S   非空白          [^\s]
         *  \w   字母，数字，下划线[a-zA-Z0-9_]
         *  \W   其他字符
         * -------------------------*/

        /*用一个slash会变成转义字符*/
        System.out.println("2".matches("\\d"));
        System.out.println("_".matches("[a-zA-Z0-9_]"));
        /*由于后两个a没有匹配导致出现了问题*/
        System.out.println("aaa".matches("."));


        /*数量：
         * X?    1次或0次
         * X*    0次或多次
         * X+    1次或多次
         * X{n}  正好n次
         * X{n,} 至少n次
         * X{n,m}至少n次但不超过m次*/
        System.out.println("2221".matches("\\d{3,5}"));

        test();
    }

    public static void test() {
        System.out.println("------------------------");
        /*qq正则*/
        String qqRegex = "[1-9]\\d{4,11}"; //也可以[\\d&&[^0]]
        System.out.println("123223375".matches(qqRegex));

        /*手机号正则*/
        String telRegex = "[1][3-9]\\d{9}";// 一般都是使用[]区分不同位置
        System.out.println("13718818988".matches(telRegex));

        /*邮箱号正则*/
        /*有的正则可能出现多次，因此用小括号括起来，然后用+代表多次出现*/
        String emailRegex = "\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("zhangsan@qq.cn.com".matches(emailRegex));

        /*String中与正则有关方法放回String位置*/
    }
}

