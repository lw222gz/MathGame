package AlgorithmGenerators;

import AlgorithmGenerators.AdditionEquation;
import org.junit.Assert;
import org.junit.Test;

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
        sut = new AdditionEquation(50);
        String str = sut.generateEquation();
        System.out.println(str);

        Assert.assertTrue(str != null && str.length() > 0);
    }

}