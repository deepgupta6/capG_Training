package thread;

class Calculator extends Thread{
	int total;
	public void run() {
		synchronized (this) {
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			notifyAll();
		}
	}
}

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.start();
		synchronized(cal) {
			try {
				cal.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(cal.total);
		}

	}

}
