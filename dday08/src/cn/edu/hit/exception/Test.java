package cn.edu.hit.exception;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentTest> stu = new ArrayList<>();
        String name;


        for (int i = 0; i < 3; i++) {
            System.out.println("-----------创建第" + (i + 1) + "个学生------------");
            StudentTest studentTest = new StudentTest();

            System.out.println("请输入姓名");
            studentTest.setName(sc.nextLine());
            while (true) {
                try {
                    System.out.println("请输入年龄");
                    studentTest.setAge(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("请输入整数值");
                } catch (SetStuAgeException e) {
                    System.out.println("学生年龄应该在0-100之间");
                }
            }
            while (true) {
                try {
                    System.out.println("请输入语文成绩");
                    studentTest.setChinese(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("请输入整数值");

                } catch (SetGradeExcepton e) {
                    System.out.println("成绩应该在0-100之间");
                }
            }
            while (true) {
                try {
                    System.out.println("请输入数学成绩");
                    studentTest.setMath(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("请输入整数值");

                } catch (SetGradeExcepton e) {
                    System.out.println("成绩应该在0-100之间");
                }
            }
            while (true) {
                try {
                    System.out.println("请输入英语成绩");
                    studentTest.setEnglish(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("请输入整数值");

                } catch (SetGradeExcepton e) {
                    System.out.println("成绩应该在0-100之间");
                }
            }
            stu.add(studentTest);
        }
        for (int i = 0; i < stu.size(); i++) {
            StudentTest studentTest = stu.get(i);
            System.out.println(studentTest.toString());
        }
    }
}


