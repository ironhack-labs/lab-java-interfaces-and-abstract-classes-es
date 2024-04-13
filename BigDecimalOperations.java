import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    // Method to round a BigDecimal to the nearest hundredth
    public static double roundToNearestHundredth(BigDecimal number) {
        // Set the scale to 2 and round to the nearest centesimal digit
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    // Method to invert the sign of a BigDecimal, round it to the nearest tenth, and return the result
    public static BigDecimal invertSignAndRoundToNearestTenth(BigDecimal number) {
        // Invert the sign of the number
        BigDecimal invertedNumber = number.negate();
        // Set the scale to 1 and round to the nearest tenth
        return invertedNumber.setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("4.2545");
        BigDecimal number2 = new BigDecimal("-45.67");

        // Example of rounding to the nearest hundredth
        double roundedNumber1 = roundToNearestHundredth(number1);
        System.out.println("Rounding to the nearest hundredth of 4.2545: " + roundedNumber1);

        // Example of inverting the sign and rounding to the nearest tenth
        BigDecimal result = invertSignAndRoundToNearestTenth(number2);
        System.out.println("Inverting the sign and rounding to the nearest tenth of -45.67: " + result);
    }
}