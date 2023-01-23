package TesteFinal;

import java.util.Random;
import java.util.Scanner;

public class QuadradoPerfeito {
    /**
     * Escreva um algoritmo que calcule se o quadrado pode ser considerado como perfeito. Para isso deve ser capturado o tamanho do quadrado a partir de input do usuário.
     */
    public static void main(String[] args) {

        int[][] matriz = montarEPreencherQuadrado();

//teste
//        int[][] matriz = {{20, 6, 7, 17},
//                {9, 15, 14, 12},
//                {13, 11, 10, 16},
//                {8, 18, 19, 5}};
//
//        int[][] matriz = {{2, 7, 6},
//                {9, 5, 1},
//                {4, 3, 8}};


        verificaQuadradoPerfeito(matriz);
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

    private static void verificaQuadradoPerfeito(int[][] matriz) {
        // verifica linhas
        int somaEsperada = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        boolean controle = true;

        for (int i = 0; i < matriz.length; i++) {
            somaEsperada += matriz[0][i];
        }

        for (int i = 0; i < matriz.length; i++) {
            int totalLinha = 0;
            int totalColuna = 0;
            //linha e coluna, invertendo i e j para mudar as posições de leitura
            for (int j = 0; j < matriz.length; j++) {
                totalLinha += matriz[i][j];
                totalColuna += matriz[j][i];
                if (i == j) {
                    somaDiagonalPrincipal += matriz[j][i];
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
            if (totalLinha != somaEsperada && totalColuna != somaEsperada) {
                controle = false;
                break;
            }
        }
        //verificando se é um quadrado perfeito
        if (controle && somaDiagonalPrincipal == somaEsperada && somaDiagonalSecundaria == somaEsperada) {
            System.out.println("Quadrado perfeito");
        } else {
            System.out.println("Não é um quadrado perfeito");

        }
    }
}
