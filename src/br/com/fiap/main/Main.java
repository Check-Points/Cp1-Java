//RM: 554682 - Milena Codinhoto
//RM: 557929 - Evellyn Choque
//RM: 86833 - Carolina Santana

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DespesaFamiliar despesa = new DespesaFamiliar();



        try {
            System.out.println("Digite sua renda familiar");
            despesa.rendaFamiliarBruta = scan.nextDouble();
            System.out.println("Digite o total de moradores da sua casa");
            despesa.numeroDeMoradores = scan.nextInt();
            System.out.println("Digite o preço da sua conta de água");
            despesa.gastoComAgua = scan.nextDouble();
            System.out.println("Digite o preço da sua conta de luz");
            despesa.gastoComLuz = scan.nextDouble();
            System.out.println("Digite o preço da sua conta de internet");
            despesa.gastoComInternet = scan.nextDouble();
            System.out.println("Digite o preço da mensalidade da academia");
            despesa.valorMensalidadeDaAcademia = scan.nextDouble();

            System.out.printf("Renda familiar bruto: %.3f \nTotal de gastos: %.3f \nRenda familiar líquida: %.3f", despesa.rendaFamiliarBruta, despesa.totalDasDespesas, despesa.rendaFamiliarLiquida);

        } catch (Exception e) {
            System.out.println("Formato incorreto!");
        }
    }
}
