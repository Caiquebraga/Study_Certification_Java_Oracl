public class Encapsulamento_Public {
    private String titular;
    private double saldo;


    public Encapsulamento_Public(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        if(titular !=null && !titular.isEmpty()){
            this.titular = titular;
        } else{
            System.out.println("Nome titular invalido!");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo =+ valor;
        } else{
            System.out.println("Saldo negativo");
        }
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        } else{
            System.out.println("Saldo negativo");
        }
    }


}
