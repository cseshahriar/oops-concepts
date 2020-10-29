package thread;

/* Multithreading is a process of executing multiple threads simultaneously.
 *
 * Thread is basically a lightweight sub-process, a smallest unit of processing.
 *
 * Multiprocessing and multithreading, both are used to achieve multitasking.
 * But we use multithreading than multiprocessing because threads share a common
 * memory area. They don't allocate separate memory area so saves memory, 
 * and context-switching between the threads takes less time than process.
 * 
 * Advantage of Multithreadin:
 * It doesn't block the user because threads are independent and you can perform
 * multiple operations at same time.
 * 
 * You can perform many operations together so it saves time.
 * 
 * Threads are independent so it doesn't affect others threads
 * if exception occur in a single thread.
 * 
 * Types:
 * process base Multitasking(multiprocessing)
 * Thread-base multitasking(Multithreading)
 * */


public class NewThread extends Thread {
	
	// start method call  the run method 
	public void run() {
		// running state
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000); // block state
			} catch (InterruptedException e) {
				System.out.println(e);
			} 
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		// new creating threads
		NewThread thread1 = new NewThread();
		NewThread thread2 = new NewThread();
		
		// starting threads
		thread1.start(); // runnable state 
		thread2.start(); // runnable state
	}

}
