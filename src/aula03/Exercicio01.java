package aula03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] notas = new float[10];
        //melhorias
        float[] codigos = new float[]{1, 3, 5, 4, 7};
        char[] letras = new char[]{'a', 'b', 'c'};

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = scan.nextFloat();
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        scan.close();
    }
}