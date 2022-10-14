package aula01;

import java.util.Scanner;

public class UnificadorDeExercicios {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while(opcao != 99) {
            System.out.println("\n\n-----Unificador de exercícios------");
            System.out.print("Selecione um exercício para executar. ");
            System.out.println("Escolha uma das opções:\n");
            System.out.println(" 5 - Exerício 5 (Cálculo de aumento salarial)");
            System.out.println(" 6 - Exerício 6 (Cálculo do salário médio)");
            System.out.println(" 7 - Exerício 7 (Cálculo do INSS)");
            System.out.println(" 8 - Exerício 8 (Cálculo Terço de Férias)");
            System.out.println(" 9 - Exerício 9 (Cálculo Salário Líquido)");
            System.out.println("99 - Sair");
            System.out.println("------------------------------------");
            opcao = sc.nextInt();
            switch (opcao) {
                case 5:
                    (new Exercicio05()).calculoAumentoSalarial(sc);
                    break;
                case 6:
                    (new Exercicio06()).calculoSalarioMedio(sc);
                    break;
                case 7:
                    (new Exercicio07()).calculaInss(sc);
                    break;
                case 8:
                    (new Exercicio08()).calculaTercoFerias(sc);
                    break;
                case 9:
                    (new Exercicio09()).calculaSalarioLiquido(sc);
                    break;
                case 99:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    System.out.println("Valor incorreto, escolha uma opção novamente.");
            }
        }

        sc.close();
    }
}
