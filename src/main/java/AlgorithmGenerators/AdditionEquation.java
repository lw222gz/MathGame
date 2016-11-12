package AlgorithmGenerators;

import java.util.Random;

/**
 * Created by Lucas on 2016-11-12.
 */
public class AdditionEquation extends EquationBase{

    public AdditionEquation(int value){
        super(value);
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
