package intlist;
public class Main {

    public static void main(String[] args){

        IntList intArrayList = new IntArrayList();
        IntList intVector = new IntVector();


        System.out.println("Añado valores:");
        for (int i = 1; i <= 15; i++) {
            intArrayList.add(i);
            System.out.println("Valor " + i + " agregado.");
        }

        System.out.println("\n Contenido de IntArrayList:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Valor en índice " + i + ": " + intArrayList.get(i));
        }


        System.out.println("\nProbando IntVector:");
        for (int i = 1; i <= 25; i++) {
            intVector.add(i);
            System.out.println("Elemento " + i + " agregado.");
        }

        System.out.println("Contenido de IntVector:");
        for (int i = 0; i < 25; i++) {
            System.out.println("Elemento en índice " + i + ": " + intVector.get(i));
        }
    }

}
