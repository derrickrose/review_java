package org.review.godaddy;

import java.util.*;

public class CategoryGrouping {

  // solution 1
  public static final Map<String, String[]> groupByCategoryUsingMapOfArray(
      final List<String> articleCategoryPairs) {

    String[] articles;
    String[] newArticles;
    /*
    ici pas besoin d'utiliser TreeMap, un simple Hashmap aurait suffit car l'ordre n'est pas
    vraiment la priorité
    le plus indispensable est le choix de la structure de données
    etant donné que la complexité de HashMap et TreeMap reste très equivalent
    O(1) vs log(n)
     */
    Map<String, String[]> groupedByCategory = new TreeMap<>();
    String[] articleCategoryTab = new String[2];
    String article;
    String category;
    for (String articleCategory : articleCategoryPairs) {
      articleCategoryTab = articleCategory.split(":");
      article = articleCategoryTab[0];
      category = articleCategoryTab[1];
      if (!groupedByCategory.containsKey(category)) {
        newArticles = new String[1];
        newArticles[0] = article;
      } else {
        articles = groupedByCategory.get(category);
        // effectivement la meilleure solution ici c'est de convertir en list puis reconvertir en
        // array
        // ainsi la complexité reste O(n) + O(n) = 2*O(n) ~ O(n)
        // parce que recreer une array a chaque fois donne une complexité ~ O(n²)
        newArticles = new String[articles.length + 1];
        for (int indexArticle = 0; indexArticle < articles.length; indexArticle++) {
          newArticles[indexArticle] = articles[indexArticle];
        }
        newArticles[articles.length] = article;
      }
      groupedByCategory.put(category, newArticles);
    }
    return groupedByCategory;
  }

  // solution 2
  public static final Map<String, List<String>> groupByCategoryUsingMapOfList(
      final List<String> articleCategoryPairs) {

    List<String> articles;
    Map<String, List<String>> groupedByCategory = new HashMap<>();
    String[] articleCategoryTab = new String[2];
    String article;
    String category;
    for (String articleCategory : articleCategoryPairs) {
      articleCategoryTab = articleCategory.split(":");
      article = articleCategoryTab[0];
      category = articleCategoryTab[1];
      if (!groupedByCategory.containsKey(category)) {
        articles = new ArrayList<>();
        groupedByCategory.put(category, articles);
      }
      groupedByCategory.get(category).add(article);
    }
    return groupedByCategory;
  }

  // solution 3
  public static final Map<String, Map<String, Object>> groupByCategoryUsingMapOfMap(
      final List<String> articleCategoryPairs) {

    // ou peut etre treemap of treemap pour les ordres et diminuer en complexité
    // mais un peu useless vu la notion (key,value) n'est pas exploité
    // car ici value est toujours "" pour la map<article,value>
    Map<String, Object> articles;
    Map<String, Map<String, Object>> groupedByCategory = new HashMap<>();
    String[] articleCategoryTab = new String[2];
    String article;
    String category;
    for (String articleCategory : articleCategoryPairs) {
      articleCategoryTab = articleCategory.split(":");
      article = articleCategoryTab[0];
      category = articleCategoryTab[1];
      if (!groupedByCategory.containsKey(category)) {
        articles = new HashMap<>();
        groupedByCategory.put(category, articles);
      }
      groupedByCategory.get(category).put(article, "");
    }
    return groupedByCategory;
  }

  // solution 4
  public static final Map<String, Set<String>> groupByCategoryUsingTreeMapOfTreeSet(
      final List<String> articleCategoryPairs) {
    Set<String> articles;
    Map<String, Set<String>> groupedByCategory = new HashMap<>();
    String[] articleCategoryTab = new String[2];
    String article;
    String category;
    for (String articleCategory : articleCategoryPairs) {
      articleCategoryTab = articleCategory.split(":");
      article = articleCategoryTab[0];
      category = articleCategoryTab[1];
      if (!groupedByCategory.containsKey(category)) {
        articles = new TreeSet<>();
        groupedByCategory.put(category, articles);
      }
      groupedByCategory.get(category).add(article);
    }
    return groupedByCategory;
  }
}
