package matrizes;

import java.util.Scanner;

public class matricula {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] aluno = new int[55];
        int[] nota = new int[50];
        for (int i = 1; i < 3; i++) {
            System.out.println(i + " Matrícula do Aluno: ");
            aluno[i] = leia.nextInt();
            if (aluno[i] > 0) {
                for (int b = 0; b < 2; b++) {
                    System.out.println("Nota do Aluno: ");
                    int NDA = nota[b] = leia.nextInt();
                    if (NDA >= 0 && NDA <= 10) {
                        System.out.println("Nota válida");
                    } else {
                        System.out.println("Nota inválida");
                    }
                }
            } else {
                System.out.println("Não é permitido matrículas negativas!");
            }
        }

    }
}
