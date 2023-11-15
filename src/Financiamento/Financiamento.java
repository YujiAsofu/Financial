package Financiamento;

public final class Financiamento {
    // Attributes:
    private final double valorImovel;
    private final int prazoFinanciamento;
    private final double taxaJurosAnual;

    // Construtor:
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    // Métodos:
    public double getValorImovel() {
        return valorImovel;
    }
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
    public double calcularPagMensal() {
        return (valorImovel / prazoFinanciamento) * (1 + (taxaJurosAnual/12));
    }
    public double calcularTotalPgto() {
        return calcularPagMensal() * prazoFinanciamento;
    }
    public String toString() {
        return String.format(
                "Valor imóvel: R$ %.2f.%nPrazo financiamento: %d.%nTaxa juros anual: %.2f.%nValor total do financiamento: R$ %.2f",
                valorImovel,
                prazoFinanciamento,
                taxaJurosAnual,
                calcularTotalPgto()
        );
    }
}
