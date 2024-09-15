package intlistinterface;

public class Main {
    public static void main(String[] args) {
        IntList arrayList = new IntArrayList();
        IntList vector = new IntVector();

        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
            vector.add(i);
        }

        System.out.println("ArrayList element at 5: " + arrayList.get(5));
        System.out.println("Vector element at 5: " + vector.get(5));
    }
}
//IntArrayList sample
//class casoProcesoSingular {
//    public static void main(String[] args) {
//        IntList arrayList = new IntArrayList();
//        for (int i = 2; i < 2000000; i++) {
//            arrayList.add(i); // 1 proceso y al evitar sincronización, será más rápido
//        }
//        System.out.println("ArrayList element at 200: " + arrayList.get(200)); // O(1) access
//    }
//}
//class CasoSubProcesoMultiple {
//    public static void main(String[] args) {
//        IntList vector = new IntVector();
//
//        Runnable task = () -> {
//            for (int i = 2; i < 2000; i++) {
//                vector.add(i); // add seguro
//            }
//        };
//
//        Thread subproceso1 = new Thread(task);
//        Thread subproceso2 = new Thread(task);
//
//        subproceso1.start();
//        subproceso2.start();
//
//        try {
//            subproceso1.join();
//            subproceso2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Vector element at 200: " + vector.get(200)); // acceso sguro
//    }
//}
