package org.review.search.engine;

import java.util.*;

public class DefaultSearchEngine extends AbstractSearchEngine {

    public DefaultSearchEngine(Collection<String> fileContent, Collection<String> wordsToSearch) {
        this.fileContent = fileContent;
        this.wordsToSearch = wordsToSearch;
    }

    @Override
    public Integer processSearch() {
        Set<String> newWordsToSearch = (Set<String>) wordsToSearch;
        Set<String> newFileContent = (Set<String>) fileContent;

        if (!fileContent.isEmpty()) {
            Iterator<String> wordsToSearchIterator = newWordsToSearch.iterator();
            while (wordsToSearchIterator.hasNext()) {
                String s = wordsToSearchIterator.next();
                for (String str : newFileContent) {
                    if (str.equals(s)) {
                        wordsToSearchIterator.remove();
                    }
                }
            }
            return (int) ((float) (wordsToSearch.size() - newWordsToSearch.size()) / Float.valueOf(newWordsToSearch.size()) * 100);
        } else {
            return 0;
        }
    }
}
