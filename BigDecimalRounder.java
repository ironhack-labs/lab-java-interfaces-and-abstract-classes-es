package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRounder {

    public static double roundToNearestCent(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal input = new BigDecimal("4.2545");
        double roundedValue = roundToNearestCent(input);

        System.out.println("Número original: " + input);
        System.out.println("Número redondeado al centésimo más cercano: " + roundedValue);
    }
}
