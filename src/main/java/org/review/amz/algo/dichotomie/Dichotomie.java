package org.review.amz.algo.dichotomie;

public class Dichotomie {

    //string.length should not be 0
    public static final int doSearch(String[] strings, String wordToSearch) {
        /*
        if (strings.length == 0) {
            return Integer.MIN_VALUE;
        }
        */

        int maxPosition = strings.length - 1;
        int minPostion = 0;
        int middle = (maxPosition - minPostion) / 2;
        String currentString = strings[middle];
        if (currentString.equals(wordToSearch)) {
            return middle;
        } else if (wordToSearch.compareTo(currentString) < 0) {
            String[] newArray = cutArray(strings, minPostion, middle);
            return (doSearch(newArray, wordToSearch));
        } else {
            String[] newArray = cutArray(strings, middle, maxPosition);
            return (doSearch(newArray, wordToSearch));
        }
    }

    public static final String[] cutArray(String[] strings, int minPosition, int maxPosition) {
        /*
        if (minPosition > maxPosition) {
            return new String[0];
        }*/
        int length = maxPosition - minPosition + 1;
        String[] newStrings = new String[length];
        for (int index = 0; index < length; index++) {
            newStrings[index] = strings[minPosition + index];
        }
        return newStrings;
    }
}
