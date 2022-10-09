package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    private double valueOne = 0;
    private double valueTwo = 0;

    public Add(double valueOne, double valueTwo){
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    //toString override to Add values and print out the results
    @Override
    public String toString() {
        return String.valueOf(valueOne + valueTwo);
    }
}
