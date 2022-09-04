public class Object {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car badCar = new Car();
        car1.crashCar();
        badCar.makeCarFaster();
        System.out.println(car1.getIsBroken());
        System.out.println(badCar.getSpeed());
    }
}

class Car{
    int speed = 1;
    boolean isBroken = false;

    public void crashCar(){
        isBroken = true;
    }

    public void makeCarFaster(){
        speed++;
    }

    public int getSpeed(){
       return speed;
    }

    public boolean getIsBroken(){
        return isBroken;
    }
}
