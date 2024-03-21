package miPrincipal;
import java.util.Enumeration;
import java.util.Hashtable;
public class DemoTablaDispersion {
    public static void menu(){
        System.out.println("==========================================");
        System.out.println("           TABLA DE DISPERSION            ");
        System.out.println("==========================================");
        System.err.println();
        //Instanciamos varia personas
        Persona p1 = new Persona("Pablo",23,"Argentino");
        Persona p2 = new Persona("Juan",23,"Mexicano");
        Persona p3 = new Persona("Pedro",23,"Espaniol");
        //Creo la tabla hash
        Hashtable<String, Persona> tabla = new Hashtable<String, Persona>();

        //Agregamos a las personas tomando su nombre como clave
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);
        //Acceso a cada uno de los elementos de la tabla por su clave
        System.out.println(tabla.get(" Pablo"));
        System.out.println(tabla.get(" Juan"));
        System.out.println(tabla.get(" Pedro"));
        System.out.println();
        
        

        //En este caso regresa un null ya que no hay ningun objeto 
        //asociado a la clave Rolando
        System.out.println(tabla.get("Rolando"));

        /*
         * Obtengo una enumeracion de las claves existentes en la tabla 
         * se recorre y por cada una se accede al elemento asociado para mostrar
         * "clave-valor"
         */

         String aux;
         Enumeration<String> keys = tabla.keys();
         while (keys.hasMoreElements())
         {
            aux=keys.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));
         }
    }

    
}
