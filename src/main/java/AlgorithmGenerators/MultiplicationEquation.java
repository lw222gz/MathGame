package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-12.
 */
public class MultiplicationEquation extends EquationBase {

    public MultiplicationEquation(int value){
        super(value);
    }

    public String generateEquation(){

        int multiplicationValue = rand.nextInt(9) + 2; //random value between 2-10
        if(multiplicationValue >= value){
            return value + " * 1";
        }
        
        int secondMultiplicationValue = 0;
        int rest = value % multiplicationValue;
        //If rest is 0 then value/multiplicationValue will provide a second value for the equation to calculate the value
        if(rest == 0){
            secondMultiplicationValue = value / multiplicationValue;
            return multiplicationValue + " * " + secondMultiplicationValue;
        }
        //else value must be modified to be dividable with multiplicationValue
        else{
            int equationValue = value;
            equationValue -= rest;
            secondMultiplicationValue = equationValue / multiplicationValue;

            return multiplicationValue + " * " + secondMultiplicationValue + " + " + rest;
        }
    }
}
