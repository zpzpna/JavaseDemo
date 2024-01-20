package cn.edu.hit.exception;

public class CustomExceptionDemo {

}

/*自定义异常：
 * 编译时异常：继承Exception
 * 运行时异常：继承RunTimeException*/
class SetAgeException extends RuntimeException {
    /*自定义异常是为了缩小捕获的范围，不用广泛的Exception*/
    /*一般构造初始化会继承父类的初始化*/
    public SetAgeException() {
    }

    public SetAgeException(String message) {
        super(message);
    }
}

