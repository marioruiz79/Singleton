package singleton;


public class Patron {
    
    private static final Patron Instance = new Patron();
 
    private Patron(){}
 
    public static Patron obtenerInstancia(){
        return Patron.Instance;
    }
 
    public void saludar(){
        System.out.println("Hola");
    }
}







