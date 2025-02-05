package type_data;
import java.lang.StringBuilder;

public class Nao_Primitivo_StringBuilder {

    //método StringBuilder APPEND() -> Adc um texto no final da String original
   private StringBuilder nome = new StringBuilder("Caique");

   public void adSobreNome(){
       nome.append(" Braga");
   }
}
