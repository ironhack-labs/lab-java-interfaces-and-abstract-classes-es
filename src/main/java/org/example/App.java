package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.example.BigDecimalPositiveNegative.NegativePositive;
import static org.example.BigDecimalRounding.roundTonearestCent;

public class App {
    public static void main( String[] args ) {

        BigDecimalRounding bigDecimalRounding = new BigDecimalRounding();

        BigDecimal value = new BigDecimal("4.2545");
        double roundValue = roundTonearestCent(value);
        System.out.println(roundValue);

        BigDecimal positiveNumber = new BigDecimal("1.2345");
        System.out.println(BigDecimalPositiveNegative.NegativePositive(positiveNumber));

        BigDecimal negativeNumber = new BigDecimal("-45.67");
        System.out.println(BigDecimalPositiveNegative.NegativePositive(negativeNumber));








    }
}
