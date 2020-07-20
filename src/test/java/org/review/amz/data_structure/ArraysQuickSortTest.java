package org.review.amz.data_structure;

import org.junit.Test;

public class ArraysQuickSortTest {
  @Test
  public void partition_Test() {
    int[] array = {2, 20, 23, 45, 5, 5, 8, 34, 52, 4, 2, 10};
    System.out.println("\nbefore the sort ascendant");
    for (int value : array) {
      System.out.print(" " + value + "");
    }
    array = ArraysQuickSort.partition(array);
    System.out.println("\nafter the partition ascendant");
    for (int value : array) {
      System.out.print(" " + value + "");
    }
  }
}
