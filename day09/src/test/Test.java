package test;

import cn.edu.hit.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----欢迎进入学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");

            int service = sc.nextInt();
            switch (service) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    System.out.println("请输入要删除学生的学号");
                    int sno = sc.nextInt();
                    deleteStudentInfoById(sno, list); // 注意这种删除，增加，更新，查询的命名规则
                    break;
                case 3:
                    System.out.println("请输入要更新学生的学号"); // 注意，上面创建了sno，下面即使break看不到也可以不用初始化
                    sno = sc.nextInt();
                    updateStudentInfoById(sno, list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("成功退出系统");
                    System.exit(0); // 0代表成功退出，其他数字都代表异常退出。这个是用来关闭java虚拟机的函数
                    break;
            }
        }
    }

    private static int getIndex(int sno, ArrayList<Student> list) {
        // 注意这种遍历找东西，预先设置一个变量！！精髓
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (sno == stu.getSno()) {
                index = i;
            }
        }
        return index;
    }

    private static boolean addStudent(ArrayList<Student> list) {
        /*输入学生信息后，增加学生对象到容器*/
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        int sno = sc.nextInt();
        if (-1 != getIndex(sno, list)) {    // 注意使用ifelse好处在于可以和flag组合设定返回值
            flag = false;
            System.out.println("已存在此学生");
        } else {
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            Student stu = new Student(sno, age, name);
            list.add(stu);
        }
        return flag;
    }

    private static void queryStudentInfos(ArrayList<Student> list) {
        // 查看容器中所有学生信息
        if (list.isEmpty()) {
            System.out.println("当前没有学生信息");
        } else {
            System.out.println("学号\t姓名\t年龄");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getSno() + "\t" + stu.getName() + "\t" + stu.getAge());
            }
        }
    }

    private static void deleteStudentInfoById(int sno, ArrayList<Student> list) {
        int index = getIndex(sno, list);
        if (-1 == index) {
            System.out.println("要删除的学生不存在");
        } else {
            list.remove(index);
            System.out.println("删除成功");
        }
    }

    private static void updateStudentInfoById(int sno, ArrayList<Student> list) {
        int index = getIndex(sno, list);
        if (-1 == index) {
            System.out.println("不存在这个学生");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            Student stu = new Student(sno, age, name);
            list.set(index, stu);       // 修改学生信息本质上，不是改对象，而是造一个新对象替换原来对象
            System.out.println("修改完成");
        }
    }
}
