package com.ironhack.lab.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/**
 * Rounding helpers built on {@link BigDecimal}.
 *
 * <p>Both operations round with {@link RoundingMode#HALF_UP}, which is the
 * "nearest, ties away from zero" rule people mean by "round to the nearest
 * hundredth/tenth" in everyday arithmetic.</p>
 *
 * <p>Always build the {@code BigDecimal} arguments from a {@code String}
 * literal ({@code new BigDecimal("4.2545")}). The {@code double} constructor
 * carries the binary representation error of the literal into the decimal
 * value and can change the rounding outcome.</p>
 */
public final class BigDecimalOperations {

    private BigDecimalOperations() {
        // Utility class: not meant to be instantiated.
    }

    /**
     * Rounds a number to the nearest hundredth (two decimal places).
     *
     * <p>Example: {@code 4.2545} returns {@code 4.25}.</p>
     *
     * @param value the number to round, never {@code null}
     * @return the rounded value as a {@code double}, as the exercise requires
     * @throws NullPointerException if {@code value} is {@code null}
     */
    public static double roundToHundredth(BigDecimal value) {
        Objects.requireNonNull(value, "value must not be null");
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Reverses the sign of a number and rounds it to the nearest tenth
     * (one decimal place).
     *
     * <p>Examples: {@code 1.2345} returns {@code -1.2} and {@code -45.67}
     * returns {@code 45.7}.</p>
     *
     * <p>The return type is deliberately {@link BigDecimal} rather than
     * {@code double}: the exercise asks for "the result" of a rounding
     * operation, and {@code BigDecimal} keeps the scale that rounding just
     * established, so the value prints as {@code -1.2} instead of leaking a
     * binary artefact such as {@code -1.2000000000000002}. Callers that need
     * a primitive can still call {@link BigDecimal#doubleValue()}.</p>
     *
     * @param value the number to negate and round, never {@code null}
     * @return the negated value rounded to one decimal place
     * @throws NullPointerException if {@code value} is {@code null}
     */
    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal value) {
        Objects.requireNonNull(value, "value must not be null");
        return value.negate().setScale(1, RoundingMode.HALF_UP);
    }
}
