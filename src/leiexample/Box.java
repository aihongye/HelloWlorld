package leiexample;

public class Box {
    private double str;//私有变量，不能被外部类访问。
    double width;
    double length;
    double high;
    // display volume of a box
    //不带返回值的方法
    void  volum (){
        //当一个实例变量不是被该实例变量所在类的部分代码访问时，它必须
        //通过该对象加点运算符来访问。但是当一个实例变量被定义该变量的类的代码访问时，该
        //变量可以被直接引用。同样的规则也适用于方法。
        double vol = width * length * high;
        System.out.println("volume is = "+vol);
    }
    //带返回值的方法
    double volum2(){
         double vol;
        return  vol = width * length * high;
    }
    //在square()中，自变量i接收该值
    int spuare (int i){
        return i*i;
    }
    //带自变量的方法
    //区分自变量（parameter）和参数（argument）这两个术语是很重要的。自变量是方法
    //定义的一个变量，当方法被调用时，它接收一个值。例如在square()中，i就是一个自变量。
    //参数是当一个方法被调用时，传递给该方法的值。例如，square(100)把100作为参数传递。
    void setDim(double l,double w,double h){
        length = l;
        width = w;
        high = h;
    }
    //带自变量的构造函数
    //有时一个方法需要引用调用它的对象
    //尽管在下面的例子中，this没有有什么意义，但它在某种状况下是很有用的。
    Box(double length,double width,double high){
        this.length = length;
        this.width = width;
        this.high = high;
        System.out.println("调用带自变量的构造函数");
    }
    //Java不同的运行时刻会产生各种不同的垃圾回收办法，
    //但是对你编写的大多数程序，你不必须考虑垃圾回收问题
}
