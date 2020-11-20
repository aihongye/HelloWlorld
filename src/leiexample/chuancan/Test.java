package leiexample.chuancan;

public class Test {
    int a,b;
    Test(int i,int j) {
        a = i;
        b = j;
    }
    void meth(int i,int j) {
        i *= 2;
        j /= 2;
    }
    // pass an object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
