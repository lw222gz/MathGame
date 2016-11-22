package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-12.
 */
abstract class EquationBase {
    protected int value;
    protected Random rand;

    public EquationBase(int value, Random rand){
        this.value = value;
        this.rand = rand;
    }

    abstract String generateEquation();
}
