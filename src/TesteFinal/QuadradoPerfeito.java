package TesteFinal;

import java.util.Random;
import java.util.Scanner;

public class QuadradoPerfeito {
    /**
     * Escreva um algoritmo que calcule se o quadrado pode ser considerado como perfeito. Para isso deve ser capturado o tamanho do quadrado a partir de input do usuário.
     */
    public static void main(String[] args) {
        int[][] matriz = montarEPreencherQuadrado();
        //validação do quadrado perfeito
        boolean quadradoPerfeito = true;
        //percorrer matriz
        for (int i = 0; i < matriz.length; i++) {
            //variáveis para armanezar somatório e os valores de cada linha e coluna
            int totalLinha = 0;
            int totalColuna = 0;
            int linha = 0;
            int coluna = 0;
            //realizando somatório de linhas e colunas para posteriormente comparar se são iguais ou diferentes
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0) {
                    linha = linha + matriz[i][j];
                    coluna = coluna + matriz[j][i];
                }
                totalLinha = totalLinha + matriz[i][j];
                totalColuna = totalColuna + matriz[j][i];
            }
            //condições para alterar o controle e validar a matriz
            if (linha != coluna
                    || totalColuna != coluna
                    || totalLinha != totalColuna
                    || totalLinha != linha) {
                quadradoPerfeito = false;
            }
        }
        //verificando se é um quadrado perfeito
        if (quadradoPerfeito) {
            System.out.println("Quadrado perfeito");
        } else {
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
                int valorAleatorio = random.nextInt(0, 1000);
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + valorAleatorio + "]");
            }
            System.out.println();
        }
        return matriz;
    }
}
