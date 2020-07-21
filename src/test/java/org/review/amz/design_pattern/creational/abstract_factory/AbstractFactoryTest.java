package org.review.amz.design_pattern.creational.abstract_factory;

import org.junit.Test;

public class AbstractFactoryTest {

  @Test
  public void abstractFactory_Test() {
    InfrastructureFactory infrastructureFactory =
        InfrastructureFactory.getFactoryInstance("serverless");
    IRelationalDB db = infrastructureFactory.getRelationalDB(null);
    System.out.println("db " + db.getName());
  }
}
