package org.review.amz.design_pattern.creational.abstract_factory;

public class AWSRDSDB implements IRelationalDB {
  @Override
  public String getName() {
    return "I am AWSRDSDB - I am a cloud relational db";
  }
}
