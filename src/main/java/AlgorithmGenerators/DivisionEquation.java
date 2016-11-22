package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-13.
 */
public class DivisionEquation extends EquationBase {

    //These are values that I would consider easy to divide with. Numbers such as 6,7,8,9 I wold consider
    //Hard with a random number. This is mostly to test abit aswell and see how it goes.
    //TODO: change data-structure
    private int[] divisionValues = { 2, 3, 4, 5, 10};

    public DivisionEquation(int value, Random rand){
        super(value, rand);
    }

    public String generateEquation(){
        int denominator = rand.nextInt(9) + 2;
        int numerator = denominator * value;

        return numerator + " / " + denominator;
    }
}
