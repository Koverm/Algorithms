package com.github.pedrovgs.MyFactorialTest;

import com.github.pedrovgs.problem9.Factorial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFactorialTest {
    private Factorial fac;

    @Before
    public void setUp() {
        this.fac = new Factorial();
    }

    @Test
    public void factorialOf0Iterative(){
        int result = fac.getIterative(0);

        assertEquals(1,result);
    }
    @Test
    public void factorialOf0Recoursive(){
        int result = fac.getRecursive(0);

        assertEquals(1,result);
    }
    @Test
    public void factorialOf0TailRecoursive(){
        int result = fac.getTailRecursive(0);

        assertEquals(1,result);
    }

    @Test
    public void factorialOf6Iterative(){
        int result = fac.getIterative(6);

        assertEquals(720,result);
    }
    @Test
    public void factorialOf6Recoursive(){
        int result = fac.getRecursive(6);

        assertEquals(720,result);
    }
    @Test
    public void factorialOf6TailRecoursive(){
        int result = fac.getTailRecursive(6);

        assertEquals(720,result);
    }

}
