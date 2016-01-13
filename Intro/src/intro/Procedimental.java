package intro;


public class Procedimental {
    int parametroA;
    int parametroB;
    
    int sumaParametroA(int valor){
        return parametroA + valor;
    }
    
    void sumarParametroA(int valor){
        this.parametroA = this.parametroA + valor;
    }
    
    int getParametroB(){
       return parametroB; 
    }
    
    void setParametroB(int valor){
        parametroB = valor;
    }
    
    public static void main(String[] args) {
        
    }
    
}
