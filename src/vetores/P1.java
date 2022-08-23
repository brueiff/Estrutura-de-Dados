package vetores;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] S = new int[20];
        int A;
        System.out.println("Informe um Valor: ");
        A = leia.nextInt();
        for (int i = 0; i < 20; i++) {
            S[i] = i;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(S[i] + "*" + A + "=" + S[i] * A);
        }
    }
}
