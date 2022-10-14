package aula01;

import java.util.Scanner;

public class Exercicio07 {

    public void calculaInss(Scanner sc) {
        float aliquotaInss = 0.075f;
        float salario = 0f;
        float inss = 0f;
        // sistema
        System.out.println("-----C�lculo de INSS-----");
        System.out.println("Informe o sal�rio mensal do empregado: ");
        salario = sc.nextFloat();
        // calculo
        inss = salario * aliquotaInss;
        // sa�da
        System.out.printf("O valor do INSS �: R$: %.2f", inss);
    }
}
