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
        System.out.println("-----Calculo do salario medio-----");
        System.out.println("Informe o salario mensal: ");
        salario = sc.nextFloat();
        System.out.println("Informe a quantidade de meses trabalhados: ");
        meses = sc.nextInt();
        while (opcao != 1 && opcao != 2) {
            System.out.println("Recebeu decimo terceiro?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    media = ((meses + 1) * salario) / 12;
                    System.out.printf("Sua media salarial foi de %.2f:", media);
                    break;
                }
                case 2: {
                    media = (meses * salario) / 12;
                    System.out.printf("Sua media salarial foi de %.2f:", media);
                    break;
                }
                default:
                    System.out.println("Opcao invalida, favor selecione uma opaco valida.");
                    break;
            }
        }
    }

}
