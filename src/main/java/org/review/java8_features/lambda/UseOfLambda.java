package org.review.java8_features.lambda;

public class UseOfLambda {

  public static ITransportation transportation =
      new ITransportation() {
        @Override
        public void calculatePrice(int distance) {
          System.out.println("The price is " + 2 * distance);
        }
      };

  public static ITransportation transportationUsingLambda =
      (da) -> System.out.println("{using lambda expressions} The price is " + 2 * da);

  public static ISum sum = (x, y) -> x + y;
}
