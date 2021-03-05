package yichang;

 class NestTry {
     public static void main(String[] args) {
         try {
             int a = args.length;
            /* If no command-line args are present,
the following statement will generate
a divide-by-zero exception. */
             int b = 42 / a;
             System.out.println("a = " + a);

             try {
                 if(a==1) a = a/(a-a); // division by zero
                 if(a==2) {
                     int c[] = { 1 };
                     c[42] = 99; // generate an out-of-bounds exception
                 }

             } catch(ArrayIndexOutOfBoundsException e) {
                 System.out.println("Array index out-of-bounds: " + e);
             }
         } catch(ArithmeticException e) {
             System.out.println("Divide by 0: " + e);
         }
     }
 }