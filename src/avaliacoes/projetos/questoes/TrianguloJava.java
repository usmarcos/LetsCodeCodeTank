package avaliacoes.projetos.questoes;

import java.util.Scanner;

public class TrianguloJava {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double quantidadeLinha = 0;
        System.out.println("-----Desenho de retângulo (um ângulo reto)-----");
        do {
            System.out.println("\nInforme uma quantidade de linhas para definir o tamanho do retângulo: ");
            quantidadeLinha = sc.nextDouble();
            if (quantidadeLinha <= 1)
                System.out.println("Para renderizar o triângulo é necessário que o valor seja maior que 1.");
        } while (quantidadeLinha <= 1);
        //desenha triangulo
        new TrianguloJava().desenhaTrinagulo(quantidadeLinha);
        new TrianguloJava().desenhaTrinaguloRepeat(quantidadeLinha);
    }

    public void desenhaTrinagulo(double qLinha) {
        for (qLinha = qLinha; qLinha > 0; qLinha--) {
            for (double y = qLinha; y > 0; y--) System.out.print("*");
            System.out.println();
        }
    }
    public void desenhaTrinaguloRepeat(double qLinha) {
        for (double i = qLinha; i > 0; i--) {
            //System.out.print("*".repeat(i));
            System.out.println();
        }
    }
}
