package org.review.amz.algo.zero_of_function;

import java.util.function.Function;

public class ZeroOfFunction {


    public static final double[] doSearchRange(Function<Double, Double> function, double min, double max, double errorMargin) {
        if (min > max) {
            return null;
        }
        /*
        if (function.apply(min) * function.apply(max) > 0) {
            return null;
        }*/

        if (max - min < errorMargin) {
            return new double[]{min, max};
        }

        double middle = min + max / 2;

        if (function.apply(middle) - function.apply(min) < 0) {
            return doSearchRange(function, min, middle, errorMargin);
        } else {
            return doSearchRange(function, middle, max, errorMargin);
        }
    }
}
