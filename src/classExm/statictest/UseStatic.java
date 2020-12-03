package classExm.statictest;
//Java的访问指示符有public（公共的，全局的）、private（私有的，局部的）、和protected
//（受保护的）。Java也定义了一个默认访问级别。指示符protected仅用于继承情况中。下面
//我们描述其他两个访问指示符。

//如果一个成员被声明为static，它就能够在它的类的任何对象创建之前被访问，而不必引用任何对象
//一个变量可以声明为final，这样做的目的是阻止它的内容被修改。这意味着在声明final
//变量的时候，你必须初始化它

//该类有一个static方法，一些static变量，以及一个static初始化块
class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String args[]) {
        meth(42);
    }
    //声明为static的变量实质上就是全局变量。当声明一个对象时，并不产生static变量的拷
    //贝，而是该类所有的实例变量共用同一个static变量。
    //声明为static的方法有以下几条限制：
    //        · 它们仅能调用其他的static方法。
    //        · 它们只能访问static数据。
    //        · 它们不能以任何方式引用this或super（关键字super与继承有关，在下一章中描述）。
    //注意：在一个static方法中引用任何实例变量都是非法的。
}
