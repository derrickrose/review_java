package org.review.java8_features;

import org.junit.Test;
import org.review.java8_features.interface_revolution.default_method.Alien;
import org.review.java8_features.interface_revolution.static_method.SuperReproduction;

public class Java8Features {
  @Test
  public void testJava8Features() {
    Alien a = new Alien();
    a.reproduce();
    a.redef();

    SuperReproduction.description();
  }
}
