public class FindTheError {
    public static void main(String[] args){
        Bicycle bike = new Bicycle(); //Error: "Bicycle cannot be resolved to a type"
        bike.speedUp(100);
        bike.applyBrakes(100);

        System.out.println("The bike speed is: " + bike.speed);
        System.out.println("The bike brakes is: " + bike.brakes);
    }
    
}
/*
1. The error occure as it is not exist in the original code.
    We can solve this via create a new class Bicycle in it own file and assignd the methods it need.
    If we only declare the class and not create the method it will cause error undefined for the type

2. The second error is local variable bike may not have been initialized.
   As in the original "Bicycle bike" yet it should be like this "Bicycle bike = new Bicycle()"
*/