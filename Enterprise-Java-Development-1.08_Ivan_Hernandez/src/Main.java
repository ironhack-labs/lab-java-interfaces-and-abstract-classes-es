import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal(1.57268278278672647627647267);
        System.out.println(roundToNearestHundredth(number));
        System.out.println(invertAndRound(number));
    }

    public static double roundToNearestHundredth(BigDecimal number) {
        return (number.setScale(2, RoundingMode.HALF_UP)).doubleValue();
    }

    public static BigDecimal invertAndRound(BigDecimal number) {
        return (number.setScale(1, RoundingMode.HALF_UP)).negate();
    }
}



