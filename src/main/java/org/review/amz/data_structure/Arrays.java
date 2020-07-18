package org.review.amz.data_structure;
/**
 * This class is used to master JAVA Array for the amazon recruitment assessment test.
 *
 * @version 1.0
 * @since 1.0 on 2020/07/18
 */
public class Arrays {

  /**
   * This method is used to ascendant order an array of primitive int.
   *
   * @param array This is the unique param of orderAscendant method
   * @return This returns the given array now ordered ascendant
   */
  public static int[] orderAscendant(int[] array) {
    int currentValue, updateTimes;
    do {
      updateTimes = 0;
      for (int index = 0; index < array.length - 1; index++) {
        if (array[index] > array[index + 1]) {
          updateTimes++;
          currentValue = array[index];
          array[index] = array[index + 1];
          array[index + 1] = currentValue;
        }
      }
    } while (updateTimes != 0);
    return array;
  }

  /**
   * This method is used to descendant order an array of primitive int.
   *
   * @param array This is the unique param of orderDescendant method
   * @return This returns the given array now ordered descendant
   */
  public static int[] orderDescendant(int[] array) {
    int currentValue, updateTimes;
    do {
      updateTimes = 0;
      for (int index = 0; index < array.length - 1; index++) {
        if (array[index] < array[index + 1]) {
          updateTimes++;
          currentValue = array[index];
          array[index] = array[index + 1];
          array[index + 1] = currentValue;
        }
      }
    } while (updateTimes != 0);
    return array;
  }
}
