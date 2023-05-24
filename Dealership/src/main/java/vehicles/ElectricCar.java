package vehicles;

import components.ElectricMotor;

public class ElectricCar extends Vehicle{

    ElectricMotor electricMotor;

    public ElectricCar(String name, ElectricMotor electricMotor){
        super(name);
        this.electricMotor = electricMotor;
    }

    public String move(){
        return "Hmmmmmmmmm";
    }
}
