package cn.edu.hit.arraylist;

import cn.edu.hit.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTestDemo {
    public static void main(String[] args) {
        // 理解：对于集合，通过泛型固定类型，通过对象扩展集合元素类型
        traverseAll();
        System.out.println("-----");
        traversePart();
        System.out.println("-----");
        traverseClass();
        System.out.println("-----");
        traverseClassPlus(3);
        System.out.println("-----");
        delPart();
        System.out.println("-----");
        ArrayList<Student> list = createInfo();
        ArrayList<Student> list2 = listChoose(list);

    }

    public static void traverseAll() {
        // 创建一个字符串集合，存储三个元素，遍历集合每个元素
        ArrayList<String> list = new ArrayList<>();
        list.add("zhang1");
        list.add("zhang2");
        list.add("zhang3");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 类似数组，集合也有遍历fori快捷键
    }

    public static void traversePart() {
        // 创建一个字符串集合，存储：钢门吹雪，西域狂鸭，张三，甄妮马岱静，李四，将四个字的人名输出
        ArrayList<String> list = new ArrayList<>();
        list.add("钢门吹雪");
        list.add("西域狂鸭");
        list.add("张三");
        list.add("甄妮马岱静");
        list.add("李四");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (4 == str.length()) {
                System.out.println(str);
            }
        }
    }

    public static void traverseClass() {
        // 创建一个存储学生对象的集合，存储三个学生对象，遍历集合
        // 输出年龄小于16的学生信息
        Student stu1 = new Student(1, 12, "ldz");
        Student stu2 = new Student(2, 13, "wdz");
        Student stu3 = new Student(3, 17, "adz");
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getAge() < 16) {
                System.out.println(stu.getAge() + "--" + stu.getName());
            }
        }
    }

    public static void traverseClassPlus(int n) {
        // 键盘录入三个学生信息创建学生对象后加入集合并遍历
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            addStudent(list);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "-" + stu.getAge());
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名");
        String name = sc.next();
        System.out.println("年龄");
        int age = sc.nextInt();
        System.out.println("学号");
        int sno = sc.nextInt();
        Student stu = new Student(sno, age, name);
        list.add(stu);
    }

    public static void delPart() {
        // 创建一个存储String集合，存储test，张三，李四，test，test字符串，删除所有test字符串后输出剩余集合
        // 关键在于遍历删除后集合元素顺序变化
        // 正向删除中，当前元素是要删除元素，删除后，下一个元素会来到当前位置，所以for循环每次最后要一次i--回到原位，不然会漏掉元素
        // ！！和c中不同，c中删除数组所有元素e，用k移动法，这是因为数组不会删除后自动移动填充空缺

        // 反向删除中，删除后指针向前，后面元素向前，互不影响
        // 集合删除思路一般是上述两种
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("zhangsan");
        list.add("lisi");
        list.add("test");
        list.add("test");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if ("test".equals(str)) {
                // 注意：调用方法时尽量用常量做，不然变量可能为null出现空指针异常
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    public static ArrayList<Student> listChoose(ArrayList<Student> rawList) {
        // 输入一个Student集合，选择岁数小于18的加入新集合，返回新集合
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < rawList.size(); i++) {
            Student stu = rawList.get(i);
            if (18 <= stu.getAge()) {
                newList.add(stu);
                System.out.println(stu.getAge() + "--" + stu.getName());
            }
        }
        return newList;
    }

    private static ArrayList<Student> createInfo() {
        Student stu1 = new Student(1, 19, "ss1");
        Student stu2 = new Student(2, 9, "ss2");
        Student stu3 = new Student(3, 29, "ss3");
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        return list;
    }
}
