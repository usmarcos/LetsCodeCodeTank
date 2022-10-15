package aula01;

import java.util.Scanner;

public class ExercícioCoordenadas {
    //leitor
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        System.out.println("Setor de coordenadas:");
        do {
            System.out.println("Informe o valor do eixo x: ");
            int x = sc.nextInt();
            System.out.println("Informe o valor do eixo y: ");
            int y = sc.nextInt();
            //lógica
            if (x > 0 && y > 0) {
                System.out.println("Quadrante B");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante C");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante A");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante D");
            } else {
                System.out.println("Coordenadas sob o eixo 0");
            }
            System.out.println("\nCalcular novamente?");
            System.out.println("Digite 1 para continuar ou 0 para finalizar.");
            opcao = sc.nextInt();
        }while (opcao != 0);
    }
}