package aula03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class Desafio03 {
    // declarando a cor do console
    public static final String corReset = "\u001B[0m";
    public static final String corVermelha = "\u001B[33m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAM_MAX = 20;
        int vetor[][] = new int[TAM_MAX][TAM_MAX];
        //gerar números randômicos
        Random random = new Random();
        //formatar valores
        NumberFormat formatacao = new DecimalFormat("00");
        //cor

        //imprimindo apenas o número 1 na diagonal da matriz e o restante imprimindo 0
        System.out.println("\n----Apenas o número 1 na diagonal da matriz e o restante imprimindo 0");
        for (int i = 0; i < TAM_MAX; i++) {
            for (int j = 0; j < TAM_MAX; j++) {
                if (i == j) {
                    System.out.print((vetor[i][j] = 1) + "  ");
                } else {
                    System.out.print((vetor[i][j] = 0) + "  ");
                }
            }
            System.out.print("\n");
        }
        //imprimindo a matriz acima com a cor para diferenciar
        //imprimindo apenas o número 1 na diagonal da matriz e o restante imprimindo 0
        System.out.println("\n----Apenas o número 1 na diagonal (em cor de destaque) da matriz e o restante imprimindo 0");
        for (int i = 0; i < TAM_MAX; i++) {
            for (int j = 0; j < TAM_MAX; j++) {
                if (i == j) {
                    System.out.print(corVermelha + (vetor[i][j] = 1) + "   " + corReset);
                } else {
                    System.out.print((vetor[i][j] = 0) + "   ");
                }
            }
            System.out.print("\n");
        }

        //setando e imprimindo valores para a matriz
        System.out.println("\n----Setando e imprimindo os valores para uma matriz");
        for (int i = 0; i < TAM_MAX; i++) {
            for (int j = 0; j < TAM_MAX; j++) {
                vetor[i][j] = random.nextInt(20);
                System.out.print(formatacao.format(vetor[i][j]) + " ");
            }
            System.out.print("\n");
        }
        //imprimindo apenas os números na digonal da matriz
        System.out.println("\n----Imprimindo apenas os valores na digonal da matriz");
        for (int i = 0; i < TAM_MAX; i++) {
            for (int j = 0; j < TAM_MAX; j++) {
                if (i == j) {
                    System.out.print(formatacao.format(vetor[i][j]) + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
