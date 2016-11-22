package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-12.
 */
public class AdditionEquation extends EquationBase{

    public AdditionEquation(int value, Random rand){
        super(value, rand);
    }


    //Generates and returns a string representation of a Addition equation
    public String generateEquation(){
        int equationValue = value;
        //TODO: future implementation, increase amount of possible splits
        int amountOfSplits = rand.nextInt(2) + 1; //random value 1 or 2.
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
