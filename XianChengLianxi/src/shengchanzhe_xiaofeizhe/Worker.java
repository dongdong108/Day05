package shengchanzhe_xiaofeizhe;
//工人类
public class Worker extends Thread{
	//定义存放电视机的仓库
	private HouseWare hw;
	
	
	public Worker(HouseWare hw) {
		super();
		this.hw = hw;
	}


	public void run(){
		for(int i=0;i<10;i++){
			hw.addTV();
		}
	}

}
