public class TestTri{
	public static void main(String args[]){
		int n = 10;//程序改进，可自定义三角行数
		for(int i = 1;i <= n;i++){
			for(int j = n;j >= i+1;j--){
				System.out.print(" ");
			}
			for(int k = 0;k < i;k++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}