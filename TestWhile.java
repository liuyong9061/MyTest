public class TestWhile{
	public static void main(String args[]){
		int i = 2;
		System.out.println("进入While循环体");
		//打印10以内的偶数
		while(i < 10){
			System.out.println(i);
			i = i+2;
		}
		System.out.println("退出While循环体");
	}
}