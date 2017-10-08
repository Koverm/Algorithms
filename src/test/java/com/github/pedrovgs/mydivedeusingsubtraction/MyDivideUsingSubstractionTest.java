package com.github.pedrovgs.mydivedeusingsubtraction;

import com.github.pedrovgs.problem5.DivideUsingSubtraction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyDivideUsingSubstractionTest {

    private static final float DELTA=0.1f;

    private DivideUsingSubtraction dus;

    @Before
    public void setUp(){dus= new DivideUsingSubtraction();}

    @Test (expected = IllegalArgumentException.class)
    public void DivideByZeroIterative(){
        dus.divideIterative(25,0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void DivideByZeroRecursive(){
        dus.divideRecursive(25,0);
    }
    @Test
    public void DividableRecursive(){
        float result =dus.divideRecursive(100,25);

        assertEquals(4, result, DELTA);
    }

    @Test
    public void DividableIterative(){
        float result =dus.divideIterative(200,25);

        assertEquals(8, result, DELTA);
    }
    @Test
    public void NonDividableRecursive(){
        float result =dus.divideRecursive(110,20);

        assertEquals(5.5f, result, DELTA);
    }

    @Test
    public void NonDividableIterative(){
        float result =dus.divideIterative(113,10);

        assertEquals(11.3, result, DELTA);
    }

    @Test
    public void DividerBiggerRecursive(){
        float result =dus.divideRecursive(25,100);

        assertEquals(0.25, result, DELTA);
    }

    @Test
    public void DividerBiggerIterative(){
        float result =dus.divideIterative(20,100);

        assertEquals(0.2, result, DELTA);
    }

}
