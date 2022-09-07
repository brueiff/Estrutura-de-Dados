package Listas;

import java.util.Scanner;

public class Lista {

    Scanner leia = new Scanner(System.in);
    int[] valores;
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

    public void vazia() {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 0) {
                System.out.println("Posição livre: " + i);
            }
        }
    }

    public void listar() {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 0) {
                System.out.println(valores[i]);
            }
        }
    }

    public int listarUm(int valor) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor) {
                System.out.println("Posição: " + i + " Valor: " + valores[i]);
            }
        }
        return -1;
    }
}
