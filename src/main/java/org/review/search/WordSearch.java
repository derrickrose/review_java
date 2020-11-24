package org.review.search;

import org.review.search.engine.DefaultSearchEngine;
import org.review.search.model.Result;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class WordSearch extends IWordSearch {

    private static final String BLANK_SPACE = " ";

    public WordSearch(final String directoryPath, final String[] wordsToSearch) {
        this.directoryPath = directoryPath;
        this.wordsToSearch = wordsToSearch;
    }

    @Override
    public void startSearch() {
        Path searchDir = Paths.get(directoryPath);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(searchDir)) {
            try {
                Iterator<Path> directoryIterator = stream.iterator();
                Path path;
                Result result;
                while (directoryIterator.hasNext()) {// iterate file ---------------------------------------------------
                    path = directoryIterator.next();
                    if (Files.isRegularFile(path) && path.getFileName().toString().endsWith(".txt") && Files.isReadable(path)) {
                        try (Stream<String> linesStream = Files.lines(path, StandardCharsets.ISO_8859_1)) {
                            //retrieve file content
                            Set<String> fileContent = new HashSet<>();

                            linesStream.forEach((x) -> {
                                Set<String> lineContent = new HashSet(Arrays.asList(x.split(BLANK_SPACE)));
                                if (!lineContent.isEmpty()) {
                                    fileContent.addAll(lineContent);
                                }
                            });

                            DefaultSearchEngine searchEngine = new DefaultSearchEngine(fileContent, new HashSet<>(Arrays.asList(wordsToSearch)));
                            Integer score = searchEngine.processSearch();
                            result = new Result().withFileName(path.getFileName().toString()).withScore(score);
                            resultList.add(result);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } finally {
                stream.close();
            }
        } catch (IOException e) {
            System.out.println("Path might not exist : " + directoryPath);
        }
    }
}

