public class TestTri{
	public static void main(String args[]){
		int n = 35;//程序改进，可自定义三角行数
		if(n <= 40){
			for(int i = 1;i <= n;i++){
				for(int j = n;j >= i+1;j--){
					System.out.print(" ");
				}
				for(int k = 0;k < i;k++){
					System.out.print("* ");
				}
				System.out.print("\n");
			}
		}else{
			System.out.println("传入数值大于显示尺寸！");
		}
	}
}