
package arbolesbinarios;

public class Main {
    public static void main(String[] args){
        Binario arbol=new Binario();
        arbol.insertar(50);
        arbol.insertar(69);
        arbol.insertar(9);
        arbol.insertar(64);
        arbol.insertar(20);
        arbol.insertar(35);
        arbol.insertar(41);
        System.out.println("Inorden: " );
        arbol.Inorden();
        System.out.println("PostOrden: " );
        arbol.PostOrden();
        System.out.println("PreOrden: " );
        arbol.Preorden();
    }
}
