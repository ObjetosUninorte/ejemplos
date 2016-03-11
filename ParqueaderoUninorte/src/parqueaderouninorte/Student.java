package parqueaderouninorte;


public class Student extends Driver{
    
    private Car mCar1;
    
    public Student(int id) {
        super(id);
    }
    
    public void addCar(Car car){
        if (mCar1 == null){
            mCar1 = car;
        }
    }
    
    
}
