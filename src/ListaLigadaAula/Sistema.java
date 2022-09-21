package ListaLigadaAula;

public class Sistema {

    public static void main(String[] args) {
        No no = new No("maria");
        no.setProx(new No("Ana"));
        System.out.println("Elemento: " + no.getElemento());
        System.out.println("Próximo: " + no.getProx());
        System.out.println("Elemento: " + no.getProx().getElemento());
        System.out.println("Próximo: " + no.getProx().getProx());
    }
}
