package ClasseAbstrata;

abstract  class abstractExemple {
    String nome;

    abstractExemple(String nome){
        this.nome = nome;
    }
    abstract void fazerSom();

    void dormir(){
        System.out.println("DORMIR FAZ BEM ZzZzZ");
    }
}
