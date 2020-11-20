package example;

public class Test05 {
    public static void main(String[] args) {
        //while语句是Java最基本的循环语句。当它的控制表达式是真时，while语句重复执行一
        //个语句或语句块
        System.out.println("===============while 或者do while=========");
        int n = 10;
        while (n>0){
            System.out.println("n="+n);
            n--;
        }
        //while循环（或Java的其他任何循环）的循环体可以为空。这是因为一个空语句（null
        //statement)（仅由一个分号组成的语句）在Java的语法上是合法的
        int i, j;
        i = 100;
        j = 200;
        // find midpoint between i and j
        while(++i < --j) ; // no body in this loop
        System.out.println("Midpoint is =" + i);
        //do-while循环总是执行它的循环体至少一次，因为它的条件表达式在循环的结尾
        int nn=10;
      //  do{
       //     System.out.println("trick="+nn);
      //      nn--;
       // }while (nn>0);
        //执行-- n 语句，将变量n递减，然后返回n的新值。这个值再
        //与0比较，如果比0大，则循环继续。否则结束
        do {
            System.out.println("tick " + nn);
        } while(--nn > 0);
    }
}

