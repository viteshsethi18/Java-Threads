
public class Thread1 extends Thread {
	public void run(){
		System.out.println("thread running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
		

	}

}
