package AlgorithmGenerators;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

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

        sut = new DivisionEquation(27, new Random());
        String actual = sut.generateEquation();
        for(int i = 0; i < 50; i++){
            System.out.println(sut.generateEquation());
        }

        Assert.assertTrue(actual != null && actual.length() > 0);
    }

    @Test
    public void shouldGenerate




}