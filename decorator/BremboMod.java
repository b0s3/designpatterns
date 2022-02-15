package javacode.designpatterns.decorator;

public class BremboMod extends BikeModDecorator {

    BremboMod(javacode.designpatterns.decorator.BikeMods BikeMods) {
        super(BikeMods); 
    }

    public String getDescription(){
        return BikeMods.getDescription() + System.lineSeparator() + "Brembo disc brakes";
    }
    
}
