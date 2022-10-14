package aula01;

import java.util.Scanner;

public class Exercicio05 {

    public  void calculoAumentoSalarial(Scanner sc) {
        System.out.println("-----C�lculo de aumento salarial-----");
        // vari�ves
        double salarioTec = 1.5;
        double salarioGer = 1.3;
        double salarioDem = 1.2;
        double novoSalarioTec = 0;
        double novoSalarioGer = 0;
        double novoSalarioDem = 0;
        int opcao = 0;
        // logica
        while (opcao != 4) {
            System.out.println("\nSelecione o cargo do empregado:\nDigite o n�mero correspondente.");
            System.out.println("1 - T�cnico");
            System.out.println("2 - Gerente");
            System.out.println("3 - Demais");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o sal�rio do empregado:");
                    novoSalarioTec = sc.nextDouble();
                    novoSalarioTec = novoSalarioTec * salarioTec;
                    System.out.println("O novo salario do t�cnico �:" + novoSalarioTec);
                    break;
                case 2:
                    System.out.println("Informe o sal�rio do empregado:");
                    novoSalarioGer = sc.nextDouble();
                    novoSalarioGer = novoSalarioGer * salarioGer;
                    System.out.println("O novo salario do gerente �:" + novoSalarioGer);
                    break;
                case 3:
                    System.out.println("Informe o sal�rio do empregado:");
                    novoSalarioDem = sc.nextDouble();
                    novoSalarioDem = novoSalarioDem * salarioDem;
                    System.out.println("O novo salario dos demais �:" + novoSalarioDem);
                    break;
                case 4:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    System.out.println("Valor incorreto, escolha uma op��o novamente.");
                    break;
            }
        }
    }
}