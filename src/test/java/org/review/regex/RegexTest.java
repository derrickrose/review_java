package org.review.regex;

import org.junit.Test;

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
}
