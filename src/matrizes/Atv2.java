package matrizes;

public class Atv2 {
    public static void main(String[] args) {
        int[][] M = new int[6][6];
        int A = 1;
        int[] vetor = new int[36];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                vetor[i] = M[i][j] * A;
            }
        }
    }
}
