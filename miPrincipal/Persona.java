package miPrincipal;

public class Persona {
    private String nombre;
    private int edad;
    private String Nacionaliad;
    public Persona(String nombre, int edad, String nacionaliad) {
        this.nombre = nombre;
        this.edad = edad;
        Nacionaliad = nacionaliad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNacionaliad() {
        return Nacionaliad;
    }
    public void setNacionaliad(String nacionaliad) {
        Nacionaliad = nacionaliad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", Nacionaliad=" + Nacionaliad + "]";
    }

    
    
    


    
}
