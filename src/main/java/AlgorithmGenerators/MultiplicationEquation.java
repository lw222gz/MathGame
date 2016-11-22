package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-12.
 */
public class MultiplicationEquation extends EquationBase {

    public MultiplicationEquation(int value, Random rand){
        super(value, rand);
    }

    //Generates and returns a String representation of a multiplication equation, possible addition might be used
    //To balance out to provided the wanted value
    public String generateEquation(){

        //by default I want only to use low number multiplication.
        //TODO: future implementation with higher difficulties increase the multiplication value
        int multiplicationValue = rand.nextInt(9) + 2; //random value between 2-10
        if(multiplicationValue >= value){
            return value + " * 1";
        }

        int secondMultiplicationValue;
        int remaining = value % multiplicationValue;
        //If rest is 0 then value/multiplicationValue will provide a second value for the equation to calculate the value
        if(remaining == 0){
            secondMultiplicationValue = value / multiplicationValue;
            return multiplicationValue + " * " + secondMultiplicationValue;
        }
        //else value must be modified to be dividable with multiplicationValue
        else{
            int equationValue = value;
            equationValue -= remaining;
            secondMultiplicationValue = equationValue / multiplicationValue;

            return multiplicationValue + " * " + secondMultiplicationValue + " + " + remaining;
        }
    }
}
