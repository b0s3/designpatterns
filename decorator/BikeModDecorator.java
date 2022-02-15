package javacode.designpatterns.decorator;

public abstract class BikeModDecorator implements BikeMods{

    BikeMods BikeMods;

    BikeModDecorator(BikeMods BikeMods){
        this.BikeMods = BikeMods;
    }

    public String getDescription() {
        return null;
        //return BikeMods.getDescription() + System.lineSeparator();
    }
    
}
