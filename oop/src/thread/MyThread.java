package thread;

public class MyThread {
	
	// attributes 
	int amount = 10000; // balance
	
	// withdraw method 
	// withdraw and deposit not working same time, this is synchronized 
	synchronized void withdraw(int amount) {
		System.out.println("Withdraw... ");
		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			System.out.println("Current Banalce = " + this.amount);
			try {
				wait(); // block state 
			} catch (Exception e) {
				
			}
		}
		this.amount -= amount;
		System.out.println("Withdraw completed...");
		System.out.println("Current Banalce = " + this.amount);
	} 
	
	// deposit method 
	synchronized void deposit(int amount) {
		System.out.println("Deposit...");
		this.amount += amount;
		System.out.println("deposit complated...");
		notify(); // runnable state 
	}
	
	public static void main(String[] args) {
		
		// class instance or object 
		MyThread myThread = new MyThread();
		
		// new thread 
		new Thread() {
			public void run() {
				myThread.withdraw(15000);
			}
		}.start();
		
		// another new thread
		new Thread() {
			public void run() {
				myThread.deposit(10000);
			}
		}.start();
	}

}
