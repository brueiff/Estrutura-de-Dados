package vetores;

public class P2 {

    public static void main(String[] args) {
        int[] F = new int[20];
        int[] G = new int[20];
        for (int i = 0; i < 20; i++) {
            F[i] = i;
            G[i] = i;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(F[i] + "*" + G[i] + "=" + F[i] * G[i]);
        }
    }
}
