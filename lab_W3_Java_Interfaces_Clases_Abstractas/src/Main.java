//Operaciones BigDecimal
//Usando la documentación de BigDecimal, crea un método que acepte un BigDecimal y devuelva un double del número BigDecimal redondeado al centésimo más cercano. Por ejemplo, 4.2545 debería devolver 4.25.
//Usando la documentación de BigDecimal, crea un método que acepte un BigDecimal, invierte el signo (si el parámetro es positivo, el resultado debería ser negativo y viceversa), redondea el número a la décima más cercana y devuelva el resultado. Por ejemplo, 1.2345 debería devolver -1.2 y -45.67 debería devolver 45.7.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    // Método para redondear al centésimo más cercano
    public static double roundToCent(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    // Método para invertir el signo y redondear a la décima más cercana
    public static BigDecimal invertAndRoundToTenth(BigDecimal number) {
        BigDecimal inverted = number.negate(); // Cambiar el signo
        BigDecimal rounded = inverted.setScale(1, RoundingMode.HALF_UP); // Redondear a la décima
        return rounded;
    }

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("4.2545");
        System.out.println("Rounded to cent: " + roundToCent(bd1)); // 4.25

        BigDecimal bd2 = new BigDecimal("1.2345");
        System.out.println("Inverted and rounded to tenth: " + invertAndRoundToTenth(bd2)); // -1.2

        BigDecimal bd3 = new BigDecimal("-45.67");
        System.out.println("Inverted and rounded to tenth: " + invertAndRoundToTenth(bd3)); // 45.7
    }
}

