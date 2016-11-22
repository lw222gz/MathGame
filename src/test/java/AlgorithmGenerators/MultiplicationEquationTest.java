package AlgorithmGenerators;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

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
        sut = new MultiplicationEquation(50, new Random());
        String actual = sut.generateEquation();

        Assert.assertTrue(actual != null && actual.length() > 0);
    }

    @Test
    public void shouldReturnTenTimesFive(){
        Random randMock = Mockito.mock(Random.class);

        int value = 50;
        sut = new MultiplicationEquation(value, randMock);

        //when generating the multiplier 8 will be returned
        //This is expected to be added by 2 since the lowest value to roll should be 2.
        when(randMock.nextInt(9)).thenReturn(8);

        String expected = "10 * 5";
        String actual = sut.generateEquation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnThreeTimesSixteenPlusTwo(){
        Random randMock = Mockito.mock(Random.class);

        int value = 50;
        sut = new MultiplicationEquation(value, randMock);

        //Simulate the random generated multiplier
        //This is expected to be added by 2 since the lowest value to roll should be 2
        when(randMock.nextInt(9)).thenReturn(1);

        String expected = "3 * 16 + 2";
        String actual = sut.generateEquation();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnValueTimesOne(){
        sut = new MultiplicationEquation(1, new Random());
        String actual = sut.generateEquation();
        String expected = "1 * 1";

        Assert.assertEquals(expected, actual);
    }



}