import InterfazIntList.IntArrayLi;
import InterfazIntList.IntVector;
import InterfazIntList.IntList;
import OperacionesBigDecimal.ManagmentBigDecimal;
import Serviciodetransmisiondevideo.Movie;
import Serviciodetransmisiondevideo.TvSeries;
import Sistemadeinventariodeautomoviles.Sedan;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//==================================BigDecimal====================================
        BigDecimal ejemplo1 = new BigDecimal("4.2545");
        BigDecimal ejemplo2 = new BigDecimal("-1.2345");
        BigDecimal ejemplo3 = new BigDecimal("45.67");

        ManagmentBigDecimal ejemplo = new ManagmentBigDecimal();
        ejemplo.roudingmode(ejemplo1);
        ejemplo.changesign(ejemplo2);
        ejemplo.changesign(ejemplo3);
        System.out.println("================================================================");
//=======================================Sistema de inventario de automóviles================================
        Sedan nuevocar = new Sedan("0515JVZ", "sedan", 13540);
        nuevocar.getInfo("sedan");


//=========================================Serviciodetransmisiondevideo===================================
        TvSeries series = new TvSeries("Umbrella Academy", 2, 5.0);
        System.out.println("======================================================================");
        series.getInfo();
        Movie movie = new Movie("Harry Potter", 2, 5);
        movie.getInfo();
//=====================================InterfazIntList===========================================
        IntArrayLi array = new IntArrayLi();
        array.add(6);

    }
}
