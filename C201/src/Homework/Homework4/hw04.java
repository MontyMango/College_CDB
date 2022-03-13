package Homework4;

public class hw04
{
    public static void main(String[] args)
    {
        Motorcycle MV1 = new Motorcycle("Tenere 700", "Yamaha", 125, MC_Engine.fourStroke, MC_Type.adventure);
        Truck MV2 = new Truck("Cascadia", 95, "Freightliner", 10, 605);
        Bus MV3 = new Bus("Crusader", 85, "Champion Group", 14);
        GasCar MV4 = new GasCar("Mustang", 180, "Ford", 2, 32);
        ElectricCar MV5 = new ElectricCar("Model S", 155, "Tesla", 4, 370);

        System.out.println(MV1.getName() + ": " + MV1.getType() + " type");
        System.out.println(MV2.getName() + ": " + MV2.getWheels() + " wheels; "+ MV2.getPower() + " horse power");
        System.out.println(MV3.getName() + ": " + MV3.getSeats() + " seats");
        System.out.println(MV4.getName() + ": " + MV4.getSpeed() + " miles per hour; " + MV4.getMPG() + " miles per gallon");
        System.out.println(MV5.getName() + ": " + MV5.getmilesRecharge() + " miles to recharge");
    }
}
/*
A successfully implemented program should display:

Tenere 700: adventure type
Cascadia: 10 wheels; 605.0 horse power
Crusader: 14 seats
Mustang: 180 miles per hour; 32.0 miles per gallon
Model S: 370.0 miles to recharge

*/
