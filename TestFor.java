public class TestFor{
	public static void main(String args[]){
		System.out.println("进入FOR循环体！");
		//For循环打印10以内的偶数		
		for(int i = 2; i <= 10; i = i+2){
			System.out.println(i);
		}
		System.out.println("退出FOR循环体");
	}
}