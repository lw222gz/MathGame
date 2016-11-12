package AlgorithmGenerators;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lucas on 2016-11-12.
 */
public class MultiplicationEquationTest {

    private MultiplicationEquation sut;

    @Before
    public void setUp() throws Exception {
        sut = null;
    }

    @Test
    public void shouldReturnEquationString(){
        sut = new MultiplicationEquation(50);
        String str = sut.generateEquation();

        Assert.assertTrue(str != null && str.length() > 0);
    }

    @Test
    public void shouldReturnValueTimesOne(){
        sut = new MultiplicationEquation(1);
        String actual = sut.generateEquation();
        String expected = "1 * 1";

        Assert.assertEquals(expected, actual);
    }



}