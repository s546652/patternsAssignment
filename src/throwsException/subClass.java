package throwsException;

public class subClass extends SuperClass {
	  //here we can clearly see that we tried to override the super class with a different exception and it worked , example for unchecked exceptions.
	  
	  @Override
	    void methodOfSuperClass() throws NumberFormatException
	    {
	        System.out.println("Can be Overrided with same unchecked exception");
	    }
}
