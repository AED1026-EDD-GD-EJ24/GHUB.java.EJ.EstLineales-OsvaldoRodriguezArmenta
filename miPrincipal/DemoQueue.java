package miPrincipal;
/*
la api de java tra implementa la cola mediante la interface 
 java.utilQueue, como es una interface se requiere instanciar 
 como un  objeto en concreto, esta interface se puede implementar 
 Con la API collection de java; 
      java.util.LinkedinList
      java.util.PriorityQueue
 Linkedin es una aplicacion de cola estandar 
 PriorityQueue es una cola de prioridades que almacena 
 sus elementos internos de acuerdo a un orden.
 Las operaciones basica de Queue son:

 add().     Inserta un elemento en la cola 
 remove().  devuelve y remueve el primer elemento de la cola
 peek().    devuelve el primer elemento de la cola y devuelve 
                 null cuando la cola esta vacia
 */       

import java.util.Queue; 
import java.util.LinkedList;  
public class DemoQueue {
    public static void menu() {
        System.out.println("============================");
        System.out.println("           QUEUE            ");
        System.out.println("============================");
        System.out.println();
        //Creamos una cola generica
        Queue micola = new LinkedList();
        //Agregamos tres elementos a la cola
        micola.add("elemento 0");
        micola.add("elemento 1");
        micola.add("elemento 2");
        //Muestra tres elementos de la cola en ese orden
        System.out.println("El elemento de la cola es:"+micola.peek());
        //Eliminar el primer elemento de la cola 
        micola.remove();
        //Muestra tres elementos de la cola en ese orden
        System.out.println("El elemento de la cola es:"+micola.peek());
        //Eliminar el primer elemento de la cola 
        micola.remove();
        //Muestra tres elementos de la cola en ese orden
        System.out.println("El elemento de la cola es:"+micola.peek());
        //Eliminar el primer elemento de la cola 
   



        
    }
}
