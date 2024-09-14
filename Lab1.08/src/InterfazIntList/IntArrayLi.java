package InterfazIntList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public  class IntArrayLi implements IntList {

    int [] firts = {0,1,2,3,4,5,6,7,8,9};
    int [] nuwArray;


    @Override
    public void add(int number) {
        System.out.println(Arrays.toString(firts));
        if (firts.length>= 10) {
            List new = new ArrayList<>()


        }

    }


    @Override
    public void get(int id) {

    }
}

