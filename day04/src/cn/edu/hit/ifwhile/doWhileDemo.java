package cn.edu.hit.ifwhile;

public class doWhileDemo {
    // 别忘循环跳转的break和continue
    public static void main(String[] args) {
        doWhileTest();
    }

    public static void doWhileTest() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 4);
    }
}
