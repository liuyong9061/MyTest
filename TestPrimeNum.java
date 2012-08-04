public class TestPrimeNum{
	public static void main(String args[]){
		for(int i = 100;i<=200;i++){
			boolean a = true;
			for(int j = 2;j < i - 1;j++){
				int k = i % j;
				if(k == 0){
					a = false;
				}
			}
			if(a){
			System.out.println(i);
			}
		}
	}
}