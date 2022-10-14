package aula01;

import java.util.Scanner;

public class Exercicio06 {

    public void calculoSalarioMedio(Scanner sc) {
        // variaveis
        float salario = 0;
        float media = 0;
        int meses = 0;
        int opcao = 0;
        // l�gica
        System.out.println("-----C�lculo do sal�rio m�dio-----");
        System.out.println("Informe o sal�rio mensal: ");
        salario = sc.nextFloat();
        System.out.println("Informe a quantidade de meses trabalhados: ");
        meses = sc.nextInt();
        while (opcao != 1 && opcao != 2) {
            System.out.println("Recebeu d�cimo terceiro?");
            System.out.println("1 - Sim");
            System.out.println("2 - N�o");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    media = ((meses + 1) * salario) / 12;
                    System.out.printf("Sua m�dia salarial foi de %.2f:", media);
                    break;
                }
                case 2: {
                    media = (meses * salario) / 12;
                    System.out.printf("Sua m�dia salarial foi de %.2f:", media);
                    break;
                }
                default:
                    System.out.println("Op��o inv�lida, favor selecione uma op��o v�lida.");
                    break;
            }
        }
    }

}
