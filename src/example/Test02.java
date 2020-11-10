package example;

public class Test02 {
    public static void main(String[] args){
        //Java 内置8中进本数据类型
        //取值范围 127  -128之间，不允许取别的数值
        //-2^7   2^7-1 ，用的少
        byte b = -128;
        //-2^15   2^15-1 ，用的少
        short st = 2341;
        //-2^31  2^31-1  常用
        int num= 214215222;
        //-2^63  2^63-1
        long loog=1233342134;
        //
        float fl=12.5f;
        //
        double db=12.45;
        // 取值 True Fourse 常用
        boolean bl=true;
        //char 用单引号，不能用双引号
        char ca='l';
        //int赋值,可以给多个变量赋值，不需要每个都重新开始一行。
        int aa=12,bb=12,cc=13;

        //String 是类，不是进本数据类型。只能用双引号，不能用单引号
        String str ="lebo";
    }
}
