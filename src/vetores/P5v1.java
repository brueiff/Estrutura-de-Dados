package vetores;

import java.util.Scanner;

public class P5v1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] g = new String[5];
        String[] aluno = new String[2];
        String[][] r = new String[5][5];
        int[] cont = new int[2];
        String[] situacao = new String[2];
        g[0] = "a";
        g[1] = "b";
        g[2] = "c";
        g[3] = "d";
        g[4] = "e";
        for (int i = 0; i < 2; i++) {
            System.out.print("Nome do Aluno: ");
            aluno[i] = leia.next();
            System.out.println("------------------------------------");
            System.out.println("Gabarito do aluno");
            for (int j = 0; j < 5; j++) {
                System.out.print((j + 1) + "ª: ");
                r[i][j] = leia.next();
            }
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
            System.out.println("");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (g[j].equals(r[i][j])) {
                    cont[i] = cont[i] + 2;
                }
            }

        }
        for (int i = 0; i < 2; i++) {
            if (cont[i] >= 6) {
                situacao[i] = "APROVADO";
            } else {
                situacao[i] = "REPROVADO";
            }
            System.out.println("Nome do Aluno: " + aluno[i]);
            System.out.println("Nota Final: " + cont[i]);
            System.out.println("Situação Final: " + situacao[i]);
            System.out.println("------------------------------------");
        }
    }
}
