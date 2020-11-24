package org.review.search;

import org.review.search.model.Result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class IWordSearch {

    protected List<Result> resultList = new ArrayList<>();
    protected String directoryPath;
    protected String[] wordsToSearch;

    public abstract void startSearch();

    public List<Result> getResultList() {
        Collections.sort(this.resultList, new Comparator<Result>() {
            @Override
            public int compare(Result o1, Result o2) {
                return o2.getScore().compareTo(o1.getScore());
            }
        });
        return this.resultList.stream().limit(10).collect(Collectors.toList());
    }
}
