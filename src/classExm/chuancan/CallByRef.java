package classExm.chuancan;

public class CallByRef {
    public static void main(String[] args) {
        //当一个简单类型传递给一个方法时，使用按值传递。对象传递则按引用传
        //递。
        Test ob = new Test(15,20);

        System.out.println("ob.a and ob.b before call22: " +
                ob.a + " " + ob.b);
        //参数传值
        ob.meth(15,20);
        System.out.println("ob.a and ob.b after call22: " +
                ob.a + " " + ob.b);


        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);
        //参数传对象
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);


    }
}
