package mooc.vandy.java4android.calculator.logic;

import android.graphics.Path;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    //They will act like buttons to call each operation
    //No value for division because if the first 3 are not called it will carry out division
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;



    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        //Here we test each argument if its either Adding,subtracting,multiplying,dividing
        // we then create an instance of each class and call their toString method
        if(operation==ADDITION){
            Add addition = new Add(argumentOne,argumentTwo);
            mOut.print(addition.toString());
        }else if(operation == SUBTRACTION){
            Subtract subtraction = new Subtract(argumentOne,argumentTwo);
            mOut.print(subtraction.toString());


        }else if(operation==MULTIPLICATION){
            Multiply multiplication = new Multiply(argumentOne,argumentTwo);
            mOut.print(multiplication.toString());
        }else{
            Divide division = new Divide(argumentOne,argumentTwo);
            mOut.print(division.toString());
        }
        
    }
}
