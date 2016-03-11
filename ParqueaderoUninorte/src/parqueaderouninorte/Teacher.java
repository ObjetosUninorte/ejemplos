package parqueaderouninorte;


public class Teacher extends Driver{
    
   private Car mCar1;
   private Car mCar2;
    
    public Teacher(int id) {
        super(id);
    }
    
    public void addCar(Car car){
        if (mCar1 == null){
            mCar1 = car;
        } else if (mCar2 == null) {
            mCar2 = car;
        }
    }
    
}
