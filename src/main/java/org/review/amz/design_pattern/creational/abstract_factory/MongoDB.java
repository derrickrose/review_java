package org.review.amz.design_pattern.creational.abstract_factory;

public class MongoDB implements INonRelationalDB {
  @Override
  public String getName() {
    return "I am MongoDB - I am a non relational server based db";
  }
}