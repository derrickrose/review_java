package org.review.amz.design_pattern.creational.abstract_factory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ServerlessArchitectureFactory extends InfrastructureFactory {
  @Override
  IRelationalDB getRelationalDB() {
    return new RdsDB();
  }

  @Override
  INonRelationalDB getNonRelationalDB() {
    return new DynamoDB();
  }
}
