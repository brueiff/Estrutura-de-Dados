package ImplementacaoListaLigadaPDF;

public class No {

    private String dado;
    private No prox;

    public No(String dadoNovo) {
        dado = dadoNovo;
        prox = null;
    }

    public No(String dadoNovo, No ligacao) {
        dado = dadoNovo;
        prox = ligacao;
    }

    public String getDado() {
        return this.dado;
    }

    public No getProx() {
        return this.prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}
