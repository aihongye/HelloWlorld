package example;

public class Test03 {
    public static void main(String[] args) {
        //算术运算符
        //算术运算符的运算数必须是数字类型。算术运算符不能用在布尔类型上，但是可以用
        //在char类型上，因为实质上在Java中，char类型是int类型的一个子集.
        int a = 106, b = 20;
        int c,d,e,f,g;
        c = a-b;
        d = a%b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a-b="+c);
        System.out.println("a%b="+d);
        System.out.println("a==b:"+(a==b));
        System.out.println("a!=b:"+(a!=b));
        System.out.println("a>b:"+(a>b));
        System.out.println("a<b:"+(a<b));
        System.out.println("a++="+(a++));
        System.out.println("a--="+(a--));
        System.out.println("++a="+(++a));
        System.out.println("--a="+(--a));
        System.out.println("a>b && a>0 :"+ (a>b && a>0));
        System.out.println("a>b && a>0 :"+ (a>b && a<0));
        System.out.println("a<b && a<0 :"+ (a<b && a<0));
        System.out.println("a>b || a>0 :"+ (a>b || a>0));
        System.out.println("a>b || a>0 :"+ (a>b || a<0));
        System.out.println("a<b || a<0 :"+ (a<b || a<0));
        System.out.println("!a>b :"+!(a>b));
        System.out.println("a+=b:"+(a+=b));
        //---------------if语句-----------------
        if (a>90 && a<100){
            System.out.println("A");
        }
        else if (a>80 && a<90){
            System.out.println("B");
        }
        else if (a>60 && a<=70){
            System.out.println("C");
        }
        else
            System.out.println("D");
        //--------------switch语句---------------
        System.out.println("==========switch语句===========");
        //switch判断变量的值
        //byte-short-int-char-string
        String str = "天";
        switch (str){
            case "东":
                System.out.println("go:"+str);
            break;
            case "西":
                System.out.println("go:"+str);
            break;
            default:
                System.out.println("----------str is error---------");
                //throw new IllegalStateException("Unexpected value: " + str);
        }
        System.out.println("========没有break的switch语句===================");
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bogus Month";
        }
        System.out.println("April is in the " + season + ".");
    }

    }

