package Interface;

import Financiamento.Financiamento;

import java.util.Scanner;

public class InterfaceUsuario {
    public Financiamento novoFinanciamento() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Insira o valor do imóvel: ");
        double valorImovel = Scan.nextDouble();
        System.out.println("Insira o prazo do financiamento: ");
        int prazoFinanciamento = Scan.nextInt();
        System.out.println("Insira a taxa de juros anual: ");
        double taxaJurosAnual = Scan.nextDouble();
        return new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }
}