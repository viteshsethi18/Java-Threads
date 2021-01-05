
public class Thread2 implements Runnable {
	public void run(){
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t2 = new Thread2();
		Thread t3 = new Thread(t2);
		t3.start();

	}

}
