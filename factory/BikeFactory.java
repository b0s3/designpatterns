package javacode.designpatterns.factory;

public class BikeFactory implements factoryinterface{

    @Override
    public Vehicle getFactory() {
        // TODO Auto-generated method stub
        return new Bike();
    }
    
}
