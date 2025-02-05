package EstruturaDeDados;

public class arrayExempleUnidimensionais {

    // criando array com quantidade de posições definidas
    int [] num = new int [5];

    //Criando um array com os dados no momento da criação

    int[] valores = {1,2,3,4,5,6};

    //Criando um array de pontos flutuantes
    double[] notas  = {8.5, 9.2, 5.3};

    //Criando um array de Strings
    String[] nomes = {"Caique", "Braga", "Sousa"};

    //criando um array de StringBuilder
    StringBuilder[] sbArray = new StringBuilder[2];

    public void iniciaValArray(){
        sbArray[0] = new StringBuilder("Olá");
        sbArray[1] = new StringBuilder("Caique");
    }

    public void exibirDadosArray(){
        for(StringBuilder sb : sbArray )
        System.out.println(sb);
    }
}

class Main{
    public static void main(String[] args){

        arrayExempleUnidimensionais numerosArray = new arrayExempleUnidimensionais();

        numerosArray.iniciaValArray();

        numerosArray.exibirDadosArray();
    }
}
