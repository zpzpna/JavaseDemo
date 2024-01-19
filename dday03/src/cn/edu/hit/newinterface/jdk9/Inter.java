package cn.edu.hit.newinterface.jdk9;

public interface Inter {
    /*私有方法是为了对jdk8中的默认方法和静态方法进一步抽象
     * 如果接口中多个方法有共同部分，可以使用私有方法抽象，只是给这些public方法用
     * 私有方法也可以静态，这只是为了能够给静态方法用*/

    private static void newMethod3() {
        System.out.println("私有方法");
    }

    private void newMethod() {
        System.out.println("私有static方法");
    }

    default void newMethod2() {
        newMethod();
    }
}
