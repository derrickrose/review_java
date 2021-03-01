package org.review.amz.algo.binary_serach;

public class BinarySearch {

    public static final String[] subArray(String[] strings, int lowerBound, int upperBound) throws Exception {
        if (strings.length == 0) {
            throw new Exception("Cannot cut an empty array.");
        }
        if (upperBound >= strings.length) {
            throw new Exception("UpperBound |" + upperBound + "| should be smaller than array length |" + strings.length + "|");
        }
        int length = upperBound - lowerBound + 1;
        String[] newStrings = new String[length];
        for (int index = 0; index < length; index++) {
            newStrings[index] = strings[lowerBound + index];
        }
        return newStrings;
    }

    //before using this, the array strings should first be ordered
    public static final int binarySearch(String[] strings, String toSearch, int minPosition, int maxPosition) {
        if (maxPosition < minPosition) {
            return -1;
        }
        int middle = (minPosition + maxPosition ) / 2;
        if (strings[middle].equals(toSearch)) {
            return middle;
        }
        if (strings[middle].compareTo(toSearch) > 0) {
            return binarySearch(strings, toSearch, minPosition, middle-1);
        } else {
            return binarySearch(strings, toSearch, middle + 1, maxPosition);
        }
    }
}
