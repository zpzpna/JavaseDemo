package cn.edu.hit.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    /*
     * 集合相对于数组，可以自动扩容，但集合的底层是数组实现的，不能舍弃数组
     * arraylist扩充原理：首先创建一个10元素底层数组，装满了就新建1.5倍大小新数组，然后将数据迁移进去
     *
     * 集合和数组选择：
     * 数组：存储的元素个数固定不变
     * 集合：存储的元素个数经常发生改变
     *
     * 集合不在java.lang包里*/
    public static void main(String[] args) {
        construct();
        constructTest();
        mulMethod();
    }

    public static void construct() {
        /*arraylist使用：
         * 1.构造方法：
         *
         *       public ArrayList():创建一个初始大小10的容器
         *       public ArrayList(int):指定初始容量
         *       public ArrayList(collection):指定集合内容创建集合
         *
         *
         *
         * 创建细节：
         *
         *       1.创建String，StringBuilder，ArrayList类的对象，打印对象名没有地址值
         *       2.直接创建可以添加任意数据，但是容易出错且会警告。
         *         - 使用<>指定集合内元素唯一类型
         *         - 注意jdk>=7后，只需要前面指定<>中类型，后面<>类型不需要指定
         *         - <>：泛型，在集合中，对集合的存储数据进行限制，不可以使用基本的数据类型
         *         - 解决：使用引用数据类型（基本数据类型的包装类，8个）
         *
         *              byte：   Byte
         *              short：  Short
         *              int：    Integer
         *              long：   Long
         *              float：  Float
         *              double： Double
         *              boolean：Boolean
         *              char：   Character
         *
         *      3.集合屏蔽了数组空元素细节，只要关注加入的元素*/


        ArrayList list = new ArrayList();
        list.add("章三");
        list.add("李四");
        list.add(11);
        list.add(2.1);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("name");
        list2.add("age");
        list2.add("sex");
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);


    }

    public static void constructTest() {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(11.1);
        list1.add(22.2);
        list1.add(33.3);
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        System.out.println(list2);
    }

    public static void mulMethod() {
        /*arraylist 常用方法：
         *       1.增
         *          public boolean add(E e)         // 返回是否添加成功，但是源码永远返回true，因为默认不会失败
         *          public void add(int index,E e)  // 在指定索引位置插入元素，！注意，不能插入集合已有元素尾部后的数据，比如list1，
         *                                             插入3个数据，第四个数据索引位最多插入3，从4开始报错
         *
         *       2.删
         *          public E remove(int index)      // 根据索引删除对应位置元素，返回被删除元素e,一般用这个全删除
         *          public boolean remove(Object o) // 根据元素删除，返回是否成功删除到指定元素e，用这个一个遍历只能删顺序第一个e
         *       3.改
         *          public E set(int index,E element) // 修改index位置为e，返回被覆盖的元素
         *       4.查
         *          public E get(int index)         // 根据索引获取对应位置元素，并返回对应值
         *          public int size():              // 返回集合中元素个数
         *
         * 关于E类型，就是泛型中填写的类型，根据我填写的类型进行变换*/
        System.out.println("------add------");
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan1");
        list.add("zhangsan2");
        list.add("zhangsan3");
        list.add(1, "zhangsan4");
        System.out.println(list);

        System.out.println("------del------");
        list.remove(0);
        System.out.println(list);
        System.out.println(list.remove("zhangsan3"));
        System.out.println(list);

        System.out.println("------set------");
        list.set(0, "李dz");
        System.out.println(list);
    }
}
