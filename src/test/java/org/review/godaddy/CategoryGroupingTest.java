package org.review.godaddy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CategoryGroupingTest {

  private List<String> articleCategoryPairs;

  @Before
  public void init() {
    articleCategoryPairs = new ArrayList<>();
    for (int indexArticle = 1; indexArticle <= 1000; indexArticle++) {
      // for (int indexCategory = 1; indexCategory <= 1000; indexCategory++) {
      articleCategoryPairs.add("article" + indexArticle + ":category" + indexArticle);
      // }
    }
    /*
    articleCategoryPairs.add("apple:fruit");
    articleCategoryPairs.add("coca:drink");
    articleCategoryPairs.add("orange:fruit");
    articleCategoryPairs.add("pepsi:drink");
    articleCategoryPairs.add("banana:fruit");
    //*/
  }

  @Test
  public void groupByCategoryUsingMapOfArray_returnExpectedValue() {
    long startTime = System.currentTimeMillis();

    Map<String, String[]> groupedByCategory =
        CategoryGrouping.groupByCategoryUsingMapOfArray(articleCategoryPairs);

    System.out.println("----------groupByCategoryUsingMapOfArray_returnExpectedValue");
    for (Map.Entry<String, String[]> entrySet : groupedByCategory.entrySet()) {
      // System.out.println(entrySet.getKey() + ":");

      for (String article : entrySet.getValue()) {
        // System.out.println("\t" + article);
      }
    }
    long executionTime = System.currentTimeMillis() - startTime;
    System.out.println("executionTime " + executionTime);
  }

  @Test
  public void groupByCategoryUsingMapOfList_returnUnorderedCategories() {
    long startTime = System.currentTimeMillis();
    Map<String, List<String>> groupedByCategory =
        CategoryGrouping.groupByCategoryUsingMapOfList(articleCategoryPairs);

    System.out.println("----------groupByCategoryUsingMapOfList_returnUnorderedCategories");
    for (Map.Entry<String, List<String>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().contains("article999")) break;
    }
    for (Map.Entry<String, List<String>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().contains("article999")) break;
    }
    for (Map.Entry<String, List<String>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().contains("article999")) break;
    }
    for (Map.Entry<String, List<String>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().contains("article999")) break;
    }
    for (Map.Entry<String, List<String>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().contains("article999")) break;
    }



    long executionTime = System.currentTimeMillis() - startTime;
    System.out.println("executionTime " + executionTime);
  }

  @Test
  public void groupByCategoryUsingTreeMapOfTreeSet_returnExpectedValue() {
    long startTime = System.currentTimeMillis();
    Map<String, Set<String>> groupedByCategory =
        CategoryGrouping.groupByCategoryUsingTreeMapOfTreeSet(articleCategoryPairs);

    System.out.println("----------groupByCategoryUsingTreeMapOfTreeSet_returnExpectedValue");
    for (Map.Entry<String, Set<String>> entrySet : groupedByCategory.entrySet()) {
      // System.out.println(entrySet.getKey() + ":");

      for (String article : entrySet.getValue()) {
        // System.out.println("\t" + article);
      }
    }

    long executionTime = System.currentTimeMillis() - startTime;
    System.out.println("executionTime " + executionTime);
  }

  @Test
  public void groupByCategoryUsingMapOfMap_returnUnorderedValue() {
    long startTime = System.currentTimeMillis();
    Map<String, Map<String, Object>> groupedByCategory =
        CategoryGrouping.groupByCategoryUsingMapOfMap(articleCategoryPairs);

    System.out.println("----------groupByCategoryUsingMapOfMap_returnUnorderedValue");
    for (Map.Entry<String, Map<String, Object>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().containsKey("article999")) break;
    }
    for (Map.Entry<String, Map<String, Object>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().containsKey("article999")) break;
    }
    for (Map.Entry<String, Map<String, Object>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().containsKey("article999")) break;
    }
    for (Map.Entry<String, Map<String, Object>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().containsKey("article999")) break;
    }
    for (Map.Entry<String, Map<String, Object>> entrySet : groupedByCategory.entrySet()) {
      if (entrySet.getValue().containsKey("article999")) break;
    }

    long executionTime = System.currentTimeMillis() - startTime;
    System.out.println("executionTime " + executionTime);
  }
}
