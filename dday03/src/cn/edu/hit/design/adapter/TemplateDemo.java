package cn.edu.hit.design.adapter;

public class TemplateDemo {
    /*模板设计模式
     *将抽象类本身当作一个模板，
     * 其中不能确定的部分变成抽象方法，子类重写抽象方法从而使用其他的方法
     * 不能改变的模板用final修饰，
     * ！这样，只需要关注模板内可以修改的函数即可*/
    public static void main(String[] args) {
        Article a = new ComArticle();
        a.write();
        /*这里顺顺便用了个多态*/
    }
}

abstract class Article {
    public final void write() {
        /*不能让子类修改模板！*/
        System.out.println("我的奋斗");
        head();
        body();
        end();
    }

    public abstract void head();

    public abstract void body();

    public abstract void end();
}

class ComArticle extends Article {
    @Override
    public void head() {
        System.out.println("爱奋斗使我成功");
    }

    @Override
    public void body() {
        System.out.println("究竟为什么爱奋斗使我成功，我也很不明白");
    }

    @Override
    public void end() {
        System.out.println("大家都要奋斗");
    }
}