package Exercise4;

public class Main {
    public static void main(String[] args) {
        IntList intArrayList = new IntArrayList();
        for (int i = 0; i < 15; i++) {
            intArrayList.add(i);
            System.out.println("IntArrayList add: " + i);
        }

        System.out.println("Elementos en IntArrayList:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Elemento en posición " + i + ": " + intArrayList.get(i));
        }

        IntList intVector = new IntVector();
        for (int i = 0; i < 25; i++) {
            intVector.add(i);
            System.out.println("IntVector add: " + i);
        }

        System.out.println("Elementos en IntVector:");
        for (int i = 0; i < 25; i++) {
            System.out.println("Elemento en posición " + i + ": " + intVector.get(i));
        }
    }
}