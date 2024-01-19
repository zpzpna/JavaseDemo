package cn.edu.hit.mextends;


/*一般而言,一个类文件可以写多个类,只要保证彼此之间是平级关系,而不要使用内部类这种
 * 但是最好还是用规范写法*/
public class ExtendDemo {
    public static void main(String[] args) {
        Coder c = new Coder();
        /*注意:虽然父类private变量,子类用不了,但是,子类可以用父类的get和set方法
         * 继承主要是用来复用代码
         * 不要随便继承! */

        /*继承使用规则:
         * 两个类是共性内容,并且存在 is a 关系,就可以考虑使用继承*/
        c.setName("张三");


        /*继承成员变量访问:
         * 子类和父类中,出现了重名的变量,优先使用:子类中变量
         * 如果一定要用父类变量,使用super关键字,super调用父类成员*/
        c.print();

        /*继承成员方法
         * 子类出现和父类一样方法(名字,参数,返回值),注意要完全一致
         * 一般子类调用时优先调用自己的方法,这像就近原则,但其实是子类方法对父类方法进行了重写操作
         * 重载(overload):同名多方法,发生在一个类
         * 重写(override):同名单方法,父子类中*/

        /*什么时候重写:
         * 觉得父类方法写的不好,就需要在子类重写优化增强*/

        /*注意事项:
         * 父类中私有的方法不能重写,因为根本访问不到,
         * 子类重写父类方法,权限必须>=父类*/

        /*protected权限理解：
         * Fu zi Test 类
         * Zi继承Fu，Zi类大括号中可以用父类protected变量和方法，但是Test中创建Zi对象不可以调用Fu中protected方法*/

        /*java继承：
         * java支持单继承，不支持多继承，但是可以多层继承
         * A-> B,C 错误
         * A->B->c 正确*/

        /*一般学习继承体系，先从父类开始*/

        /*构造方法：
         * 子类不可以继承父类的构造方法，所以要写自己的构造方法
         * 子类需要先完成父类的初始化操作，因为子类可能用父类的东西
         * 因此子类需要访问父类的构造方法
         * 注意：一般默认子类构造方法有super()隐藏，代表子类进行对父类的空参初始化*/
    }
}

class Employee {
    private String name;
    private int age = 20;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Coder extends Employee {
    int age = 10;

    public void print() {
        System.out.println(super.getAge());
        System.out.println(age);
    }
}

class Manager extends Employee {

}

class People {
    public void method() {
        System.out.println("1");
    }
}

class Student extends People {
    // 注意:如果参数个数,顺序,类型不同,本质是重载,因为类中还有继承的方法
    // 加了@Override不报错就是重写


    @Override
    public void method() {
        super.method();
        // 如果只想添加东西,就在下面加,如果完全修改,就删去super方法自己写
        // 记住方法名可以直接输入后idea补全,或者alt insert补全
    }
}