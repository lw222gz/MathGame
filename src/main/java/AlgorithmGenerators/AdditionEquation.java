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
        int equationValue = value;
        int amountOfSplits = 2;//rand.nextInt(2) + 1; //random value 1 or 2.
        String equationString = "";

        for(int i = 0; i < amountOfSplits; i++){
            int splitValue = rand.nextInt(equationValue) + 1;
            equationValue -= splitValue;
            equationString += splitValue;

            if(equationValue <= 0){
                break;
            }
            else{
                equationString += " + ";
            }

        }

        if(equationValue > 0){
            equationString += equationValue;
        }

        return equationString;
    }
}
