package cn.edu.hit.Test;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("ww", 20);
        t.teach();

        Student s = new Student("www", 20, 99);
        s.study();
    }
}

