package extendsExm.interfaceExam;
//警告：因为Java中在运行时动态查询方法与通常的方法调用相比会有一个非常庞
//大的花费，所以在对性能要求高的代码中不应该随意的使用接口。
//下面的例子通过接口引用变量调用callback( )方法
public class TestIface {
    public static void main(String[] args) {
        Callback C = new Client();
        C.callback(33);
    }
//注意变量c被定义成接口类型Callback，而且被一个Client实例赋值。尽管c可以用来访
//问Callback（）方法，它不能访问Client类中的任何其他成员。一个接口引用变量仅仅知道
//被它的接口定义声明的方法。因此，c不能用来访问nonIfaceMeth( )，因为它是被Client定义
//的，而不是由Callback定义。
}
