package throwsException;

import java.io.IOException;

public class subClass1 extends SuperClass {

	@Override
	void methodOfSuperClass() throws IOException {
		// TODO Auto-generated method stub
		super.methodOfSuperClass();
	}
	
// unchecked exceptions cannt be overridden by checked exceptions. Same implies with checked exceptions(they can override the same checked exception or the exception with less scope.).
}
