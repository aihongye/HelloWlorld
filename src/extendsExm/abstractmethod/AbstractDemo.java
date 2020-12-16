package extendsExm.abstractmethod;
//任何含有一个或多个抽象方法的类都必须声明成抽象类。声明一个抽象类，只需在类
//声明开始时在关键字class前使用关键字abstract。抽象类没有对象。也就是说，一个抽象类
//不能通过new操作符直接实例化
//尽管不可能创建一个Figure类型的对象，你可以创建一个Figure类型的引用变量
//Figure figref; // this is OK, no object is created
//变量figref声明成Figure的一个引用，意思是说它可以用来引用任何从Figure派生的对象。
public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}
