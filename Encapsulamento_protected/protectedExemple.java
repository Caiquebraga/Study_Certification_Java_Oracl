package Encapsulamento_protected;

public class protectedExemple {

    double saldo;

    public protectedExemple(double saldoInicial){
        double saldo = saldoInicial;
    }

    protected void depositar(double valor){
        if (valor > 0 ){
            System.out.println("Valor depositado: " + valor);
        } else {
            System.out.println("Valor Invalido");
        }
    }

}
