package cn.edu.hit.Test;

public class Student extends People {
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public void study() {
        System.out.println(super.getName() + "考了" + score);
    }
}
