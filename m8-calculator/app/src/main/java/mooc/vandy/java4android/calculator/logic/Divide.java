package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private double valueOne = 0;
    private double valueTwo = 0;

    public Divide(double valueOne, double valueTwo){
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Override
    //toString override to Divide values and print out the results
    public String toString() {
        return String.valueOf(valueOne / valueTwo) + " Remainder:" + String.valueOf(valueOne % valueTwo);
    }
}
