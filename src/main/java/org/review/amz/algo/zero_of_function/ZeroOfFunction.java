package org.review.amz.algo.zero_of_function;

import java.util.function.Function;

public class ZeroOfFunction {

  public static final double[] doSearchRange(
      Function<Double, Double> function, double min, double max, double errorMargin) {
    if (min > max) {
      return null;
    }

    double middle = min + ((max - min) / 2d);

    if (function.apply(middle).doubleValue() == 0d) {
      return new double[] {middle, middle + errorMargin};
    }

    if (function.apply(max).doubleValue() * function.apply(min).doubleValue() < 0d
        && max - min <= errorMargin) {
      return new double[] {min, max};
    }

    if (function.apply(middle) * function.apply(min) < 0d) {
      return doSearchRange(function, min, middle, errorMargin);
    } else {
      return doSearchRange(function, middle, max, errorMargin);
    }
  }
}
