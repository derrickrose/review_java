package org.review.amz.algo.dedupe;

import java.util.ArrayList;
import java.util.List;

public class Dedupe {

    //complexity is big o of n square since for each element inside the list
    // we will check if its present inside the dedupedlist and add it if not present
    //complexité quadratique
    public static List<String> dedupe(List<String> strings) {
        List<String> dedupedStrings = new ArrayList<>();
        for (String str : strings) {
            for (String s : dedupedStrings) {
                if (s.equals(str)) {
                    break;
                } else {
                    dedupedStrings.add(str);
                }
            }
        }
        return dedupedStrings;
    }
}
