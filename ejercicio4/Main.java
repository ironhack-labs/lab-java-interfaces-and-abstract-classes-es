package ejercicio4;

public class Main {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        // Agregamos 15 elementos
        for (int i = 0; i < 15; i++) {
            list1.add(i);
            list2.add(i * 2);
        }

        System.out.println("IntArrayList:");
        for (int i = 0; i < 15; i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println("\nIntVector:");
        for (int i = 0; i < 15; i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
