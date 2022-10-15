package avaliacoes.projetos.questoes;

import java.util.Scanner;

public class CalculaSalarioAnualLiquido {
    //leitor
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // variaveis
        float salario = 0f;
        int meses = 12;
        float salarioLiquidoAnual;
        float media;
        float inss;
        float ferias;
        int opcao = 0;
        float inssAnual = 0;
        //inicio
        do {
            System.out.println("-----Calculadora de Salário Líquido Anual-----");
            while (salario <= 0) {
                System.out.println("Informe o salario mensal: ");
                salario = sc.nextFloat();
                if (salario > 0) ;
                else System.out.println("Informe um salário válido. \n");
            }
            //calcula salario médio
            media = (new CalculaSalarioAnualLiquido()).calculaSalarioMedio(salario, meses);
            //calcula inss
            inss = (new CalculaSalarioAnualLiquido()).calculaInss(salario);
            //calcula férias
            ferias = (new CalculaSalarioAnualLiquido()).calculaFerias(salario, inss);
            //calcula liquido anual
            salarioLiquidoAnual = (new CalculaSalarioAnualLiquido()).salarioLiquidoAnual(media, ferias, inss, meses);
            //calcula inss anual
            inssAnual = (new CalculaSalarioAnualLiquido().inssAnual(inss));
            //saída
            System.out.print("\n----------------------------------------");
            System.out.printf("\n-----Média salarial anual bruto: R$ %.2f", media);
            System.out.printf("\n-----Média salarial anual líquido: R$ %.2f", salarioLiquidoAnual);
            System.out.print("\n----------------------------------------");
            System.out.printf("\nDescontos: ");
            System.out.printf("\n-----Inss do empregado mensal: R$ %.2f", inss);
            System.out.printf("\n-----Inss do empregado anual: R$ %.2f", inssAnual);
            System.out.printf("\nInformações extras: ");
            System.out.printf("\n-----Valor de férias: R$ %.2f", ferias);
            System.out.printf("\n-----Valor de férias com INSS descontado: R$ %.2f", ferias - inss);
            System.out.print("\n----------------------------------------");
            do {
                System.out.println("\nDeseja realizar um novo calculo?\n1 - Sim\n2 - Nao");
                opcao = sc.nextInt();
                if (opcao == 1 && opcao == 2) ;
                else System.out.println("Informe um valor válido. \n");
            } while (opcao != 1 && opcao != 2);
        } while (opcao != 2);
        sc.close();
    }

    //calcula salário médio
    public float calculaSalarioMedio(float salario, int meses) {
        float media = 0;
        int opcao = 0;
        //calcular salario medio anual trabalhados com ou sem decimo
        while (opcao != 1 && opcao != 2) {
            System.out.println("Recebeu decimo terceiro?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    media = ((meses + 1) * salario) / 12;
                    break;
                }
                case 2: {
                    media = (meses * salario) / 12;
                    break;
                }
                default:
                    System.out.println("Valor incorreto, favor escolha uma das opcoes.");
                    break;
            }
        }
        return media;
    }

    public float calculaInss(float salario) {
        float inss;
        float aliquotaInss = 0f;
        float teto = 0;
        //tabela aliquota
        if (salario <= 1212.00) aliquotaInss = 0.075f;
        else if (salario >= 1212.01 && salario <= 2427.35) aliquotaInss = 0.09f;
        else if (salario >= 2427.36 && salario <= 3641.03) aliquotaInss = 0.12f;
        else if (salario >= 3641.04 && salario <= 7087.22) aliquotaInss = 0.14f;
        else teto = 900f;
        //calcula media
        if (teto == 900) inss = salario + teto;
        else inss = salario * aliquotaInss;
        return inss;
    }

    public float calculaFerias(float salario, float inss) {
        float ferias = 0;
        //calculo do terço de férias
        ferias = ((salario) / 3) + salario;
        return ferias;
    }

    public float salarioLiquidoAnual(float media, float tercoFerias, float inss, int meses) {
        float salarioLiquido = 0;
        salarioLiquido = media - inss;
        return salarioLiquido;
    }

    public float inssAnual(float inss) {
        float inssAnual = 0f;
        inssAnual = inss * 12;
        return inssAnual;
    }
}