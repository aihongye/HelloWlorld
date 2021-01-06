package extendsExm.interfaceExam;

public class Client implements Callback {
    // Implement Callback's interface
    //注意：当实现一个接口方法时，它必须声明成public。
    //类在实现接口时定义它自己的附加的成员，既是允许的，也是常见的。例如，下面的
    //Client版本实现了callback( )方法，并且增加了nonIfaceMeth( )方法。
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +"may also define other members, too.");
    }
}
