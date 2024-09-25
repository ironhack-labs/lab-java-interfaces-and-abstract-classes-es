public class MainInt {
    public static void main(String[] args) {

        IntList intArrayList = new IntArrayList();
        for (int i = 0; i < 12; i++) {
            intArrayList.add(i);
        }
        System.out.println("Elemento en el índice 5 de IntArrayList: " + intArrayList.get(5));


        IntList intVector = new IntVector();
        for (int i = 0; i < 25; i++) {
            intVector.add(i);
        }
        System.out.println("Elemento en el índice 20 de IntVector: " + intVector.get(20));
    }
}
