package Sistemadeinventariodeautomoviles;

public class Sedan extends Car{


    public Sedan(String vinNumber, String make, int mileage) {
        super(vinNumber, make, mileage);
    }

    @Override
    public void getInfo(String ConsultAuto) {
        System.out.println("Resultado para la consulta del auto: "+ ConsultAuto);
        System.out.println("el numero de serie es: "+ getVinNumber());
        System.out.println("La marca es: "+ getMake());
        System.out.println("y tiene un kilometraje de: "+ getMileage());
    }
}
