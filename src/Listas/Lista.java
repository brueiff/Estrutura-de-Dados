package Listas;

import java.util.Scanner;

public class Lista {

    Scanner leia = new Scanner(System.in);
    private int[] valores;
    private int tamanho;

    public Lista(int tam) {
        if (tam > 0) {
            tamanho = tam;
            valores = new int[tam];
        }
    }

    public int Insere(int valor, int pos) {
        if (pos >= 0 && pos < valores.length) {
            valores[pos] = valor;
            return valor;
        }
        return -1;
    }

    public int Remove(int pos) {
        int valor;
        if (pos > 0 && pos < valores.length) {
            valor = valores[pos];
            valores[pos] = 0;
            return valor;
        }
        return -1;
    }
}
