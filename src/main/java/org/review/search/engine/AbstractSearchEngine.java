package org.review.search.engine;

import java.util.Collection;

public abstract class AbstractSearchEngine {
    protected Collection<String> fileContent;
    protected Collection<String> wordsToSearch;

    abstract Integer processSearch();
}
