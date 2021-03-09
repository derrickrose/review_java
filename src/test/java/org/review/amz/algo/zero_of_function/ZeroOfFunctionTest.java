package org.review.amz.algo.zero_of_function;

import org.junit.Test;

import java.util.function.Function;

import static org.review.amz.algo.zero_of_function.ZeroOfFunction.doSearchRange;

public class ZeroOfFunctionTest {

    @Test
    public void searchRange() {

        Function<Double, Double> function = (x) -> Math.pow(x, 2) - 4;

        double[] range = doSearchRange(function, -1, 6, 0.01);

        int a = 0;



    }
}
