import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(10);
        BigInteger b = BigInteger.valueOf(20);

        BigInteger c = a.add(b);

        System.out.println(c);
        //打印c的类型
        System.out.println(c.getClass());

    }
}
