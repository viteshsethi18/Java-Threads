
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t4 = new Thread3();
		Thread t = new Thread (t4);
		Thread4 t5 = new Thread4();
		Thread t1 = new Thread(t5);
		t.start();
		t1.start();

	}

}
