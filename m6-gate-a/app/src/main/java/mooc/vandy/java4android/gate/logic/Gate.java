package mooc.vandy.java4android.gate.logic;

import androidx.annotation.NonNull;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate() {
        this.mSwing = CLOSED;
    }
    //sets swing to IN OUT OR CLOSED
    public boolean setSwing(int direction){
        if(direction == IN || direction == OUT || direction == CLOSED){
            this.mSwing = direction;
            return true;
        }
        else {
            return false;
        }
    }
    //determines if IN or OUT and if true then swing direction is open
    public boolean open(int direction){
        if(direction==IN || direction == OUT){
            this.setSwing(direction);
            return true;
        }
        else{
            return false;
        }
    }
    //sets gate to closed
    public void close(){
        mSwing = this.CLOSED;
    }
    //gets direction of swing
    public int getSwingDirection(){
        return mSwing;


    }
    //based on direction it returns a positive count for IN, negative for OUT and 0 for CLOSED
    public int thru(int count){
        if(mSwing==IN){
            return count;

        }
        if(mSwing==OUT){
            return -count;

        }else{
            return 0;
        }



    }

    //sets the output based on direction

    @NonNull
    @Override
    public String toString() {
        // if copy and pasting strings for return statement from pdf, delete \n or toString() fails testing
        if(mSwing== CLOSED){
            return "This gate is closed";
        }else if(mSwing == IN){
            return "This gate is open and swings to enter the pen only";
        }else if(mSwing == OUT){
            return "This gate is open and swings to exit the pen only";

        }else{
            return "This gate has an invalid swing direction";
        }

    }
}
