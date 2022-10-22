package net.hm.task3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

public class testDiscrimSolver{

    @Test
    public void discriminantIsZero () {
        int argA = 1, argB = 12, argC = 36;
        Object[] expectedResult = {-6};
        Object[] result;

        discrimSolver discrimSolver = new discrimSolver();
        result = discrimSolver.polynomialSolver(argA, argB, argC);
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void discriminantIsMoreThanZero () {
        int argA = 2, argB = 5, argC = -7;
        Object[] expectedResult = {1, -3};
        Object[] result;

        discrimSolver discrimSolver = new discrimSolver();
        result = discrimSolver.polynomialSolver(argA, argB, argC);
        Assert.assertEquals(result, expectedResult);

    }

    @Test
    public void discriminantIsLowerThanZero () {
        int argA = 1, argB = 2, argC = 6;
        Object[] expectedResult = {null};
        Object[] result;

        discrimSolver discrimSolver = new discrimSolver();
        result = discrimSolver.polynomialSolver(argA, argB, argC);
        Assert.assertEquals(result, expectedResult);
    }
}
