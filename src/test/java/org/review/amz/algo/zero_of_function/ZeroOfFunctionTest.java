package org.review.amz.algo.zero_of_function;

import org.junit.Test;

import java.util.function.Function;

import static org.review.amz.algo.zero_of_function.ZeroOfFunction.doSearchRange;

public class ZeroOfFunctionTest {

    @Test
    public void searchRange() {

        Function<Double, Double> function = (x) -> Math.pow(x, 2) - 2;

        double[] range = doSearchRange(function, -100, 200, 0.0001);

        int a = 0;



    }
}
