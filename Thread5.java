
public class Thread5 extends Thread {
	public void run(){
		System.out.println("Welcome to Threading");
	
	if(Thread.currentThread().getName().equals("1thread")|| Thread.currentThread().getName().equals("thread2"))
	try {
		Thread.sleep(1000);
		Thread.sleep(1000);
		
	}
	catch (InterruptedException e) {
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread5 t1 = new Thread5();
		//t1.start();
		Thread5 t2 = new Thread5();
		//t2.start();
		Thread5 t3 = new Thread5();
		//t3.start();
		Thread5 t4 = new Thread5();
		//t4.start();
		Thread5 t5 = new Thread5();
		//t5.start();
		t1.setPriority(10);
		//t1.start();
		t2.setPriority(3);
		//t2.start();
		t3.setPriority(2);
		//t3.start();
		t4.setPriority(5);
		//t4.start();
		t5.setPriority(8);
		//t5.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		if (t1.isAlive()){
			System.out.println("Thread 1 is alive");
		}
		else {
			System.out.println("Thread 1 is dead");
		}
		if (t2.isAlive()){
			System.out.println("Thread 2 is alive");
		}
		else {
			System.out.println("Thread 2 is dead");
		}
		if (t3.isAlive()){
			System.out.println("Thread 3 is alive");
		}
		else {
			System.out.println("Thread 3 is dead");
		}
		if (t4.isAlive()){
			System.out.println("Thread 4 is alive");
		}
		else {
			System.out.println("Thread 4 is dead");
		}
		if (t5.isAlive()){
			System.out.println("Thread 5 is alive");
		}
		else {
			System.out.println("Thread 5 is dead");
		}
			

	}

}
