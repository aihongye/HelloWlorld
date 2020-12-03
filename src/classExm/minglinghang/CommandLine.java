package classExm.minglinghang;
//注意：所有的命令行参数都是以字符串的形式传递的。你必须手工把数字值变换
//到它们的内部形式,这将在第14章解释
class CommandLine {
    public static void main(String args[]) {
        for(int i=0; i<args.length; i++)
            System.out.println("args[" + i + "]: " +
                    args[i]);
    }
}