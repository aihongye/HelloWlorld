package extendsExm.interfaceExam;
//如你所见，被调用的callback( )的形式由在运行时c引用的对象类型决定。这是一个非
//常简单的例子，下面你将会看到另一个例子，它更实用。
public class TestIface2 {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob; // c now refers to AnotherClient object
        c.callback(42);
    }
}
