package AlgorithmGenerators;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        sut = new DivisionEquation(50);
        String actual = sut.generateEquation();

        Assert.assertTrue(actual != null && actual.length() > 0);
    }


}