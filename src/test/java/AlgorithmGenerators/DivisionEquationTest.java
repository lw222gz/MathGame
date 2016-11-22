package AlgorithmGenerators;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Lucas on 2016-11-13.
 */
public class DivisionEquationTest {
    private DivisionEquation sut;

    @Before
    public void setUp() throws Exception {
        sut = null;
    }

    @Test
    public void shouldReturnEquationString(){

        sut = new DivisionEquation(50, new Random());
        String actual = sut.generateEquation();

        Assert.assertTrue(actual != null && actual.length() > 0);
    }


    @Test
    public void shouldReturnEquationStringHundredDividedByTwo(){
        Random randMock = Mockito.mock(Random.class);
        sut = new DivisionEquation(50, randMock);

        //This is to simulate the numerator roll,
        //This is expected to be added by 10 because the numerator should not be lower than 10
        when(randMock.nextInt(91)).thenReturn(90);

        //This is to simulate the denominator roll
        //This is expected to be added by 1 because a denominator should never be abel to be zero.
        when(randMock.nextInt(10)).thenReturn(1);

        String actual = sut.generateEquation();
        String expected = "100 / 2";

        Assert.assertEquals(expected, actual);
    }






}