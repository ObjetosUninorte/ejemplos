package uberpets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augustosalazar
 */
public class Driver {
    private int mId;
    private Car mCar;
    private String mName;

    public Driver(int id,String name) {
        mId = id;
        mName = name;
        mCar = new Car();
    }
    
    public int getId(){
        return mId;
    }
    
    
}
