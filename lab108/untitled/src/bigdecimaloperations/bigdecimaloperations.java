package bigdecimaloperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalOperations {

    // Method 1: Round to nearest 100th
    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    // Method 2: Inverting and rounding
    public static double invertSignAndRoundToTenth(BigDecimal number) {
        BigDecimal inverted = number.negate();
        return inverted.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        // Test
        BigDecimal num1 = new BigDecimal("76.265481");
        BigDecimal num2 = new BigDecimal("9.1764");
        BigDecimal num3 = new BigDecimal("-26.84");

        System.out.println("Round to hundredth: " + roundToNearestHundredth(num1));
        System.out.println("Invert and round to tenth (9.1764): " + invertSignAndRoundToTenth(num2));
        System.out.println("Invert and round to tenth (-26.84): " + invertSignAndRoundToTenth(num3));
    }
}
