package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-12.
 */
public class AdditionEquation {

    //sum of equation
    private int value;

    private Random rand;

    public AdditionEquation(int value){
        this.value = value;
        rand = new Random();
    }


    public String generateEquation(){
        int sumOfEquation = value;
        int amountOfSplits = rand.nextInt(2) + 1; //random value 1 or 2.
        String equationString = "";

        for(int i = 0; i < amountOfSplits; i++){
            int splitValue = rand.nextInt(sumOfEquation) + 1;
            sumOfEquation -= splitValue;
            equationString += splitValue + " + ";

        }
        //30+20+0 passes
        equationString += sumOfEquation;
        return equationString;
    }
}
