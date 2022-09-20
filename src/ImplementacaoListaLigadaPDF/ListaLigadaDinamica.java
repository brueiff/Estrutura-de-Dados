package ImplementacaoListaLigadaPDF;

public class ListaLigadaDinamica {

    private No primeiro;
    private No ultimo;
    private String nomeDaLista;

    public ListaLigadaDinamica(String nome) {
        nomeDaLista = nome;
        primeiro = ultimo = null;
    }

    public ListaLigadaDinamica() {
        nomeDaLista = "Lista teste";
        primeiro = ultimo = null;
    }

    public void InsereNaFrente(String item) {

        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            primeiro = new No(item, primeiro);
        }
    }

    public void InsereNoFundo(String item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            ultimo.setProx(new No(item));
            ultimo = ultimo.getProx();
        }
    }

    public String RemoveDaFrente() {
        if (Vazia()) {
            return null;
        }
        String item = primeiro.getDado();
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            primeiro.getProx();
        }
        return item;
    }

    public String RemoDoFundo() {
        if (Vazia()) {
            return null;
        }
        String item = ultimo.getDado();
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            No atual = primeiro;
            while (atual.getProx() != ultimo) {
                atual = atual.getProx();
            }
            ultimo = atual;
            atual.setProx(null);
        }
        return item;
    }

    public boolean Vazia() {
        return primeiro == null;
    }

    public String EscreveLista() {
        String temp = "";
        if (Vazia()) {
            temp += "Vazia " + nomeDaLista;
            return temp;
        }
        temp += "A " + nomeDaLista + " contem \n\n";
        No atual = primeiro;
        while (atual != null) {
            temp += atual.getDado() + ", ";
            atual = atual.getProx();
        }
        temp += "\n";
        return temp;
    }

    public String exibePrimeiro() {
        if (primeiro == null) {
            return "Primeiro: null";
        } else {
            return "Primeiro: " + primeiro.getDado();
        }
    }

    public String exibeUlt() {
        if (ultimo == null) {
            return "Ultimo: null";
        } else {
            return "Ultimo: " + ultimo.getDado();
        }
    }
}
