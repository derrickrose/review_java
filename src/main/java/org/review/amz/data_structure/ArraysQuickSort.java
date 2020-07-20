package org.review.amz.data_structure;
/*
 * This class is used to master quicksort for amz assessment.
 *
 * @author randofrils
 * @version 1.0.0
 * @since version 1.0.0 on 2020/07/20
 * @reference geeksforgeeks quicksort
 */
public class ArraysQuickSort {
  /*
   * This method is used to position the pivot in correct place.
   *
   * @param array given array to do partition
   * @return This method returns an array with the pivot in its correct place
   */
  public static int[] partition(int[] array) {
    // TODO validate parameter
    int correctPivotIndex = array.length - 1;
    for (int value : array) {
      if (value > array[array.length - 1]) {
        correctPivotIndex--;
      }
    }
    array = swapValues(array, correctPivotIndex, array.length - 1);
    // partitioning as the clrs book
    int minimumValueIndex = 0;
    for (int index = 0; index < array.length; index++) {
      if (index == correctPivotIndex || minimumValueIndex == correctPivotIndex) {
        continue;
      }
      if (array[index] < array[minimumValueIndex]) {
        array = swapValues(array, index, minimumValueIndex);
        minimumValueIndex = index;
      }
    }

    return array;
  }

  private static int[] swapValues(int[] array, int index1, int index2) {
    // TODO validate parameters
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
    return array;
  }
}
