package xiancheng;

public class Tuzi extends Thread{
	private int juli = 30;
	public void run(){
		int sum=0;
		while(sum<juli){
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum+=10;
			if(sum%10==0){
				System.out.println("ÍÃ×ÓÅÜÁË"+sum+"Ã×");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

