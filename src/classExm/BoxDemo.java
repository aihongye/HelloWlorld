package classExm;

public class BoxDemo {
    public static void main(String[] args) {
        //类是一个逻辑构造，对象有物理的真实性（也就是对象占用内存空间）。弄清楚这个区别是很重要的
        /*Box myBox1= new Box();
        Box myBox2= new Box();
        myBox1.high = 2;
        myBox1.width = 3;
        myBox1.length = 4;
        myBox2.high = 5;
        myBox2.width = 6;
        myBox2.length = 7;

        double vol1 = myBox1.width*myBox1.length * myBox1.high;
        double vol2 = myBox2.width*myBox2.length * myBox2.high;
        System.out.println("this is boxdemo!!");
        myBox1.volum();
        myBox2.volum();
        double vol = myBox1.volum2();
        System.out.println("返回myBox2的体积,调用方法volum2,面积= "+myBox1.volum2() );
        System.out.println("返回6的平方= "+ myBox1.spuare(6));*/
        //Box myBox3 = new Box();
        //myBox3.setDim(1,3,5);
        //System.out.println("返回myBox3的体积，调用方法volum2,面积= "+myBox3.volum2());

        //调用带自变量的构造函数
        Box myBox4 = new Box(2,3,5);
        System.out.println("调用带自变量的构造函数 体积="+myBox4.volum2());
    }
}
