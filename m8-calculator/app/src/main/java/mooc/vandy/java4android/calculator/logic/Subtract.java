package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private double valueOne = 0;
    private double valueTwo = 0;

    public Subtract(double valueOne,double valueTwo){
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    //toString override to Subtract values and print out the results
    @Override
    public String toString() {
        return String.valueOf(valueOne - valueTwo);
    }
}
