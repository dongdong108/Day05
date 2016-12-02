package maipiao;

public class Ticket implements Runnable{
	//定义票数
	private int count=100;
	//重写方法
	@Override
	public void run() {
		while(count>0){
			//调用方法
			sale();
		}
	}
	//同步方法：默认的锁是this对象
	synchronized public void sale(){
		//双层判断
		if(count>0){
			System.out.println(Thread.currentThread().getName()+"余票是："+count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count--;
			System.out.println(Thread.currentThread().getName()+"卖出一张票,余票是："+count);
		}
	}
	

}
