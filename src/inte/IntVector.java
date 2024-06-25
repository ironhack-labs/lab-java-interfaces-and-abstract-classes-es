package inte;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntVector implements IntLIst {
    private Class[] array;

    public IntVector() {
        array = new Class[20];
        System.out.println("There is " + array.length);
    }

    public void add(int number) {
        boolean newStudent = false;

        for (int i=0; i<array.length; i++) {
            if (array[i] == null) {
                array[i] = number;
                newStudent = true;
                break;
            }
        }
        if (!newStudent) {
            System.out.println("Update Class " + array.length);

            int newLength = array.length + array.length;
            Class[] newArray = new Class[newLength];
                for (int i=0; i<array.length; i++) {
                    newArray[i] = array[i];
            }
            array = newArray;
        }

    }

    public int get(int id) {
        return array[id];
    }
}