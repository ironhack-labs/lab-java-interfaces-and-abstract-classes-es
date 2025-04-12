package metodosBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String [] args){

        System.out.println("Método 1 Redondear Cercano");
        BigDecimal numero = new BigDecimal("13.855");
        System.out.println("El resultado del número redondeado es: " + redondearCercano(numero));

        System.out.println("------------------- \n");
        System.out.println("Método 2 Redondear Positivo-Negativo");
        BigDecimal numero1 = new BigDecimal("51.873");
        System.out.println("El resultado del número 1 redondeado invertido es: " + redondearPositivoNegativo(numero1));
        BigDecimal numero2 = new BigDecimal("-35.822");
        System.out.println("El resultado del número 2 redondeado invertido es: " + redondearPositivoNegativo(numero2));




    }





    public static double redondearCercano (BigDecimal numero) {
        BigDecimal resultado =  numero.setScale(2, RoundingMode.HALF_UP);
        return resultado.doubleValue();
    }

    public static BigDecimal redondearPositivoNegativo (BigDecimal numero) {
        BigDecimal invertir = numero.negate();
        return invertir.setScale(1, RoundingMode.HALF_UP);
    }
}
