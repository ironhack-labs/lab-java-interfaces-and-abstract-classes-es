package interfaz;

public class IntArrayList implements IntList{

    //ARRAY
    int[] arrayList = new int[20];
    int count = 0;

    @Override
    public void add(int number){
        //vemos si tenemos que expandir el array o no
        if (count == arrayList.length){
            //creamos new array
            int[] newArrayList = new int[arrayList.length + arrayList.length / 2];

            //copiamos los elementos al nuevo array
            for (int i = 0; i < arrayList.length; i++){
              newArrayList[i] = arrayList[i];
          }
          arrayList = newArrayList;
        }
        //Agrega,los numero en la primera posicion vacia
        arrayList[count] = number;
        count++;

    }

    @Override
    public void get(int id) {
        if(id < 0 || id >= count){
            throw new  IndexOutOfBoundsException("Índice fuera de rango.");
        }
        System.out.println("Elemento en Índice " + id + " : " + arrayList[id]);
    }



}
