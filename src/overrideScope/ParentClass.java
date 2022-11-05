package overrideScope;

public class ParentClass {

	public void publicMethod() {
		System.out.print("public method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	
	private void privateMethod() {
		System.out.println("private mehtod");
	}
}
