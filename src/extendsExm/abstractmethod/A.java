package extendsExm.abstractmethod;

 abstract class A {
    abstract void callme();
    // concrete methods are still allowed in abstract classes，具体的方法也允许在抽象类中声明
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}
