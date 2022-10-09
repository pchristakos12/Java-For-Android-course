package mooc.vandy.java4android.buildings.logic;

import java.security.acl.Owner;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;
    public House(int length, int width, int lotLength, int lotWidth){
        super(length,width,lotLength,lotWidth);
        this.mOwner = null;
        this.mPool = false;


    }
    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }
    public House(int length, int width,int lotLength, int lotWidth, String mOwner, boolean mPool){
        super(length,width,lotLength,lotWidth);
        this.mOwner = mOwner;
        this.mPool = false;

    }
    public String getOwner(){
        return this.mOwner;
    }
    public boolean hasPool(){
        return  this.mPool;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    @Override
    public String toString() {
        String combine = "Owner: ";

        if(mOwner!=null){
            combine += getOwner();

        }else{
            combine += "n/a";
        }if(mPool){
            combine += getOwner() + "; has pool";

        }if(this.calcLotArea() > 2*this.calcBuildingArea()){
            combine += "; has a big open space";

        }
        return combine;

    }
    public boolean equals(Object obj){
        if(obj instanceof House){
            House house2 = (House) obj;
            if (house2.calcBuildingArea() == this.calcBuildingArea() && house2.hasPool() == this.hasPool())
                return true;

        }
        return false;
    }

}
