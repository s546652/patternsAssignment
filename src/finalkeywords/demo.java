package finalkeywords;

public class demo {
	final int i = 10;
	public void finalize() throws Throwable{
	      System.out.println("Object garbage collected.");
	   }
	   public static void main(String[] args) {
		   try {
	      demo t = new demo();
	      t = null;
	      System.gc();
	      }
		   catch(Exception e) {
			   
		   }
		   finally {
			   System.out.println("must be excuted ");
		   }
		   
	   }
}
