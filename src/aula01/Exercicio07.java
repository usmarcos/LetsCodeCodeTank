package aula01;

import java.util.Scanner;

public class Exercicio07 {

    public void calculaInss(Scanner sc) {
        float aliquotaInss = 0.075f;
        float salario = 0f;
        float inss = 0f;
        // sistema
        System.out.println("-----Calculo de INSS-----");
        System.out.println("Informe o salario mensal do empregado: ");
        salario = sc.nextFloat();
        // calculo
        inss = salario * aliquotaInss;
        // saida
        System.out.printf("O valor do INSS e: R$: %.2f", inss);
    }
}
