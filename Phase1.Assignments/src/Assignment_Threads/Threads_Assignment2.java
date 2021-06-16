package Assignment_Threads;

class MyThread {
	public void run () {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println((i + 1) + ": learning Java");
 		}
		System.out.println();
	}
}

class YourThread {
	public void run () {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println((i + 1) + ": We are into Phase1");
		}
	}
}

public class Threads_Assignment2 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		YourThread yourThread = new YourThread();
		
		myThread.run();
		yourThread.run();

	}

}
