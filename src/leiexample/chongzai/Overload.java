package leiexample.chongzai;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        Double result ;
        //调用所有版本的test（）
        od.test();
        od.test(88);
        od.test(10,20);
        result = od.test(123.45);
        //OverloadDemo 的这个版本没有定义test(int)。因此当在Overload内带整数参
        //数调用test()时，找不到和它匹配的方法。但是，Java可以自动地将整数转换为double型，这
        //种转换就可以解决这个问题。因此，在test(int)找不到以后，Java将i扩大到double型，然后
        //调用test(double)。当然，如果定义了test(int)，当然先调用test(int)而不会调用test(double)。
        //只有在找不到精确匹配时，Java的自动转换才会起作用

    }
}
