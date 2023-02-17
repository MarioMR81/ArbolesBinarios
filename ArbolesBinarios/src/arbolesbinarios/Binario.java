
package arbolesbinarios;

public class Binario {
    NodoArbol inicial;
    public Binario (){
        this.inicial=null;
    }
    public void insertar(int valor){
        if(this.inicial == null){
            this.inicial=new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }
    public void Preorden(){
        this.Pre(this.inicial);
    }
    public void Pre(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            System.out.println(nodo.getValor()+ ", ");
            Pre(nodo.getNodoDerecho());
            Pre(nodo.getNodoIzq());
        }
    }
    public void Inorden(){
        this.Ino(this.inicial);
    }
    public void Ino(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            Ino(nodo.getNodoIzq());
            System.out.println(nodo.getValor()+ ", ");
            Ino(nodo.getNodoDerecho());
        }
    }
    public void PostOrden(){
        this.Post(this.inicial);
    }
    public void Post(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            Post(nodo.getNodoIzq());
            Post(nodo.getNodoDerecho());
            System.out.println(nodo.getValor()+ ", ");
        }
    }
}
