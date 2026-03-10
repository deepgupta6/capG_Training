package thread;

public class DemonThread implements Runnable{
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + " is Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException{
		DemonThread obj = new DemonThread();
		Thread t1 = new Thread(obj);
		t1.start();
		String str = "Hello";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			Thread.sleep(1000);
		}
		
//		System.out.println(Thread.currentThread().getName() + " is Alive" + Thread.currentThread().isAlive());
	}

}
