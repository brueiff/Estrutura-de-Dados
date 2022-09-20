package ListaLigadaAula;

public class Sistema {

    public static void main(String[] args) {
        No no = new No();
        no.elemento = "Ana";
        no.prox = new No();
        no.prox.elemento = "Bia";
        System.out.println(no + " - " + no.elemento + " - " + no.prox);
        System.out.println(no.prox + " - " + no.prox.elemento + " - " + no.prox.prox);
    }
}
