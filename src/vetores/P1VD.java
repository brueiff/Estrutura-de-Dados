import java.util.Scanner;

/**
 *
 * @author Víctor Douglas
 */
public class P1VD {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] matricula = new int[50];
        double[][] nota = new double[50][2];
        int ultimoCad = 0;
        double maiorNota = 0;
        double menorNota = 10;
        int maiorNotaMatricula = 0;
        int menorNotaMatricula = 0;
        double[] media = new double[50];
        double mediaGeral = 0;

//Registro da MATRÍCULA
        System.out.println("REGISTRO DE MATRICULAS E NOTAS");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 50; i++) {
            System.out.print("Matricula: ");
            matricula[i] = leia.nextInt();
//Teste MATRICULA POSITIVA
            if (matricula[i] > 0) {
//Passagem das NOTAS              
                for (int j = 0; j < 2; j++) {
                    System.out.print((j + 1) + "a nota: ");
                    nota[i][j] = leia.nextInt();
//Teste de NOTA VÁLIDA                   
                    if (nota[i][j] < 0 || nota[i][j] > 10) {
                        System.out.println("Nota Invalida");
                        j = j - 1;
                    }
                }
            } //Caso MATRÍCULA INVÁLIDA            
            else {
                ultimoCad = i;
                System.out.println("Encerrado!!!");
                i = 50;
            }
            System.out.println("");

        }
//Impressão MATRÍCULA e MÉDIA 
        System.out.println("");
        System.out.println("MEDIAS");
        System.out.println("________________________________________________");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < ultimoCad; i++) {
            System.out.println("Matricula: " + matricula[i]);
//MAIOR e MENOR média            
            media[i] = (nota[i][0] + nota[i][1]) / 2;
            mediaGeral = mediaGeral + media[i];
            System.out.println("Media :" + media[i]);
//          Maior Nota
            if (maiorNota <= media[i]) {
                maiorNotaMatricula = matricula[i];
                maiorNota = media[i];
            }
            if (menorNota >= media[i]) {
                menorNotaMatricula = matricula[i];
                menorNota = media[i];
            }

            System.out.println("");
        }

        if (ultimoCad > 0) {
            System.out.println("");
            System.out.println("SITUACAO TURMA");
            System.out.println("________________________________________________");
            System.out.println("");
            System.out.println("");
            System.out.println("Matricula com Maior Media: " + maiorNotaMatricula);
            System.out.println("Nota :" + maiorNota);
            System.out.println("Matricula com Menor Media: " + menorNotaMatricula);
            System.out.println("Nota :" + menorNota);
            System.out.println("Media Geral: " + (mediaGeral / ultimoCad));
            System.out.println("");

            System.out.println("SITUACAO INDIVIDUAL");
            System.out.println("________________________________________________");
            System.out.println("");
            System.out.println("");
            for (int i = 0; i < ultimoCad; i++) {
                System.out.println("Matricula: " + matricula[i]);
                if (media[i] >= 7) {
                    System.out.println("Situacao: APROVADO");
                } else {
                    System.out.println("Situacao: REPROVADO");
                }
                System.out.println("");
		System.out.println("powered by: Víctor Douglas");


            }
        }

    }
}