package Polimorfismo;

public class Compile_Time_Polymorphism {

    public double SUM_AREA(double side) {
        return side * side;
    }

    public double SUM_AREA(double width,  double height ) {
        return width * height;
    }
}

class Main{
    public static void main(String[] args){

        Compile_Time_Polymorphism SUM = new Compile_Time_Polymorphism();

        SUM.SUM_AREA(2);
        System.out.println("THIS IS THE AREA OF A SQUARE : " +  SUM.SUM_AREA(2));

        SUM.SUM_AREA(2,8);
        System.out.println("THIS IS THE AREA OF A RECTANGLE: " +   SUM.SUM_AREA(2,8));
    }
}
