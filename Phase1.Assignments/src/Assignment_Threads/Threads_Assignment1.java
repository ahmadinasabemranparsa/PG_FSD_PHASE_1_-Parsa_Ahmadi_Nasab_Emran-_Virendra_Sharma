package Assignment_Threads;

public class Threads_Assignment1 extends Thread {
	
	public void run () {
		for(int i  = 1; i < 5; i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + ": " + i);
			System.out.println("Is my thread alive or not?:  "+Thread.currentThread().isAlive());
			System.out.println("Is my thread Daemon or not?:  "+Thread.currentThread().isDaemon());
			System.out.println("The thread id is: "+Thread.currentThread().getId());
			System.out.println("The thread group is: "+Thread.currentThread().getThreadGroup());
			System.out.println("running thread state is: "+ Thread.currentThread().getState());
			System.out.println("running thread priority is: "+Thread.currentThread().getPriority());
			System.out.println("running thread name is: "+Thread.currentThread().getName());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Threads_Assignment1 t1 = new Threads_Assignment1();
		t1.setName("Java");
		t1.setPriority(MIN_PRIORITY);
		t1.setDaemon(true);
		
		Threads_Assignment1 t2 = new Threads_Assignment1();
		t2.setName("Python");
		t2.setPriority(MIN_PRIORITY);
		
		Threads_Assignment1 t3 = new Threads_Assignment1();
		t3.setName("Oracle");
		t3.setPriority(NORM_PRIORITY);
		
		Threads_Assignment1 t4 = new Threads_Assignment1();
		t4.setName("C++");
		t4.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
