package org.review.regex;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    @Test
    public void runTest() {
        Matcher matcher = Pattern.compile("(HTTP1\\s200\\s)(\\w+\\.gif)", Pattern.CASE_INSENSITIVE).matcher("HTTP1 200 mami.Gif");
        if (matcher.find()) {
            System.out.println("here => " + matcher.group(2));
        } else {
            System.out.println("nothing found");
        }
    }

    @Test
    public void variable_Test() {
        int nbre1 = 10;
        int nbre2 = 3;
        double resultat = (nbre1 / (double) nbre2);
        System.out.println("Le résultat est = " + resultat);
    }

    @Test
    public void print_pair() {
        /*
        //pire des cas
        for (int index = 1; index <= 20; index++) {
            if (index % 2 == 0) {
                System.out.println(index);
            }
        }

//acceptable car definition mathématique
        for (int index = 1; index <= 10; index++) {
            System.out.println(2 * index);
        }

//best
        for (int index = 2; index <= 20; index += 2) {
            System.out.println(index);
        }

         */

        String a = "zhzhhz";

        a.chars().forEach(
                (x) ->
                        System.out.println((char) x));


    }


}
