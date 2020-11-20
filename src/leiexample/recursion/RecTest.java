package leiexample.recursion;

public class RecTest {
    int values[];
    RecTest(int i) {
        values = new int[i];
    }
    // display array – recursively
    void printArray(int i) {
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }


   // int fact(int n) {
        //int result;
        //if(n==1) return 1;
        //result = fact(n-1) * n;
       // return result;
    //}
    //当fact( )带着参数1被调用时，该方法返回1；否则它返回fact( n-1 )与n的乘积。为
    //了对这个表达式求值，fact()带着参数n-1被调用。重复这个过程直到 n 等于 1，且对该方
    //法的调用开始返回。

    //递归的主要优点在于：某些类型的算法采用递归比采用迭代算法要更加清晰和简单。
    //例如快速排序算法按照迭代方法是很难实现的。还有其他一些问题，特别是人工智能问题，
    //就依赖于递归提供解决方案。最后，有些人认为递归要比迭代简单。
}


