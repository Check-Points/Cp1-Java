//RM: 554682 - Milena Codinhoto da Silva
//RM: 557929 - Evellyn Valencia Choque
//RM: 86833 - Carolina Santana Ferraz

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DespesaFamiliar despesa = new DespesaFamiliar();

         double rendaFamiliarBruta, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
         int numeroDeMoradores;
        try {
            System.out.println("Digite sua renda familiar");
            rendaFamiliarBruta = scan.nextDouble();
            System.out.println("Digite o total de moradores da sua casa");
            numeroDeMoradores = scan.nextInt();
            System.out.println("Digite o preço da sua conta de água");
            gastoComAgua = scan.nextDouble();
            System.out.println("Digite o preço da sua conta de luz");
            gastoComLuz = scan.nextDouble();
            System.out.println("Digite o preço da sua conta de internet");
            gastoComInternet = scan.nextDouble();
            System.out.println("Digite o preço da mensalidade da academia");
            valorMensalidadeDaAcademia = scan.nextDouble();

            despesa.rendaFamiliarBruta = rendaFamiliarBruta;
            despesa.numeroDeMoradores = numeroDeMoradores;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComInternet = gastoComInternet;
            despesa.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            System.out.printf("Renda familiar: R$ %.3f \nTotal de gastos: R$ %.3f \nRenda familiar líquida: R$ %.3f", rendaFamiliarBruta, despesa.CalcularTotalDeDespesas(), despesa.CalcularRendaFamiliarLiquida());

        } catch (Exception e) {
            System.out.println("Formato incorreto!");
        }
    }
}
