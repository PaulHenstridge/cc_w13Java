package vehicles;

import components.Engine;
import components.Gearbox;

public class Car extends Vehicle{
    Engine engine;
    Gearbox gearbox;

    public Car(String name, Engine engine, Gearbox gearbox){
        super(name);
        this.engine = engine;
        this.gearbox = gearbox;
    }

    @Override
    public String move() {
        return "Vroom";
    }
}
