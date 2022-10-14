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
        System.out.println("Bem-vindo, ser� exibido os n�meros em ordem.");
        System.out.println("Informe o primeiro n�mero:");
        numeroUm = teclado.nextDouble();
        System.out.println("Informe o segundo n�mero:");
        numeroDois = teclado.nextDouble();
        System.out.println("Os n�meros digitados em ordem crescente s�o:");
        //logica
        if (numeroUm > numeroDois) {
            System.out.println(numeroDois + ", " +numeroUm+".");
        }else {
            //se n�mero dois maior que o um ou se os valores forem iguais.
            System.out.println(numeroUm+", "+numeroDois+".");
        }
        teclado.close();
    }
}