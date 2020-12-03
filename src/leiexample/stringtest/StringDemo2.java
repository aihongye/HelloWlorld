package leiexample.stringtest;
//你可以用equals()来检
//验两个字符串是否相等。你可以调用方法length()来获得一个字符串的长度。你可以调用
//charAt()来获得一个字符串指定索引的字符。这三个方法的通用格式如下所示：
//boolean equals(String object)
//int length( )
//char charAt(int index)
class StringDemo2 {
    public static void main(String args[]) {
        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1;
        System.out.println("Length of strOb1: " +
                strOb1.length());
        System.out.println("Char at index 3 in strOb1: " +
                strOb1.charAt(3));
        if(strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if(strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}