package aula03;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = {1, 2, 3, 4};
        System.out.println("Digite um número:");
        int k = sc.nextInt();
        //forma um
        for (int i = 0; i < vetor.length; i++) {
            if (k == vetor[i]) {
                System.out.println("Achei o valor " + vetor[i] + " na posição " + i);
                break;
            }
        }
        //forma dois
        boolean achou = false;
        int posicaoEncontrada = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (k == vetor[i]) {
                achou = true;
                posicaoEncontrada = i;
                break;
            }
        }
        if (achou == true) {
            System.out.println("Achei o valor " + k + " na posição " + posicaoEncontrada);
        } else {
            System.out.println("Não encontrei");
        }

    }
}
