package example;

public class Test04 {
    public static void main(String[] args) {
        //for(定义变量;条件表达式;操作){
        // 执行语句
        // }
        System.out.println("打印0到10的整数==");
        for (int i = 0; i <11 ; i++) {
            System.out.println(i);
        }
        System.out.println("打印1到10的奇数==");
        for (int j = 1; j <11 ; j+=2) {
            System.out.println(j);
        }
        System.out.println("1到101求和==");
        int sum = 0;
        for (int t = 0; t < 101; t++) {
            sum=sum+t;
        }
        System.out.printf("sum=%d%n", sum);
        //for 循环一些变化
        //int i, j;
        /*for(i=0; i<10; i++) {
           for(j=i; j<10; j++)
                System.out.print(".");
            System.out.println();
          }*/
        int i;
        boolean done = false;
        i = 0;
        for( ; !done; ) {
            System.out.println("i is " + i);
            if(i == 10) done = true;
            i++;
        }
    }
}
