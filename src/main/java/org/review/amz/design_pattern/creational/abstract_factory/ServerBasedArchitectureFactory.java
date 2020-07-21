package org.review.amz.design_pattern.creational.abstract_factory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ServerBasedArchitectureFactory extends InfrastructureFactory {
  @Override
  IRelationalDB getRelationalDB() {
    return new MariadDB();
  }

  @Override
  INonRelationalDB getNonRelationalDB() {
    return new MongoDB();
  }
}
