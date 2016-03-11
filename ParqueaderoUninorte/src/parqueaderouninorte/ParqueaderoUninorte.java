package parqueaderouninorte;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Work in progress
Diseñar un diagrama de clases para administrar el parqueadero de Uninorte, en donde:

Pueden parquear:
Funcionarios (gratis)
Estudiantes
Cada funcionario puede tener registrado dos carros y solo puede tener en el parqueadero uno de ellos al mismo tiempo.
Hay 4 parqueaderos:
Parqueadero A con 50 puestos y 1500 la hora
Parqueadero B con 100 puestos y 1000 la hora
Parqueadero c con 150 puestos y 500 la hora (solo para estudiantes)
Un estudiante que venga en el carro de un funcionario (manejando y sin el funcionario) puede tendrá un descuento del 50%. El funcionario no podrá parquear otro carro.
Preguntas:

Para un momento dado, ¿cuantos funcionarios tienen un carro parqueado manejado por un estudiante?
En un momento dado, ¿cual es el parqueadero que proporcionalmente está más lleno?
*/


public class ParqueaderoUninorte {

    private Parking mParkingA;
    private Parking mParkingB;
    private Parking mParkingC;

    public ParqueaderoUninorte() {
        mParkingA = new Parking(50);
        mParkingB = new Parking(100);
        mParkingC = new Parking(150); 
    }
    
   
    public static void main(String[] args) {
         
        ParqueaderoUninorte parqueaderoUninorte = new ParqueaderoUninorte();
        ArrayList<Teacher> teachers = new ArrayList<>(); 
        ArrayList<Student> students = new ArrayList<>(); 
        // esta lista solo es necesaria para realizar una simulacion
        // normalmente los carros estan solo amarrados a los profesores
        ArrayList<Car> cars = new ArrayList<>(); 
        
        // agregamos los profesores al sistema
        for (int i = 0; i <= 40 ; i++){
            Teacher teacher= new Teacher(i);
            teachers.add(teacher);
        }
        
        // agregamos los estudiantes al sistema
        for (int i = 0; i <= 80 ; i++){
            Student student = new Student(i+1000);
            students.add(student);
        }

        // agregamos los carros al sistema
        for (int i = 0; i <= 80 ; i++){
            Car car = new Car(i);
            if (i < 40){
                car.setOwner(teachers.get(i));
                if (i < 20){
                    car.setDriver(teachers.get(i));
                } else {
                    car.setDriver(students.get(i));
                }
            } else{
                car.setOwner(students.get(i));
                car.setDriver(students.get(i));
            }
            cars.add(car);
        }
        
        int numeroParqueadero;
       
        // start parking    
         Random randomno = new Random();
         
        for (int i = 0; i <= 80 ; i++){
            numeroParqueadero = randomno.nextInt(3);       
            Car car = cars.get(i);
            System.out.println("Parking " + numeroParqueadero);
            System.out.println(" "+ car.getOwner().getId()+ " same? "+car.isDriverTheOwner());

            switch(numeroParqueadero){
                case 0:
                    parqueaderoUninorte.mParkingA.parkCar(car);
                    break;
                case 1:
                    parqueaderoUninorte.mParkingB.parkCar(car);
                    break;
                case 2:
                    parqueaderoUninorte.mParkingC.parkCar(car);
                    break;    

            }
             System.out.println("_____________________");

        }
    }
    
}
