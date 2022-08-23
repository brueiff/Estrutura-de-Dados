package vetores;

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numero = new int[20];
        int count = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o numero" + (i + 1) + " /20");
            numero[i] = leia.nextInt();
            if (numero[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println("Ha" + count + "Numeros Pares.");
    }
}
