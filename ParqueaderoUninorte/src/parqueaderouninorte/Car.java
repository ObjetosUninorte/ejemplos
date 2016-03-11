package parqueaderouninorte;

public class Car {
    private int mPlate;
    private Driver mDriver;
    private Driver mOwner;

    public Car(int mPlate) {
        this.mPlate = mPlate;
    }

    public void setOwner(Driver mOwner) {
        this.mOwner = mOwner;
    }
    
    public Car(int mPlate, Driver mOwner) {
        this.mPlate = mPlate;
        this.mOwner = mOwner;
    }
    
    public Driver getOwner(){
        return mOwner;
    }
    
    public Driver getDriver(){
        return mDriver;
    }
    
    public void setDriver(Driver driver){
        mDriver = driver;
    }
    
    public boolean isDriverTheOwner(){
        if (mDriver == null ){
            System.out.println("Car "+mPlate+" does not have driver");
            return false;
        }
        if (mDriver.equals(mOwner)){
            return true;
        } 
        return false;
    }
}
