package thread;

public class Deadlock {
	// instances
	// lock: 
	public static Deadlock lock1 = new Deadlock();
	public static Deadlock lock2 = new Deadlock();

	public static void main(String[] args) {
		// ThreadDemo classes instance
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo2 t2 = new ThreadDemo2();
		t1.start();
		t2.start();
	}
	
	// ThreadDemo class
	private static class ThreadDemo1 extends Thread {
		
		public void run() {
			synchronized (lock1) { // no one access lock1, thats call lock
				System.out.println("Thread 1: Holding lock1");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Thread 1: waiting for lock2");
				synchronized (lock2) {
					System.out.println("Thread 1: Holding lock1 & lock2");
				}
			}
		}
	}
	
	// ThreadDemo class
	private static class ThreadDemo2 extends Thread {
		
		public void run() {
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock1");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Thread 2: waiting for lock2");
				synchronized (lock1) {
					System.out.println("Thread 2: Holding lock1 & lock2");
				}
			}
		}
	}

}
