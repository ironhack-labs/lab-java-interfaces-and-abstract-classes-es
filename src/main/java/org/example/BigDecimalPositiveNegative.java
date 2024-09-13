package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalPositiveNegative {
    public static BigDecimal NegativePositive(BigDecimal value){
        BigDecimal flippedValue = value.negate();
        BigDecimal roundValue = flippedValue.setScale(1, RoundingMode.HALF_UP);

        return roundValue;
    }
}
