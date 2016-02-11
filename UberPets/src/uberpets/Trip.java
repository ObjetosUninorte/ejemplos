/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uberpets;

/**
 *
 * @author augustosalazar
 */
public class Trip {
    Client mClient;
    Driver mDriver;
    String mInitialPoint;
    String mFinalPoint;
    float mCost;

    public Trip(Client mClient, Driver mDriver, String mInitialPoint, String mFinalPoint) {
        this.mClient = mClient;
        this.mDriver = mDriver;
        this.mInitialPoint = mInitialPoint;
        this.mFinalPoint = mFinalPoint;
        calculateCost();
    }
    
    private void calculateCost(){
        mCost = Math.round(1000);
    }

    public float getCost() {
        return mCost;
    }
   
}
