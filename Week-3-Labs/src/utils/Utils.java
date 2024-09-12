package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
  public static double retrieveFormattedDecimal(BigDecimal number){
    return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
  public static double retrieveNumberChangedSingnum(BigDecimal number){
    return number.setScale(1, RoundingMode.HALF_UP).negate().doubleValue();
  }

  public static int retrieveFormatToInt(BigDecimal number){
    return number.setScale(0,RoundingMode.HALF_UP).intValue();
  }
}
