package org.review.search.engine;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit test for SearchApplication.
 */
public class DefaultSearchEngineTest {

    @Test
    public void processSearchShouldScoreHundredPercent_Test() {

        Set<String> fileContent = new HashSet<>();
        fileContent.add("hello");
        fileContent.add("hi");
        fileContent.add("bonjour");
        fileContent.add("hey");

        Set<String> wordsToSearch = new HashSet<>();
        wordsToSearch.add("hello");
        wordsToSearch.add("hi");
        wordsToSearch.add("ji");
        wordsToSearch.add("ju");

        DefaultSearchEngine searchEngine = new DefaultSearchEngine(fileContent, wordsToSearch);
        int value = searchEngine.processSearch();
        Assert.assertEquals(value, 50);
    }


    @Test
    public void processSearchShouldScoreFiftyPercent_Test() {

        Set<String> fileContent = new HashSet<>();
        fileContent.add("hello");
        fileContent.add("hi");
        fileContent.add("bonjour");
        fileContent.add("hey");
        fileContent.add("ho");

        Set<String> wordsToSearch = new HashSet<>();
        wordsToSearch.add("hello");
        wordsToSearch.add("hi");
        wordsToSearch.add("hey");
        wordsToSearch.add("ho");

        DefaultSearchEngine searchEngine = new DefaultSearchEngine(fileContent, wordsToSearch);
        int value = searchEngine.processSearch().intValue();
        Assert.assertEquals(value, 100);
    }
}
