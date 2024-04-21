package Big_Decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*Usando la documentación de BigDecimal, crea un método que acepte un BigDecimal
y devuelva un double del número BigDecimal redondeado al centésimo más cercano.
Por ejemplo, 4.2545 debería devolver 4.25.
Usando la documentación de BigDecimal, crea un método que acepte un BigDecimal,
invierte el signo (si el parámetro es positivo, el resultado debería ser negativo y viceversa),
redondea el número a la décima más cercana y devuelva el resultado.
Por ejemplo, 1.2345 debería devolver -1.2 y -45.67 debería devolver 45.7.

 */
public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("BigDecimal redondeado: " + redondeado(num1) + "\nBigDecimal invertido: "
                + invertir(num1));

    }

    public static double redondeado(BigDecimal val) {
        BigDecimal valRedondeado = val.setScale(2, RoundingMode.HALF_UP);
        return valRedondeado.doubleValue();
    }
    public static BigDecimal invertir(BigDecimal val){
        BigDecimal valInvertido = val.setScale(1,RoundingMode.HALF_UP);
        return valInvertido.negate();
    }

}