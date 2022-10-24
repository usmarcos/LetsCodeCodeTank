package TesteFinal;

import java.util.Scanner;

public class Piramide {
    /**
     * Escreva um algoritmo para desenhar uma pirâmide utilizando o print.
     * A pirâmide deve ter o tamanho definido pelo usuário através de um input de dados(Scanner).
     */

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double qLinha = 0;
        System.out.println("-----Desenho de pirâmide-----");
        do {
            System.out.println("\nInforme o tamanho da pirâmide: ");
            qLinha = sc.nextDouble();
            if (qLinha <= 1)
                System.out.println("Para renderizar a pirâmide é necessário que o valor seja maior que 1.");
        } while (qLinha <= 1);
        //desenha triangulo
        new Piramide().desenhaTrinagulo(qLinha);
    }

    public void desenhaTrinagulo(double qLinha) {

        for (double i = 0; i < qLinha; i++) {
            for (double j = qLinha-i; j > 1; j--) {
                System.out.print("-");
            }
            for (double k = -2; k <= (i*2)-2; k++) {
                System.out.print("#");
            }
            for (double j = qLinha-i; j > 1; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}