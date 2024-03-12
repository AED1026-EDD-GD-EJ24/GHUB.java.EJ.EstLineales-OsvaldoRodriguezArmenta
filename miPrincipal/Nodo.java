package miPrincipal;
public class Nodo<T>{
    //Atributo valor tipot. Almacena la referencia al objeto que se guarda en el nodo
    private  T valor;
    //Referencia al siguiennte Nodo Enlazado
    private Nodo<T> siguiente;
    //Constructor por defecto
    public Nodo(){
        valor= null;
        siguiente = null;

    }
    //Devuelve el Valor
    public T getValor(){
        return valor;
    }
    //Modifica el valor 
    public void setValor(T valor){
        this.valor=valor;

    }
    //Devuelve el Atributo Siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;

    }
    //Modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente =siguiente;

    }
    

    
}
