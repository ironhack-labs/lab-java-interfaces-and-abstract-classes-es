import objects.*;
import utils.Utils;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    IntArrayList intArrayList = new IntArrayList();
    IntVector intVector = new IntVector();

    intVector.add(5);
  }

  public static void vehicleInventory(){
    Sedan sedan = new Sedan("54239869", "Toyota", "Corolla", 15000);
    Truck truck = new Truck("23452656", "Iveco", "2020", 43000, 2145.2);
    UtilityVehicle utilityVehicle = new UtilityVehicle("3457567", "Citroen", "C4", 10000, true);
    sedan.getInfo();
    truck.getInfo();
    utilityVehicle.getInfo();
  }
  public static void videoStreaming(){
    TvSeries tvSeries = new TvSeries("Sex in the city", 120, 12);
    Movie movie = new Movie("Titanic", 125, 7.5);
    tvSeries.getInfo();
    movie.getInfo();
  }


}