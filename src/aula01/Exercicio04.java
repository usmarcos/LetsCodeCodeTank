package aula01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        //variaveis
        double numeroUm = 0;
        double numeroDois = 0;
        //telcado
        Scanner teclado = new Scanner (System.in);
        //sistema
        System.out.println("Bem-vindo, sera exibido os numeros em ordem.");
        System.out.println("Informe o primeiro numero:");
        numeroUm = teclado.nextDouble();
        System.out.println("Informe o segundo numero:");
        numeroDois = teclado.nextDouble();
        System.out.println("Os numeros digitados em ordem crescente sao:");
        //logica
        if (numeroUm > numeroDois) {
            System.out.println(numeroDois + ", " +numeroUm+".");
        }else {
            //se numero dois maior que o um ou se os valores forem iguais.
            System.out.println(numeroUm+", "+numeroDois+".");
        }
        teclado.close();
    }
}