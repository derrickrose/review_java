package org.review.amz.data_structure;

import org.junit.Test;

public class ArraysSelectionSortTest {

  @Test
  public void arraysSelectionSortAscendantOrder_Test() {
    int[] array = {23, 20, 3, 0, 5, 5, 8, 4, 2, 0, 20};
    System.out.println("\nbefore the sort ascendant");
    for (int value : array) {
      System.out.print(" " + value + "");
    }
    array = ArraysSelectionSort.orderAscendant(array);
    System.out.println("\nafter the sort ascendant");
    for (int value : array) {
      System.out.print(" " + value + "");
    }
  }

  @Test
  public void arraysSelectionSortDescendantOrder_Test() {
    int[] array = {23, 20, 3, 0, 5, 5, 8, 4, 2, 0, 20};
    System.out.println("\nbefore the sort descendant");
    for (int value : array) {
      System.out.print(" " + value + "");
    }
    array = ArraysSelectionSort.orderDescendant(array);
    System.out.println("\nafter the sort descendant");
    for (int value : array) {
      System.out.print(" " + value + "");
    }
  }
}
