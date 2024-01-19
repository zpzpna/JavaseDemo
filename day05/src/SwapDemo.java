public class SwapDemo {
    // 一种是基本的交换操作，一种是不准第三方的交换，用异或操作
    // 异或操作特点：1.相同为false，不同为true。2.一个数对另一个数字做两次异或，值不变
    public static void main(String[] args) {
        swapTest(1, 33);
    }

    public static void swapTest(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "," + b);
    }
    // 数组反转：注意使用循环次数应该是数组长度的一半


    // 验证码生成：先把所有字母数字放进一个数组，然后随机抽取五次
    // 为了验证，我们先生成一个空字符串，然后每生成一次字符，就连接一次
    // 之后获取用户输入验证码，对比即可，equals
    // 打印字符数组会自动进行遍历！
}

