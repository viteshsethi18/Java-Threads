class Thread6 extends Thread{
	static int count = 0;
	public synchronized void run() {
		count++;
		System.out.println(count);
	}
	
}

