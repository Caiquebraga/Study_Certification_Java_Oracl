package Encapsulamento_protected;

public class protectedExemploHeranca extends protectedExemple {

    private double taxaJuros;

    public protectedExemploHeranca (double saldoInicial, double taxaJuros){
        super(saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarRendimento(){
        double rendimento = saldo * (taxaJuros / 100);
        depositar(rendimento);
    }
}
