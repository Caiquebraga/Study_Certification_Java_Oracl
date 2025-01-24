package Heranca;

public class ExtendsHeranca extends HerancaExemple  {

    public void  NoiseAnimal(){
        System.out.println("DOG bark, au au");
    }

}

class Main{
    public static  void main(String[] Args){
        ExtendsHeranca Dog = new ExtendsHeranca ();
        Dog.NoiseAnimal();

    }
}
