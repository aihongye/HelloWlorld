package extendsExm.chongzaishunxu;
//从子类中调用重载方法时，它总是引用子
//类定义的方法。而超类中定义的方法将被隐藏
//如果你希望访问被重载的超类的方法，可以用super
public class Override {
    public static void main(String[] args) {
     B subOB = new B(1,2,3);
     subOB.show();
    }
}
