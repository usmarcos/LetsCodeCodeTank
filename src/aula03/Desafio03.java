package aula03;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAM_MAX = 20;
        int vetor [][] = new int [TAM_MAX][TAM_MAX];
        int vetorPadrao[] = new int [TAM_MAX];
        //criar um vetor

        for (int i =0; i <= TAM_MAX; i++){

            for (int j =0; j <= TAM_MAX; j++){
                System.out.print(vetor[i][j] + "");
            }
        }
    }
}
