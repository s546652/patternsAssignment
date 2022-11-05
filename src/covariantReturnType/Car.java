package covariantReturnType;

public class Car extends Vehicle {
    //Overriding getObject method.
    @Override
    Car getObject() {
        System.out.println("Derived class method from Base class.");
        return new Car(); 
    }
}
