package thread;

// 3way to use thread
// using runnable interface
//using classable interface
// using thread class

public class MyThread  implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName() + " is Running");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread t1 = new Thread(obj, "X");
		Thread t2 = new Thread(obj, "Y");
		Thread t3 = new Thread(obj, "Z");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY-2);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("T1-->"+t1.getPriority());
		System.out.println("T2-->"+t2.getPriority());
		System.out.println("T3-->"+t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		
	}

}
