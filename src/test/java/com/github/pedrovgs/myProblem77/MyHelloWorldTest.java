package com.github.pedrovgs.myProblem77;

import com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class MyHelloWorldTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    private HelloWorldWithoutSemicolon hw;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        hw=new HelloWorldWithoutSemicolon();
    }
    @Test
    public void out() {
        hw.main(new String[0]);
        assertEquals("Hello world", outContent.toString());
    }
    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}
