package thread;

public class Lambda_Thread {

	public static void main(String[] args) {
		// Withoud Lambda
		
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("Thread 1 is running.....");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		//With Lambda
		
		Runnable r2 = ()->{
			System.out.println("Thread 2 is running....");
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
