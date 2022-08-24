package matrizes;

import java.util.Scanner;

public class matrizEx {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int mat[][] = new int[3][3];
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Informe o elemento da " + (l + 1) + " Linha e da " + (c + 1) + " da coluna");
                mat[l][c] = leia.nextInt();
            }
        }
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Linha " + (l + 1) + " Coluna " + (c + 1) + ":" + mat[l][c]);
            }
        }
    }
}
