package aula01;

import java.util.Scanner;

public class Exercicio08 {
    public void calculaTercoFerias(Scanner sc) {
        float percentual = 0.33f;
        float salario = 0f;
        float ferias = 0f;
        // sistema
        System.out.println("-----C�lculo do ter�o de f�rias-----");
        System.out.println("Informe o sal�rio mensal do empregado: ");
        salario = sc.nextFloat();
        // calculo
        ferias = salario * percentual;
        // sa�da
        System.out.printf("O valor do ter�o de f�rias �: R$ %.2f", ferias);
    }
}
