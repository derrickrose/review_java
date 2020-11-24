package org.review.search;

import org.review.search.model.Result;

import java.util.*;
/*
 * This class is used as entry point of the app.
 * Basically a search of matching words from files inside a given directory
 * @version 1.0
 * @since 1.O on 2020/11/23
 */

public class SearchApplication {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String[] array = Arrays.copyOfRange(args, 1, args.length);
            IWordSearch wordSearch = new WordSearch(args[0], array);
            wordSearch.startSearch();
            List<Result> resultList = wordSearch.getResultList();
            resultList.forEach((result) -> System.out.println(result.getFileName() + " : " + result.getScore() + "%"));
        } else {
            System.out.println("Invalid arguments ...");
        }
    }
}
