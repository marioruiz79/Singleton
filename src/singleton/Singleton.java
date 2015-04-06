
package singleton;


public class Singleton {

   
    public static void main(String[] args) {
        
        Patron instanciaUnica = Patron.obtenerInstancia();
        instanciaUnica.saludar();
    }
    
}



