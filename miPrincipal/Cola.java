package miPrincipal;

public class Cola <T>{
    //Atributo cabeza que apunta al primer elemento de la cola 
    private Nodo<T> cabeza;
    //Atributo cola, que apunta al ultimo elemanto de la cola
    private Nodo<T> cola;
    //Almacena el total de elementos de la cola 
    private int tamanio;
    //Constructor defecto
    public Cola(){
        cabeza=null;
        cola=null;
        tamanio=0;
    }
    //Devuelva el total de elementos de la cola
    public int getTamanio(){
        return tamanio;

    } 
    //verificar si la cola esta vacia 
    public boolean esVacia(){
        return(cabeza==null);
    }
    //Encolar un elemento nuevo
    public void encolar(T valor){
        //crear un nuevo nodo
        Nodo<T>nuevo= new Nodo<T>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //cabeza y cola apuntan al nodo
            cabeza=nuevo;
            cola=nuevo;
        }else{
            //se enlazan el campo siguiente de la cola con el nuevo elemento
            cola.setSiguiente(nuevo);
            //la nueva cola pasa a ser nuevo
            cola=nuevo;

        }
        //incremento el tamanio porque hay un nuevo elemento de la cola
        tamanio++;
    }
    //Eliminar el primer elemento de la cola 
    public void desencolar(){
        //si no esta vacia
        if(!esVacia()){
            //verificar si hay un solo elemento en la cola 
            if(cabeza==cola){
                cabeza=null;
                cola=null;
            }else{
                //se elimina el primer elementoi de la cola
                //desplazando la cabeza al siguiente nodo
                cabeza=cabeza.getSiguiente();

            }
            //se disminuye el total de elementos
            tamanio--;
        }
    }
    //devuelve el primer elemento de la cola 
    public T frente(){
        if(!esVacia()){
            return cabeza.getValor();

        }else{
            return null;
        }
    }
 
}
