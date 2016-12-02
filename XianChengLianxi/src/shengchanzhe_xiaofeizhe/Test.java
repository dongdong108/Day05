package shengchanzhe_xiaofeizhe;

public class Test {
                 
	public static void main(String[] args) {
		//ÊµÀı»¯²Ö¿âÀà
		HouseWare hw = new HouseWare();
		
		Worker w = new Worker(hw);
		w.start();
		
		Customer c = new Customer(hw);
		c.start();
	}
}