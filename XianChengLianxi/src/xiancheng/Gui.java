package xiancheng;

public class Gui extends Thread{
	private int juli = 30;
	public void run(){
		int sum=0;
		while(sum<juli){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum++;
			if(sum%10==0){
				System.out.println("�ڹ�����"+sum+"��");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
