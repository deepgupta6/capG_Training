package thread;

public class ThreadSafetyDemo implements Runnable{
	
	public synchronized void printMessage(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		printMessage(Thread.currentThread().getName());
	}
	

	public static void main(String[] args) {
		ThreadSafetyDemo obj1 = new ThreadSafetyDemo();
//		ThreadSafetyDemo obj2 = new ThreadSafetyDemo();
//		ThreadSafetyDemo obj3 = new ThreadSafetyDemo();
		
		Thread t1 = new Thread(obj1,"A");
		Thread t2 = new Thread(obj1,"B");
		Thread t3 = new Thread(obj1,"C");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
