package org.review.amz.design_pattern.creational.abstract_factory;

public class ServerBasedArchitectureFactory extends InfrastructureFactory {
  @Override
  IRelationalDB getRelationalDB() {
    return null;
  }

  @Override
  INonRelationalDB getNonRelationalDB() {
    return null;
  }
}
