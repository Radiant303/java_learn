public class RegexDemo2 {
    public static void main(String[] args) {
        //把第X组的数据拿出来再用一次
        String regex1 = "(.).+\\1";

        //把第X组数据拿出来，但是第一组数据不止一个
        String regex2 = "(.+).+\\1";

        //起始部分字符要一致
        String regex3 = "((.)\\2*).+\\1";




    }
}
