public class Bicycle {
    int speed;
    int brakes;
    
    int speedUp(int speed){
        this.speed = speed; //I tried only return speed. But as you know this will only return the value 0 as default.
        return this.speed; // I need to return the values that passed in the object and not storing inside
    }

    int applyBrakes(int brakes){
        this.brakes = brakes;
        return this.brakes;
    }
}
