package shengchanzhe_xiaofeizhe;
//仓库类
public class HouseWare {
	private int count=0;
	//添加电视机方法
	synchronized public void addTV(){
		if(count>=4){
			try {
				this.wait();//等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("开始生产");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
		System.out.println("生产了一台电视机，库存量："+count);
		this.notify();//唤醒消费者消费
	}
	//卖出电视机方法
	synchronized public void tabeTV(){
		if(count<=0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("开始出售！");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count--;
		System.out.println("出售了一台电视机，剩余："+count);
		this.notify();
	}

}
