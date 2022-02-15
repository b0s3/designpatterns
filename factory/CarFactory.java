package javacode.designpatterns.factory;

public class CarFactory implements factoryinterface{

    @Override
    public Vehicle getFactory() {
        // TODO Auto-generated method stub
        return new Car();
    }
    
}
