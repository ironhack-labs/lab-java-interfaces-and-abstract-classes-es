import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {


    public static void main(String[] args) {

        BigDecimal number = new BigDecimal("4.2545");
        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");


        double result = roundingNumber(number);
        BigDecimal result1 = roundingAndChangeSign(number1);
        BigDecimal result2 = roundingAndChangeSign(number2);

        System.out.println("result big decimal to double = " + result);
        System.out.println("result 1 rounding and change sing = " + result1);
        System.out.println("result 2 rounding and change sing = " + result2);

    }

    public static double roundingNumber(BigDecimal number) {

        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal roundingAndChangeSign(BigDecimal number) {

        BigDecimal changeSignNumber = number.negate();
        BigDecimal result = changeSignNumber.setScale(1, RoundingMode.HALF_UP);
        return result;

    }
}