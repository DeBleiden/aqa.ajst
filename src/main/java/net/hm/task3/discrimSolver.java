package net.hm.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class discrimSolver {

    Object[] xResult;
    int x1, x2, x0;
    int resultD, finalD;

    int p1, p2;

    public Object[] polynomialSolver (int argA, int argB, int argC) {

        //p1 = (int) Math.pow(argB, 2);
        //p2 = 4*argA*argC;
        ///resultD = p1 - p2;
        resultD = (int) ((Math.pow(argB, 2)) - (4*argA*argC));
        finalD = (int) (Math.sqrt(resultD));

        if (resultD < 0) {
            xResult = new Object[] {null};
        }
        else if (resultD == 0) {
            x0 = (-argB + finalD)/2*argA;
            xResult = new Object[] {x0};
        }
        else if (resultD > 0) {
            x1 = ((-argB) + finalD)/(2*argA);
            x2 = ((-argB) - finalD)/(2*argA);

            xResult = new Object[] {x1, x2};
        }

        return xResult;
    }

}
