package ImplementacaoListaLigadaPDF;

public class TesteListaLigada {

    public static void main(String[] args) {
        ListaLigadaDinamica l1 = new ListaLigadaDinamica();
        l1.InsereNaFrente("no1");
        l1.InsereNaFrente("no2");
        l1.InsereNoFundo("no3");
        System.out.println(l1.EscreveLista());
        l1.RemoveDaFrente();
        l1.RemoDoFundo();
        System.out.println(l1.EscreveLista());
    }
}
