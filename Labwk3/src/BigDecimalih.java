import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalih {

    public static double roundToCentesimal(BigDecimal number) {

        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);

        return rounded.doubleValue();
    }

    public static double invertAndRoundToTenth(BigDecimal number) {

        BigDecimal inverted = number.multiply(new BigDecimal("-1"));
        BigDecimal rounded = inverted.setScale(1, RoundingMode.HALF_UP);

        return rounded.doubleValue();
    }
}
