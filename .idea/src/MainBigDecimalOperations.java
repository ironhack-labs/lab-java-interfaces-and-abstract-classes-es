import java.math.BigDecimal;

public class MainBigDecimalOperations {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("7.999");
        System.out.println("Redondeo a centésimo: " + BigDecimalOperations.roundToHundredth(number1));

        BigDecimal number2 = new BigDecimal("123.456");
        System.out.println("Redondeo a centésimo: " + BigDecimalOperations.roundToHundredth(number2));

        BigDecimal number3 = new BigDecimal("-0.555");
        System.out.println("Redondeo a centésimo: " + BigDecimalOperations.roundToHundredth(number3));

        BigDecimal number4 = new BigDecimal("10.777");
        System.out.println("Invertir y redondear a décimos: " + BigDecimalOperations.invertAndRoundToTenth(number4));

        BigDecimal number5 = new BigDecimal("-99.49");
        System.out.println("Invertir y redondear a décimos: " + BigDecimalOperations.invertAndRoundToTenth(number5));

        BigDecimal number6 = new BigDecimal("0.111");
        System.out.println("Invertir y redondear a décimos: " + BigDecimalOperations.invertAndRoundToTenth(number6));
    }
}

