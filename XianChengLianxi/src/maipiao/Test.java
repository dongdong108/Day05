package maipiao;

public class Test {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread thread1 = new Thread(ticket);
		thread1.setName("窗口1");
		thread1.start();
		
		Thread thread2 = new Thread(ticket);
		thread2.setName("窗口2");
		thread2.start();
		
		
		Thread thread3 = new Thread(ticket);
		thread3.setName("窗口3");
		thread3.start();
		
		Thread thread4 = new Thread(ticket);
		thread4.setName("窗口4");
		thread4.start();
		
	}

}
