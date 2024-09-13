package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRounding {

    public static double roundTonearestCent(BigDecimal value){
        BigDecimal rounded = value.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }
}
