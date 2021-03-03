package org.review.amz.algo.zero_of_function;

import java.util.function.Function;

public class ZeroOfFunction {


    public static final double[] doSearchRange(Function<Double, Double> function, double min, double max, double errorMargin) {
        if (min > max) {
            return null;
        }

        double middle = min + max / 2;

        if (function.apply(middle) <= errorMargin) {
            return new double[]{min, max};
        }

        if (function.apply(middle) - function.apply(min) > 0) {
            return doSearchRange(function, min, middle - errorMargin, errorMargin);
        } else {
            return doSearchRange(function, middle + errorMargin, max, errorMargin);
        }

    }
}
