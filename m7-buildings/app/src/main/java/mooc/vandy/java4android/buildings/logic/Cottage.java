package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {
    // TODO - Put your code here
    private boolean mSecondFloor;

    public Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension,dimension,lotLength,lotWidth);

    }
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor){
        super(dimension,dimension, lotLength, lotWidth, owner, secondFloor);
        mSecondFloor = secondFloor;

    }
    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    @Override
    public String toString() {
        String combine = "Owner ";

        if (super.getOwner() != null) {
            combine += getOwner();
        } if (super.getOwner() != null && super.hasPool() == true) {
            combine += getOwner() + " has pool";
        } if (super.getOwner() != null && super.hasPool() == true && this.calcLotArea() > 2 * this.calcBuildingArea()) {
            combine += getOwner() + " has pool and " + " has a big open space";

        } if (super.getOwner() != null && super.hasPool() == true && this.calcLotArea() > 2 * this.calcBuildingArea() && hasSecondFloor()) {
            combine += getOwner() + " has pool and " + " has a big open space " + " is a cottage";

        }
        return combine;
    }
}

