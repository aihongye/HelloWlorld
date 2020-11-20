package example;

public class TiaoZhuan {
    public static void main(String[] args) {
        //跳转语句：Java 支持 3 种跳转语句：break，continue和return。
        //可以使用break语句直接强行退出循环，忽略循环体中的任何其他语句和循环的条件测
        //试。
        for(int i=0; i<100; i++) {
            if(i == 10) break; // terminate loop if i is 10
            System.out.println("i: " + i);
        }
        System.out.println("i Loop complete.");
         //
        int ss = 0;
        while(ss < 100) {
            if(ss == 10) break; // terminate loop if i is 10
            System.out.println("ss: " + ss);
            ss++;
        }
        System.out.println("ss Loop complete.");
         //注意：break不是被设计来提供一种正常的循环终止的方法。循环的条件语句是专
        //门用来终止循环的。只有在某类特殊的情况下，才用break语句来取消一个循环。
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if(t) break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
     //continue语句是break语句的补充。在while和do while循环中，continue语句使控制直接转移
      //给控制循环的条件表达式，然后继续循环过程。
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
        //对于break语句，continue可以指定一个标签来说明继续哪个包围的循环。下面的例子
        //运用continue语句来打印0到9的三角形乘法表：
        outer: for (int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
       //return语句用来明确地从一个方法返回
        boolean tr = true;
        System.out.println("Before the return.");
        if(tr) return; // return to caller
        System.out.println("This won't execute.");

        //除了这里讨论的跳转语句，Java还支持另一种能改变你程序执行流程的方
        //法:通过异常处理。异常处理提供了一种结构化的方法，通过该方法可以使你的程
        //序捕获并处理运行时刻错误。它由下列五个关键字来控制：try，catch，throw，
        //throws，和 finally。实质上，异常处理机制允许你的程序完成一个非局部的分
        //支跳转。

    }
}
