package cn.edu.hit.exception;

public class StudentTest {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public StudentTest() {

    }

    public StudentTest(String name, int age, int chinese, int math, int english) {
        this.name = name;
        setAge(age);
        setChinese(chinese);
        setMath(math);
        setEnglish(english);
    }

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
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new SetStuAgeException("年龄应该在0-120之间");
        }
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        if (chinese >= 0 && chinese <= 100) {
            this.chinese = chinese;
        } else {
            throw new SetGradeExcepton("输入的成绩不在0-100之间");
        }
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        if (math >= 0 && math <= 100) {
            this.math = math;
        } else {
            throw new SetGradeExcepton("输入的成绩不在0-100之间");
        }
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        if (english >= 0 && english <= 100) {
            this.english = english;
        } else {
            throw new SetGradeExcepton("输入的成绩不在0-100之间");
        }
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }
}

class SetStuAgeException extends RuntimeException {
    public SetStuAgeException() {
    }

    public SetStuAgeException(String message) {
        super(message);
    }
}

class SetGradeExcepton extends RuntimeException {
    public SetGradeExcepton() {
    }

    public SetGradeExcepton(String message) {
        super(message);
    }
}