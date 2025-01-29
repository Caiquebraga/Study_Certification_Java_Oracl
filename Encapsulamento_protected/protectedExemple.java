package Encapsulamento_protected;

public class protectedExemple {

    protected double saldo;

    public protectedExemple(double saldoInicial){
        this.saldo = saldoInicial;;
    }

    protected void depositar(double valor){
        if (valor > 0 ){
            saldo += valor;
            System.out.println("Valor depositado: " + valor);
        } else {
            System.out.println("Valor Invalido");
        }
    }

}
