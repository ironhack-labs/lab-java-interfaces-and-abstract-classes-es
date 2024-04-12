import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal(4.57268278278672647627647348);
        System.out.println(roundToNearestHundredth(number));
        System.out.println(invertAndRound(number));
    }
    public static double roundToNearestHundredth(BigDecimal number) {
        return (number.setScale(5, RoundingMode.HALF_UP)).doubleValue();
    }
    public static BigDecimal invertAndRound(BigDecimal number) {
        return (number.setScale(3,RoundingMode.HALF_UP)).negate();
    }


}