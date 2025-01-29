package ClasseAbstrata;

public class AbstractExempleHeranca extends abstractExemple {

    private String sobreNome;

    AbstractExempleHeranca(String nome, String sobreNome){
        super(nome);
        this.sobreNome = sobreNome;
    }

    void fazerSom(){
        System.out.println("BOOOOM");
    }
}

class main{
    public static void main(String[] args){

        AbstractExempleHeranca Exemple = new AbstractExempleHeranca("Caique", "Braga");
        Exemple.fazerSom();
    }
}
