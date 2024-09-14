package Exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalProject {

    public static double roundToCent(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }
    public static BigDecimal invertAndRoundToTenth(BigDecimal number) {
        BigDecimal inverted = number.negate();
        return inverted.setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("4.2545");
        System.out.println(roundToCent(number));

        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");
        System.out.println(invertAndRoundToTenth(number1));
        System.out.println(invertAndRoundToTenth(number2));
    }
}