package javacode.designpatterns.decorator;

public class Driver {
    public static void main(String[] args) {
        BikeMods Bike = new KTM();
        System.out.println(Bike.getDescription());

        BikeMods ModBike = new BremboMod(new KTM());
        System.out.println(ModBike.getDescription());
    }
}
