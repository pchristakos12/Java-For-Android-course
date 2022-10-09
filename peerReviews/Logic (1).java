package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        // TODO -- add your code here
        frame(size);
        mOut.println();
        for (int i = 1;i<size;i++){
            mOut.print("|");
            printChar((size-i)," ");
            mOut.print("/");
            printRow(i);
            mOut.print("\\");
            printChar((size-i)," ");
            mOut.println("|");
        }
        mOut.print("|<");
        printRow(size);
        mOut.println(">|");
        for (int i = size-1;i>0;i--){
            mOut.print("|");
            printChar((size-i)," ");
            mOut.print("\\");
            printRow(i);
            mOut.print("/");
            printChar((size-i)," ");
            mOut.println("|");
        }
        frame(size);
        
    }

    // TODO -- add any helper methods here
    public void printChar(int t,String c){
        for (int j = 1;j<=t;j++){
            mOut.print(c);
        }
    }
    public void frame(int n){
        mOut.print("+");
        printChar(2*n,"-");
        mOut.print("+");
    }
    public void printRow(int r){

        if (r%2==0){
            printChar(2*r-2,"-");
        }
        else{
            printChar(2*r-2,"=");
        }
    }
    
}
