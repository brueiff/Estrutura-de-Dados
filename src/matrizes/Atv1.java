
package matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Atv1 {

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("[");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" " + Arrays.toString(matriz[i]));
        }
        System.out.println("]");
    }

    public static void letMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(String.format("[%d, %d]: ", i + 1, j + 1));
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int[][] M = new int[4][6];
        int[][] N = new int[4][6];

        System.out.println("Lendo matriz M");
        letMatriz(M);
        System.out.println("Lendo matriz N");
        letMatriz(N);

        int[][] produto = new int[4][6];
        int[][] soma = new int[4][6];
        int[][] diferenca = new int[4][6];
        int[][] divisao = new int[4][6];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                produto[i][j] = M[i][j] * N[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                soma[i][j] = M[i][j] + N[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                diferenca[i][j] = M[i][j] - N[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                divisao[i][j] = M[i][j] / N[i][j];
            }
        }

        System.out.println("PRODUTO");
        mostrarMatriz(produto);
        System.out.println("SOMA");
        mostrarMatriz(soma);
        System.out.println("DIFERENCA");
        mostrarMatriz(diferenca);
        System.out.println("DIVISAO");
        mostrarMatriz(divisao);
    }
}
