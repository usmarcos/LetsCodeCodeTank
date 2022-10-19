package aula03;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        System.out.println("Primeira solução.");

        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[99];
        int vetorInvertido[] = new int[99];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            int valor = sc.nextInt();
            if (valor != 0) {
                vetor[i] = valor;
            } else {
                int controladorVetor = i - 1;
                for (int j = 0; j <= i; j++) {
                    if (controladorVetor >= 0) {
                        vetorInvertido[j] = vetor[controladorVetor];
                        System.out.print("Vetor invertido ["+j+"] = "+ vetorInvertido[j]+" \n");
                    }else {
                        break;
                    }
                    controladorVetor--;
                }
                break;
            }
        }

        System.out.println("Segunda solução.");
        //solução curso
        final int MAX = 100;
        int[] numeros = new int[MAX];
        int controle = 0;
        int n = -1;

        do {
            System.out.println("Digite o número: ");
            n = sc.nextInt();
            if (n == 0) break;
            numeros[controle] = n;
            controle++;
        } while (controle < MAX);

        sc.close();
    }
}