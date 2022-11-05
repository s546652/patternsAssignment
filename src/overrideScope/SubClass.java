package overrideScope;

public class SubClass extends ParentClass {
	
	
	@Override
	
	public void publicMethod() {
		// TODO Auto-generated method stub
		super.publicMethod();
	}

	@Override
	//changing it to public
	//protected void protectedMethod() {
	
	public void protectedMethod() {
		// TODO Auto-generated method stub
		super.protectedMethod();
		System.out.println("changed the method scope to public from protected");
	}
	//private methods cannot be accessed in subclassess
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass o = new SubClass();
		o.protectedMethod();
		o.publicMethod();
	}

}
