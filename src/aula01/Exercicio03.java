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
        System.out.println("Bem-vindo! Sera apresentado o maior numero.");
        System.out.println("Insira o primeiro numero:");
        numeroUm = teclado.nextDouble();
        System.out.println("Insira o segundo numero:");
        numeroDois = teclado.nextDouble();
        System.out.println("Insira o terceiro numero");
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
            System.out.println("Todos os valores sao iguais: "+maiorNumero);
        }else {
            System.out.println("O maior numero e: "+maiorNumero);
        }
        teclado.close();
    }
}