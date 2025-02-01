package Classes_String;

public class String_Builder_Exemple {
    private StringBuilder name = new StringBuilder("Caique");

    public String AcresentaNomeFinal() {
        name.append(" Braga");
        return name.toString();
    }

    public char RetornarCaracterdaPosicao() {
        return name.charAt(3);

    }

    public int retornaPosicaodeLetra() {
        return name.indexOf("B");
    }
}
    class Main{
        public static void main(String[] args){
            String_Builder_Exemple nomes = new String_Builder_Exemple();

            System.out.println("nomes Acresenta no final: " + nomes.AcresentaNomeFinal());
            System.out.println("nomes Retorna Posição: " + nomes.RetornarCaracterdaPosicao());
            System.out.println("nomes Retorna Posição: " + nomes.retornaPosicaodeLetra());
        }
    }
