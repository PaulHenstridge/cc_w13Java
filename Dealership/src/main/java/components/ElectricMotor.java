package components;

public class ElectricMotor extends Engine{
    int ecoRating;

    public ElectricMotor(String name, int power, int ecoRating){
        super(name, power);
        this.ecoRating = ecoRating;
    }
}
