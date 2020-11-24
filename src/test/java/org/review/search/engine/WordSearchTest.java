package org.review.search.engine;

import org.apache.commons.io.FileUtils;
import org.review.search.WordSearch;
import org.junit.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** Unit test for WordSearch. */
public class WordSearchTest {

  private static final String DIRECTORY = "search_dir";
  private static final String INDEX = "index";
  private static final String FILE_NAME = DIRECTORY + "/my_fic" + INDEX + ".txt";

  @Before
  public void writeFile() {
    File theDir = new File(DIRECTORY);
    if (!theDir.exists()) {
      theDir.mkdirs();
    }
    for (int index = 0; index < 13; index++) {
      FileWriter myWriter;
      try {
        myWriter = new FileWriter(FILE_NAME.replace(INDEX, String.valueOf(index)));
        if (index % 2 == 0) {
          myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
          myWriter.write("as fun enough!\n");
          myWriter.write("Files iais fun enough!\n");
        } else if (index % 3 == 0) {
          myWriter.write("hello\n");
          myWriter.write("hi hi hi");
          myWriter.write("ha ha ha \n");
        } else if (index % 5 == 0) {
          myWriter.write("hello hi \n");
          myWriter.write("hi hi hi");
          myWriter.write("ha ha ha \n");
        } else {
          myWriter.write("bu bu \n");
          myWriter.write("ba");
          myWriter.write("che che\n");
        }
        myWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void wordSearchIntegration_Test() {
    WordSearch wordSearch = new WordSearch(DIRECTORY, new String[] {"hi", "hello"});
    wordSearch.startSearch();
    Assert.assertTrue(wordSearch.getResultList().size() == 10);
    wordSearch
        .getResultList()
        .forEach(
            (result) -> System.out.println(result.getFileName() + " : " + result.getScore() + "%"));
    Assert.assertTrue(wordSearch.getResultList().get(0).getScore() == 100);
  }

  @After
  public void removeDir() {
    try {
      FileUtils.deleteDirectory(new File(DIRECTORY));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
