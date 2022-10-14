package aula01;

import java.util.Scanner;

public class Exercicio09 {

    public void calculaSalarioLiquido(Scanner sc) {
        // variaveis
        float salario = 0;
        float media = 0;
        int meses = 0;
        int opcao = 0;
        float inss = 0f;
        float aliquotaInss = 0.075f;
        float ferias = 0f;
        float percentual = 0.33f;
        float salarioLiquido = 0f;
        // l�gica
        System.out.println("-----C�lculo do salar�o l�quido anual-----");
        System.out.println("Informe o sal�rio mensal: ");
        salario = sc.nextFloat();
        System.out.println("Informe a quantidade de meses trabalhados: ");
        meses = sc.nextInt();
        //calcular sal�rio mensal com ou sem d�cimo
        while (opcao != 1 && opcao != 2) {
            System.out.println("Recebeu d�cimo terceiro?");
            System.out.println("1 - Sim");
            System.out.println("2 - N�o");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    media = ((meses + 1) * salario) / 12;
                    break;
                }
                case 2: {
                    media = (meses * salario) / 12;
                    break;
                }
                default:
                    System.out.println("Valor incorreto, favor escolha uma das op��es.");
                    break;
            }
        }
        //calculo inss
        inss = media * aliquotaInss;
        //calculo ter�o de f�rias
        ferias = salario * percentual;
        //calculo sal�rio l�quido anual
        salarioLiquido = (media+ferias) - inss;
        //sa�da
        System.out.printf("O sal�rio l�quido do empregado �: R$ %.2f", salarioLiquido);

    }
}