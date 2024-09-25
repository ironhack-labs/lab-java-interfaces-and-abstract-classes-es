import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundToHundredth(BigDecimal value) {
        BigDecimal roundedValue = value.setScale(2, RoundingMode.HALF_UP);
        return roundedValue.doubleValue();
    }

    public static BigDecimal invertAndRoundToTenth(BigDecimal value) {
        BigDecimal invertedValue = value.negate();
        BigDecimal roundedValue = invertedValue.setScale(1, RoundingMode.HALF_UP);
        return roundedValue;
    }
}
