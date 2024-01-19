package cn.edu.hit.newinterface.jdk8;

public interface Inter {
    /*jdk8接口新特性：
     * 1.允许接口中定义非抽象方法，但是需要关键词default修饰，这些方法就是默认方法
     *       作用：解决接口升级问题
     *       注意：写默认方法，可以省略public，但是不可以省略default
     * - 重写接口方法
     *      这种具体方法也可以重写，但是如果要用原有的默认方法，需要接口名.super.方法，代表找实现的上级接口，super.代表找父类
     *
     * 2.允许定义静态方法
     *      由于接口放开了default，所以自然也可以写静态方法，注意静态方法也可以省略public，但是不可以省略static
     *      接口中静态方法不允许实现类用对象调用，只能用接口名调用*/
    void show();

    void print();

    default void newMethod() {
        System.out.println("新增加的方法");
    }

    /*注意：由于可以用默认方法了，如果使用多实现，并且多个接口有相同默认方法，那么就必须重写这个默认方法*/

    static void newMethod2() {
        System.out.println("新的静态方法");
    }
}

class A implements Inter {
    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void print() {
        System.out.println("print...");
    }
}

class B implements Inter {
    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void print() {
        System.out.println("print...");
    }
}
