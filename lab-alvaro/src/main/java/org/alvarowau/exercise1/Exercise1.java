package org.alvarowau.exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise1 {


    public static void start(){
        // Redondea el número al centésimo más cercano y lo convierte a double
        double roundedToHundredth = roundToHundredth(new BigDecimal("4.2545"));
        System.out.println("\nEl primer resultado es: " + roundedToHundredth);

        // Invierte el signo del número, lo redondea a la décima más cercana y lo convierte a double
        double invertedAndRounded = invertAndRound(new BigDecimal("1.2345"));
        System.out.println("\nEl segundo resultado es: " + invertedAndRounded);
    }

    /**
     * Redondea el número al centésimo más cercano.
     *
     * @param number El número BigDecimal a redondear.
     * @return El número redondeado convertido a double.
     */
    private static double roundToHundredth(BigDecimal number){
        System.out.println("Primer apartado");
        // Redondea el número a 2 decimales usando el modo de redondeo HALF_UP
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        System.out.println("El valor original: " + number);
        System.out.println("El valor redondeado es: " + rounded);
        return rounded.doubleValue();
    }

    /**
     * Invierte el signo del número y lo redondea a la décima más cercana.
     *
     * @param number El número BigDecimal cuyo signo se invertirá y redondeará.
     * @return El número con signo invertido y redondeado convertido a double.
     */
    private static double invertAndRound(BigDecimal number){
        System.out.println("Segundo apartado");
        // Invierte el signo del número
        BigDecimal inverted = number.negate();
        // Redondea el número a 1 decimal usando el modo de redondeo HALF_EVEN
        BigDecimal rounded = inverted.setScale(1, RoundingMode.HALF_EVEN);
        System.out.println("El número invertido es: " + inverted);
        System.out.println("El número redondeado es: " + rounded);
        return rounded.doubleValue();
    }
}