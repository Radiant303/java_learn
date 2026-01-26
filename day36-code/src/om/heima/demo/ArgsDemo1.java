package om.heima.demo;

public class ArgsDemo1 {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }

    // 可变参数 :int ...args 最多只能有一个
    public static int getSum(int ...args){
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
