package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices;

    public Office(int length, int width, int lotLength, int lotWidth){

        super(length,width,lotLength,lotWidth);
        mParkingSpaces = 0;
        sTotalOffices++;


    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length,width,lotLength,lotWidth);
        this.mBusinessName = businessName;
        sTotalOffices++;


    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        super(length,width,lotLength,lotWidth);
        this.mBusinessName = businessName;
        mParkingSpaces = parkingSpaces;
        sTotalOffices++;


    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public static int getTotalOffices() {
        return sTotalOffices;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    @Override
    public String toString() {
        String combine = "Business: ";
        if(this.getBusinessName()!=null){
            combine+= mBusinessName;
        }else{
            combine+= "unoccupied";
        }if(this.getParkingSpaces()>0){
            combine+= "; has " + mParkingSpaces + " parking spaces";

        }
        return combine +" (total offices: " + sTotalOffices + ")";

    }

    public boolean equals(Object obj){
        if(obj instanceof Office){
            Office obj2 = (Office)obj;
            return this.calcBuildingArea() == obj2.calcBuildingArea() && this.mParkingSpaces == obj2.getParkingSpaces();
        }
        return false;
    }

}
