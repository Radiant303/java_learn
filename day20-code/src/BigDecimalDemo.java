import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        Double a = 0.1;
        Double b = 0.2;
        Double c = a + b;
        System.out.println(c);

        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal b1 = BigDecimal.valueOf(0.2);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);


        BigDecimal d1 = a1.divide(b1,3, RoundingMode.HALF_UP);

        BigDecimal x = new BigDecimal("0.123");
        BigDecimal y = new BigDecimal("0.321");
        BigDecimal z = x.add(y);

        System.out.println(z);
    }
}
