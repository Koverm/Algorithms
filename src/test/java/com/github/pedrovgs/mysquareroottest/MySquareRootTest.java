package com.github.pedrovgs.mysquareroottest;

import com.github.pedrovgs.problem4.SquareRoot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySquareRootTest {

    private static final float DELTA=0.1f;

    private SquareRoot sqrt;

    @Before public void setUp(){sqrt= new SquareRoot();}

    @Test public void sqrtIterativeTest(){
        float result=sqrt.calculateSquareRootIterative(16);

        assertEquals(4,result,DELTA);
    }

    @Test public void sqrtRecursiveTest(){
        float result=sqrt.calculateSquareRootRecursive(16);

        assertEquals(4,result,DELTA);
    }

    @Test public void sqrtIterativeNonPerfectTest(){
        float result=sqrt.calculateSquareRootIterative(24);

        assertEquals(4.89898f,result,DELTA);
    }

    @Test public void sqrtRecursiveNonPerfectTest(){
        float result=sqrt.calculateSquareRootRecursive(24);

        assertEquals(4.89898f,result,DELTA);
    }

}
