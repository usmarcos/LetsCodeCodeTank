package TesteFinal;

import java.util.Random;
import java.util.Scanner;

public class QuadradoPerfeito {
    /**
     * Escreva um algoritmo que calcule se o quadrado pode ser considerado como perfeito. Para isso deve ser capturado o tamanho do quadrado a partir de input do usuário.
     */
    public static void main(String[] args) {

        //int[][] matriz = montarEPreencherQuadrado();
        int[][] matriz = {{20, 6, 7, 17},
                {9, 15, 14, 12},
                {13, 11, 10, 16},
                {8, 18, 19, 5}};

        // verifica linhas
        int totalLinha = 0;
        int totalColuna = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int controleDiagonalPrincipal = 0;
        int controleDiagonalSecundaria = matriz.length - 1;


        for (int i = 0; i < matriz.length; i++) {
            //linha e coluna, invertendo i e j para mudar as posições de leitura
            for (int j = 0; j < matriz.length; j++) {
                totalLinha += matriz[j][i];
                totalColuna += matriz[i][j];
                somaDiagonalPrincipal += matriz[controleDiagonalPrincipal][i];
                somaDiagonalSecundaria += matriz[i][controleDiagonalSecundaria];
            }
            controleDiagonalPrincipal++;
            controleDiagonalSecundaria--;
        }

        //verificando se é um quadrado perfeito
        if (totalLinha == totalColuna && somaDiagonalPrincipal == somaDiagonalSecundaria){
            System.out.println("Quadrado perfeito");
        }else{
            System.out.println("Não é um quadrado perfeito");
        }

    }

    public static int[][] montarEPreencherQuadrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do quadrado desejado:");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] colunas = matriz[linha];
            for (int coluna = 0; coluna < colunas.length; coluna++) {
                int valorAleatorio = random.nextInt(1000);
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + valorAleatorio + "]");
            }
            System.out.println();
        }
        return matriz;
    }
}
