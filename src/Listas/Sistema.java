package Listas;

public class Sistema {

    public static void main(String[] args) {
        Lista lista = new Lista(10);
        lista.Insere(1, 0);
        lista.Insere(2, 1);
        System.out.println(lista.valores[1]);
    }
}
