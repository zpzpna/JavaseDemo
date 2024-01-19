package cn.edu.hit.domain;

public class Student {
    private int sno;

    public Student(int sno, int age, String name) {
        this.sno = sno;
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    public Student() {
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
