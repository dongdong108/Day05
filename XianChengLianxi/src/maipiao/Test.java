package maipiao;

public class Test {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread thread1 = new Thread(ticket);
		thread1.setName("����1");
		thread1.start();
		
		Thread thread2 = new Thread(ticket);
		thread2.setName("����2");
		thread2.start();
		
		
		Thread thread3 = new Thread(ticket);
		thread3.setName("����3");
		thread3.start();
		
		Thread thread4 = new Thread(ticket);
		thread4.setName("����4");
		thread4.start();
		
	}

}
