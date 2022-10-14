package aula01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String args[]) {
        //variaveis
        double numeroUm = 0;
        double numeroDois = 0;
        double numeroTres = 0;
        double maiorNumero = 0;
        //scanner
        Scanner teclado = new Scanner(System.in);
        //obtendo os valores
        System.out.println("Bem-vindo! Ser� apresentado o maior n�mero.");
        System.out.println("Insira o primeiro n�mero:");
        numeroUm = teclado.nextDouble();
        System.out.println("Insira o segundo n�mero:");
        numeroDois = teclado.nextDouble();
        System.out.println("Insira o terceiro n�mero");
        numeroTres = teclado.nextDouble();
        //logica
        if (numeroUm > numeroDois && numeroUm > numeroTres ) {
            maiorNumero = numeroUm;
        }
        if (numeroDois > numeroUm && numeroDois > numeroTres) {
            maiorNumero = numeroDois;
        }
        if (numeroTres > numeroUm && numeroTres > numeroDois) {
            maiorNumero = numeroTres;
        }
        if (numeroUm == numeroDois && numeroUm == numeroTres) {
            maiorNumero = numeroUm;
            System.out.println("Todos os valores s�o iguais: "+maiorNumero);
        }else {
            System.out.println("O maior n�mero �: "+maiorNumero);
        }
        teclado.close();
    }
}