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

    public int Insere2(int valor, int pos) {
        if (pos < 0 || pos >= valores.length || valores[pos] == 0) {
            return -1;
        } else {
            valores[pos] = valor;
            return valor;
        }
    }

    public int Insere(int valor, int pos) {
        if (pos >= 0 && pos < valores.length && valores[pos] == 0) {
            valores[pos] = valor;
            return valor;
        } else if (pos >= 0 && pos < valores.length && valores[pos] != 0) {
            int pos_vazia = vazia();
            if (pos_vazia != -1) {
                valores[pos_vazia] = valor;
                return valor;
            }
        }
        return -1;
    }

    public int RemovePos(int pos) {
        int valor;
        if (pos >= 0 && pos < valores.length) {
            valor = valores[pos];
            valores[pos] = 0;
            return valor;
        }
        return -1;
    }
//    public int RemoveValor(int valorRemovido) {
//        int valor;
//        if (pos >= 0 && pos < valores.length) {
//            valor = valores[pos];
//            valores[pos] = 0;
//            return valor;
//        }
//        return -1;
//    }

    public int vazia() {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 0) {
                return i;
            }
        }
        return -1;
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

    public int atualizaPos(int valorAtual) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valorAtual) {
                System.out.println("O Valor " + valores[i] + " já existe, deseja substituir?");
                System.out.println("Y[Sim] | N[Não]");
                String A = leia.next();
                if (A.equalsIgnoreCase("y")) {
                    System.out.println("Qual valor deseja inserir no lugar de " + valores[i] + "?");
                    int valorSubstituido = valores[i];
                    valores[i] = leia.nextInt();
                    System.out.println("O valor " + valorSubstituido + " foi substituido por " + valores[i]);
                    break;
                } else {
                    System.out.println("Encerrando...");
                    System.exit(0);
                }
            } else {
                System.out.println("Valor inexistente na lista!");
                System.exit(0);
            }
        }
        return -1;
    }
}
