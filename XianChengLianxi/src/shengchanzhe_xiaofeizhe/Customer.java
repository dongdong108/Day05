package shengchanzhe_xiaofeizhe;
//消费者类
public class Customer extends Thread{
	//定义拿出电视机的仓库
	private HouseWare hw;

	public Customer(HouseWare hw) {
		super();
		this.hw = hw;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			hw.tabeTV();
		}
	}

}
