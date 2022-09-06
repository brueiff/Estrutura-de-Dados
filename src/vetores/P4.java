package vetores;

import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] v1 = new int[30];
        int[] v2 = new int[30];
        for (int i = 0; i < 30; i++) {
            System.out.println("Digite o número" + (i + 1) + " /30");
            v1[i] = leia.nextInt();
            v2[i] = v1[i];
            if (v1[i] == 0) {
                v2[i] = 1;
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("Vetor na 1° posição " + i + ": " + v1[i] + " | Vetor na 2° posição " + i + ": " + v2[i]);
        }
    }
}
