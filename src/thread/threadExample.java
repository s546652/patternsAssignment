package thread;

public class threadExample extends Thread{
	
	public void run() {
		System.out.println("printing message");
	}
	public static void main(String args[]) {
		threadExample t = new threadExample();
		t.start();
		t.start();
	}
}

	