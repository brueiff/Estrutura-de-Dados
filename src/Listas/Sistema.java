package Listas;

public class Sistema {

    public static void main(String[] args) {
        Lista lista = new Lista(5);
        lista.Insere(10, 3);
        lista.Insere(20, 3);
        lista.Insere(30, 0);
        lista.Insere(40, 4);
        lista.RemovePos(3);
        lista.RemovePos(0);
        lista.atualizaPos(0);
        lista.listar();
    }
}
