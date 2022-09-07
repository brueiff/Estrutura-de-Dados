package Listas;

public class Sistema {

    public static void main(String[] args) {
        Lista lista = new Lista(10);
        lista.Insere(1, 0);
        lista.Insere(2, 1);
        lista.Insere(3, 2);
        lista.Insere(50, 8);
        lista.listar();
        lista.vazia();
        lista.listarUm(3);
    }
}
