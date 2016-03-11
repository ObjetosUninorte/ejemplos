package parqueaderouninorte;

import java.util.ArrayList;


public class Parking {
    private int mAvailableSlots;
    private ArrayList cars = new ArrayList<Car>();

    public Parking(int mAvailableSlots) {
        this.mAvailableSlots = mAvailableSlots;
    }
    
    public boolean parkCar(Car car){
            if(cars.size() < mAvailableSlots ){
                cars.add(car);
                return true;
            }
            return false;
    }
    
    
}
