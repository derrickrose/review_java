package org.review.java8_features;

import org.junit.Ignore;
import org.junit.Test;
import org.review.java8_features.function.Car;
import org.review.java8_features.function.UseOfFunction;
import org.review.java8_features.interface_revolution.default_method.Alien;
import org.review.java8_features.interface_revolution.functional_interface.WorkFromHome;
import org.review.java8_features.interface_revolution.static_method.SuperReproduction;
import org.review.java8_features.lambda.UseOfLambda;
import org.review.java8_features.reference_to_a_method.UseReferenceToAMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8FeaturesTest {
  @Ignore
  @Test
  public void java8FeaturesInterfaceRevolution_Test() {
    Alien a = new Alien();
    a.reproduce();
    a.redef();

    SuperReproduction.description();
  }

  @Ignore
  @Test
  public void functionalInterface_Test() {
    WorkFromHome workFromHome = new WorkFromHome();
    workFromHome.locationType();
  }

  @Ignore
  @Test
  public void lambda_Test() {
    UseOfLambda.transportation.calculatePrice(2);
    UseOfLambda.transportationUsingLambda.calculatePrice(2);
    System.out.println("to sum values : " + UseOfLambda.sum.sum(2, 6));
  }

  @Ignore
  @Test
  public void useOfFunction_Test() {
    boolean testNotNull = UseOfFunction.isNotNull.test("");
    System.out.println("value of testNotNull " + testNotNull);
  }

  @Test
  @Ignore
  public void useOfConsumer_Test() {
    List<Car> cars = Arrays.asList(new Car(), new Car());
    cars.forEach(
        (car) -> {
          UseOfFunction.initializeBrand.accept(car);
        });

    cars.forEach(
        (car) -> {
          System.out.println("brand set " + car.getBrand());
        });

    Car car1 = cars.get(0);
    car1.BrandConsumer.accept("kia");

    System.out.println("new brand set " + car1.BrandSupplier.get());
  }

  @Test
  public void useOfReferenceToMethod_Test() {
    Function<String, UseReferenceToAMethod> create = UseReferenceToAMethod::new;
    UseReferenceToAMethod instance = create.apply("test");
    Consumer<String> print = System.out::println;
    print.accept("value " + instance.nameHandling.get());
  }
}
