package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-12.
 */
abstract class EquationBase {
    protected int value;
    protected Random rand;

    public EquationBase(int value){
        this.value = value;
        rand = new Random();
    }

    abstract String generateEquation();
}
