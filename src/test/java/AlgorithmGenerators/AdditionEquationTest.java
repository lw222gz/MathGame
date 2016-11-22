package AlgorithmGenerators;

import AlgorithmGenerators.AdditionEquation;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Lucas on 2016-11-12.
 */
public class AdditionEquationTest {

    private AdditionEquation sut;

    @org.junit.Before
    public void setUp() throws Exception {
        sut = null;
    }

    @Test
    public void shouldReturnEquationString(){
        sut = new AdditionEquation(50, new Random());

        String str = sut.generateEquation();

        Assert.assertTrue(str != null && str.length() > 0);
    }

    @Test
    public void shouldReturnEquationStringWithTwoValues(){
        Random randMock = Mockito.mock(Random.class);

        int value = 50;
        sut = new AdditionEquation(value, randMock);


        //Simulate the roll for the amount of splits. (This should get added by one to avoid rolling 0.
        when(randMock.nextInt(2)).thenReturn(0);

        //Simulate the roll for the split value. //This should be added by one to avoid rolling 0.
        when(randMock.nextInt(value)).thenReturn(19);

        //String should currently be 20 +

        //remaning value should be added
        String expected = "20 + 30";
        String actual = sut.generateEquation();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEquationStringWithThreeValues(){
        Random randMock = Mockito.mock(Random.class);

        int value = 50;
        int firstEquationValue = 10;

        sut = new AdditionEquation(value, randMock);



        //simulate the roll for the amount of splits. (This should get added by one to avoid rolling 0.
        //Simulate 2 splits
        when(randMock.nextInt(2)).thenReturn(1);

        //Simulate the first roll for the split value. (This should be added by one to avoid rolling 0.)
        when(randMock.nextInt(value)).thenReturn(9);

        //current string should be 10 +

        //Simulate the second roll for the split value. (This should be added by one to avoid rolling 0.)
        when(randMock.nextInt(value-firstEquationValue)).thenReturn(19);

        //current string should be 10 + 20 +
        //remaining value should be 20, string should be finished as 10 + 20 + 20
        String expected = "10 + 20 + 20";
        String actual = sut.generateEquation();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void shouldReturnJustOne(){
        sut = new AdditionEquation(1, new Random());
        String actual = sut.generateEquation();
        String expected = "1";

        Assert.assertEquals(expected, actual);
    }

}