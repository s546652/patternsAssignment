package interfaceStaticDefault;

public interface testStaticDefault {
	default void show() {
	      System.out.println("test default");
	   }
	   static void display() {
	      System.out.println("test static");
	   }

}
