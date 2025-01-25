package Encapsulamento_Private;

public class PrivateExemple {

    private String Name;
    private int Age;

    // Constructor to initialize the object
    public PrivateExemple(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public String getName(){
        return Name;
    }


    public void setName(String Name){
        if(Name == null || Name.isEmpty()){
            System.out.println("Invalid name! The name cannot be empty.");
        } else{
            this.Name = Name;
        }
    }

    public int getAge(){
        return Age;
    }

    public void SetAge(int age){
        if(Age < 0 ){
            System.out.println("Invalid age! Age cannot be negative.");
        } else{
            this.Age = Age;
        }
    }

}
