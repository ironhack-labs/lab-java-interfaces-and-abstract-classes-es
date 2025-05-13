package ejercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperacionBigDecimal {

/*1. Usando la documentación de BigDecimal, crea un metodo que acepte un BigDecimal y devuelva un double del número BigDecimal
redondeado al centésimo más cercano. Por ejemplo, 4.2545 debería devolver 4.25.*/

/*2. Usando la documentación de BigDecimal, crea un metodo que acepte un BigDecimal, invierte el signo (si el parámetro es positivo,
el resultado debería ser negativo y viceversa), redondea el número a la décima más cercana y devuelva el resultado.
Por ejemplo, 1.2345 debería devolver -1.2 y -45.67 debería devolver 45.7.*/

    public static double redondeo (BigDecimal number){
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);

        return roundedNumber.doubleValue();
    }

    public static double invertirRedondear (BigDecimal number){
        BigDecimal invertedNumber = number.negate();

        BigDecimal roundedNumber = number.setScale(1, RoundingMode.HALF_UP);

        return roundedNumber.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("3.547182");
        double resultado1 = redondeo (numero1);
        System.out.println("El resultado del ejercicio 1 es : " + resultado1);

        BigDecimal numero2 = new BigDecimal("65.214");
        double resultado2 = invertirRedondear (numero2);
            System.out.println("El resultado del ejercicio 2.1 es : " + resultado2);

        BigDecimal numero3 = new BigDecimal("-65.214");
        double resultado3 = invertirRedondear (numero3);
        System.out.println("El resultado del ejercicio 2.2 es : " + resultado3);
    }

}
