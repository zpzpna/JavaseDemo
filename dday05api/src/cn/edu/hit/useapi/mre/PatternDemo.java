package cn.edu.hit.useapi.mre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    /*正则表达式的封装类
     * 可用于爬取数据*/

    /*一般用static Pattern compile(String regex)生成Pattern
     * 然后用matcher创建匹配器Matcher对象*/

    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，" +
                "电话：18666668888，18699997777或者联系" +
                "邮箱：boniu@itcast.cn 邮箱：bozai@itcast.cn 邮箱2：dlei0009@163.com" +
                "座机电话：01036517895，010-98951256 " +
                "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";

        String regex = "[1][3-9]\\d{9}|\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+|[0]\\d{2,3}-?\\d{7,8}|400-?\\d{3}-?\\d{4}";
        /*注意，多个正则索引，可以用|符号来索引*/
        // 1.正则表达式创建pattern
        Pattern pattern = Pattern.compile(regex);
        // 2.输入原始数据生成匹配器
        Matcher matcher = pattern.matcher(data);
        // 3.循环匹配获取数值
        System.out.println(matcher.find());/*使用while(x.find)*/
        System.out.println(matcher.group()); //调用一次爬取一个数值，而且不能单独使用，要不停的find-group使用，不然每次都会重读原来的爬取值

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
