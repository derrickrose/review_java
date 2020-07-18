package org.review.amz.data_structure;

import org.junit.Test;

public class ArrayTest {

  @Test
  public void amzArray_Test() {
    // initialisation simple
    int[] array = new int[5];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    // initialisation with values
    int[] array1 = {0, 4, 7, 9, 1, 0, 6};
    // go through an array with index
    for (int indexArray = 0; indexArray < array.length; indexArray++) {
      System.out.println(array[indexArray]);
    }
    // go through an array without index
    for (int value : array) {
      System.out.println(value);
    }
    System.out.println("\nbefore the sort " + array1);
    for (int value : array1) {
      System.out.print(" " + value + "");
    }
    // sort an array ascendant
    array1 = Arrays.orderAscendant(array1);
    System.out.println("\nafter the sort " + array1);
    for (int value : array1) {
      System.out.print(" " + value + "");
    }
    int previous = Integer.MIN_VALUE;
    // the idea here is to iterate the array and compare each value with its predecessor
    for (int value : array1) {
      assert previous <= value;
      previous = value;
    }

    //sort the array in descendant
    array1 = Arrays.orderDescendant(array1);
    System.out.println("\nafter the sort descendant");
    for (int value : array1) {
      System.out.print(" " + value + "");
    }

    // the idea here is to iterate the array and compare each value with its predecessor
    for (int value : array1) {
      assert previous >= value;
      previous = value;
    }

  }
}
