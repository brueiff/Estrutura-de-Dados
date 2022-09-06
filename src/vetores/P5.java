package vetores;

import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        int certa, soma, cont1, alunos;
        int cont = 0;
        Scanner leia = new Scanner(System.in);
        int[] G = new int[20];
        int[] R = new int[20];
        soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a resposta da questao " + i);
            G[i] = leia.nextInt();
        }
        System.out.println("Gabarito Inserido");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("Aluno " + j + " Digite a resposta aqui");
                R[cont] = leia.nextInt();
                if (R[cont] == G[cont]) {
                    soma = soma + 1;
                }
            }
            if (soma >= 6) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno Reprovado");
            }
            soma = 0;
            System.out.println("----------------");
        }
    }
}
