package vehicles;

public abstract class Vehicle {
    String name;

    public Vehicle(String name){
        this.name = name;
    }

    public abstract String move();


}
