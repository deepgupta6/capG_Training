package thread;

public class Account implements Runnable {
	private static double accBalance = 2000;

	// synchronized is a modifier can apply only function or we can use synchronized
	// block

	public static void withdraw(String name, double amt) {

		synchronized (Account.class) {
			if (amt < accBalance) {
				System.out.println(name + " is going to withdraw");
				accBalance -= amt;
			} else {
				System.out.println(name + " has Not enough Balance");
			}
		}
		System.out.println(name + " has available balance " + accBalance);

	}

	@Override
	public void run() {
		withdraw(Thread.currentThread().getName(), 1000);
	}

}
