package org.review.amz.algo.dichotomie;

import org.junit.Test;

import java.util.Arrays;

public class DichotomieTest {

    @Test
    public void searchByDichotomie() {
        String[] dictionary = {"mimi", "nini", "nono", "zeze", "pupu", "toto", "popito", "shsh", "oo", "hehe"};
        Arrays.sort(dictionary);
        System.out.println(Arrays.asList(dictionary).toString());
        int position = Dichotomie.doSearch(dictionary,  "oo");
        System.out.println("position " + position);
    }
}
