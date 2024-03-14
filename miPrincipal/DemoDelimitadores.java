package miPrincipal;

public class DemoDelimitadores {
    public static void menu(){
        System.out.println("************************");
        System.out.println("     DELIMITADORES      ");
        System.out.println("************************");
        System.out.println();
        Delimitadores objDel = new Delimitadores();
        String expr = "(a+b)/2";
        if(objDel.evaluacion(expr)){
            System.out.println("Expresion correcta");
        }
        else{
            System.out.println("Expresion Inceorrecta");
        }
        

    }
    
}
