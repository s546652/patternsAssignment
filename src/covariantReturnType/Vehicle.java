package covariantReturnType;

public class Vehicle {
	Vehicle getObject() {
        System.out.println("The Base class method.");
        return new Vehicle(); 
    }
}
