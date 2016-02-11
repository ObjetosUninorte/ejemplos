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
public class UberPets {
    
    private Driver[] mDriver;
    private Client[] mClient;
    private Trip[] mTrip;
    
    private int mRegisterClients;
    private int mRegisterDrivers;
    private final int DRIVER_MAX = 100;
    private final int  CLIENT_MAX = 200;
    
    public UberPets() {
        // vamos a asumir que tiene maximo 100 conductores
        mDriver = new Driver[DRIVER_MAX];
        mTrip = new Trip[DRIVER_MAX];
                
        // vamos a asumir que tiene maximo 200  clientes
        mClient = new Client[CLIENT_MAX];
        

        
        // comenzamos con cero conductores y clientes
        mRegisterDrivers = 0;
        mRegisterClients = 0;
    }
    
    public boolean registerNewClient(Client client){
        if (mRegisterClients < CLIENT_MAX){
            mClient[mRegisterClients] = client;
            mRegisterClients++;
            return true;
        } 
        return false;
    } 
    
    public boolean registerNewClient(String clientName){
        if (mRegisterClients < CLIENT_MAX){
            Client client = new Client(clientName);
            mClient[mRegisterClients] = client;
            mRegisterClients++;
            return true;
        } 
        return false;
    }     
    
        public boolean registerNewDriver(Driver driver){
        if (mRegisterDrivers < DRIVER_MAX){
            mDriver[mRegisterDrivers] = driver;
            mRegisterDrivers++;
            return true;
        } 
        return false;
    } 
    
    public boolean registerNewDriver(String driverName){
        if (mRegisterDrivers < DRIVER_MAX){
            Driver driver = new Driver(mRegisterDrivers,driverName);
            mDriver[mRegisterDrivers] = driver;
            mRegisterDrivers++;
            return true;
        } 
        return false;
    } 
    
    private Driver lookAvailableDrivers(){
        return mDriver[0];
    }
    
    public int createNewTrip(Client client, String initialDir, String finalDir){
        // look for available drivers
        Driver driver = lookAvailableDrivers();
       
        // we use driver´s id to store the new trip
        mTrip[driver.getId()] = new Trip(client, driver, initialDir,finalDir); 
        
        return driver.getId();
    }
    
    public void finishTrip(int tripId){
        
        mTrip[tripId] = null; 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
