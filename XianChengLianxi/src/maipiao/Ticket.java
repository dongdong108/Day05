package maipiao;

public class Ticket implements Runnable{
	//����Ʊ��
	private int count=100;
	//��д����
	@Override
	public void run() {
		while(count>0){
			//���÷���
			sale();
		}
	}
	//ͬ��������Ĭ�ϵ�����this����
	synchronized public void sale(){
		//˫���ж�
		if(count>0){
			System.out.println(Thread.currentThread().getName()+"��Ʊ�ǣ�"+count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count--;
			System.out.println(Thread.currentThread().getName()+"����һ��Ʊ,��Ʊ�ǣ�"+count);
		}
	}
	

}
