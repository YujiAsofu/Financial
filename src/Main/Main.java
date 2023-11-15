package Main;
import Financiamento.Financiamento;
import Interface.InterfaceUsuario;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ArrayList<Financiamento> lista = new ArrayList<>();

        int qtd = 0;
        while(qtd < 4) {
            Financiamento financiamento = interfaceUsuario.novoFinanciamento();
            lista.add(financiamento);
            qtd += 1;
        }

        for (Financiamento i : lista) {
            int index = lista.indexOf(i);
            System.out.println("Financiamento " + (index + 1));
            System.out.println(i.toString());
            System.out.println();
        }
    }
}