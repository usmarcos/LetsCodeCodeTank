package aula01;

import java.util.Scanner;

public class Exercicio08 {
    public void calculaTercoFerias(Scanner sc) {
        float percentual = 0.33f;
        float salario = 0f;
        float ferias = 0f;
        // sistema
        System.out.println("-----Calculo do terco de ferias-----");
        System.out.println("Informe o salario mensal do empregado: ");
        salario = sc.nextFloat();
        // calculo
        ferias = salario * percentual;
        // saida
        System.out.printf("O valor do terco de ferias e: R$ %.2f", ferias);
    }
}
