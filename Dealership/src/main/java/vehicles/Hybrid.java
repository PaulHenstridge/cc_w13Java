package vehicles;

import components.ElectricMotor;
import components.Engine;

public class Hybrid extends ElectricCar{
    Engine engine;

    public Hybrid(String name, ElectricMotor electricMotor, Engine engine){
        super(name, electricMotor);
        this.engine = engine;
    }
    public String move(){
        return "Vroom+Hmmm";
    }
}
