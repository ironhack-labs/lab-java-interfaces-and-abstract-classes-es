package OperacionesBigDecimal;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ManagmentBigDecimal {

    BigDecimal Comparador = new BigDecimal("0");
    public void roudingmode(BigDecimal num1) {
         num1 = num1.setScale(2, RoundingMode.DOWN);
        System.out.println(num1);
    }

    public void changesign (BigDecimal num2){
      if (num2.compareTo(Comparador)<=0)
        num2= num2.subtract(num2.add(num2));
      else {num2= num2.subtract(num2.add(num2));
      }
        num2= num2.setScale(1,RoundingMode.HALF_UP);
        System.out.println(num2);
        }
    }

