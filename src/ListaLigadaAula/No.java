package ListaLigadaAula;

public class No {

    private String elemento;
    private No prox;

    public No(String novo) {
        elemento = novo;
        prox = null;
    }

    public No(String novo, No no) {
        elemento = novo;
        prox = no;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}
