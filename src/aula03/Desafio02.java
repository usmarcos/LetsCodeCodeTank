package aula03;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        final int MAX = 100;
        System.out.println("Primeira solução.");

        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[MAX];
        int vetorInvertido[] = new int[MAX];

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
                        System.out.print("Vetor invertido [" + j + "] = " + vetorInvertido[j] + " \n");
                    } else {
                        break;
                    }
                    controladorVetor--;
                }
                break;
            }
        }
    }
}