package objects;

import interfaces.IntList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntVector implements IntList {

  private boolean newArrayIsCreated = false;
  private int[] intArray = new int[2];
  int[] newArrayBigger;
  //private int[] intArray = {3,5, 4, 4, 7, 2};


  @Override
  public void add(int number) {
    if (isFull(intArray)){
      cloneAndIncreaseSize(intArray, number);
      for (int i : newArrayBigger){
        System.out.println( "Value: "+i);
      }
    }else {
      addingValueWithoutIncreaseSize(number);
      for (int i : intArray){
        System.out.println("Value: "+i);
      }
    }
  }

  public void addingValueWithoutIncreaseSize(int number){
    for (int i = 0; i < intArray.length; i++) {
      if (intArray[i]==0){
        intArray[i] = number;
        System.out.println("Index: " + i +" Is empty. New value:" + intArray[i] + ". ");
        i = intArray.length;
      }else {
        System.out.println("Index: " + i +" Value:" + intArray[i]);
      }
    }
  }

  @Override
  public void get(int id) {
    if (newArrayIsCreated){
      if (newArrayBigger[id] == 0){
        System.out.println("Index "+ id + " is empty.");
      }else {
        System.out.println("Id: " + id + " Value: " + newArrayBigger[id]);
      }
    }else {
      if (intArray[id] == 0){
        System.out.println("Index "+ id + " is empty.");
      }else {
        System.out.println("Id: " + id + " Value: " + intArray[id]);
      }
    }
  }
  public boolean isFull(int[] array) {
    for (int j : array) {
      //Default value is 0 so its like be empty
      if (j == 0) {
        return false;
      }
    }
    return true;
  }

  public void cloneAndIncreaseSize(int[] intArray, int newValue){
    int multiple = 2;
    int actualSize = intArray.length;
    actualSize = actualSize * multiple;
    int newSize = actualSize;
    newArrayBigger = new int[newSize];
    System.arraycopy(intArray,0,newArrayBigger, 0, intArray.length);
    for (int i = 0; i < newArrayBigger.length; i++)
      if (newArrayBigger[i] == 0) {
        newArrayBigger[i] = newValue;
        i = newArrayBigger.length;
      }
    newArrayIsCreated = true;
  }

}
