package AlgorithmGenerators;

/**
 * Created by Lucas on 2016-11-13.
 */
public class DivisionEquation extends EquationBase {

    //These are values that I would consider easy to divide with. Numbers such as 6,7,8,9 I wold consider
    //Hard with a random number. This is mostly to test abit aswell and see how it goes.
    //TODO: change data-structure
    private int[] divisionValues = { 2, 3, 4, 5, 10};

    public DivisionEquation(int value){
        super(value);
    }

    public String generateEquation(){
        int denominator = divisionValues[rand.nextInt(divisionValues.length)];
        int numerator = denominator * value;

        return numerator + " / " + denominator;
    }
}
