//RM: 554682 - Milena Codinhoto da Silva
//RM: 557929 - Evellyn Valencia Choque
//RM: 86833 - Carolina Santana Ferraz

package br.com.fiap.bean;

public class DespesaFamiliar {
    public double rendaFamiliarBruta, totalDasDespesas, rendaFamiliarLiquida, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
    public int numeroDeMoradores;

    public double CalcularTotalDeDespesas() {
        totalDasDespesas = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);

        return totalDasDespesas;
    }

    public double CalcularRendaFamiliarLiquida() {
        rendaFamiliarLiquida = rendaFamiliarBruta -  totalDasDespesas;
        return rendaFamiliarLiquida;
    }

}
