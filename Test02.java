public class Test02{
	public static void main(String args[]){
		char play1 = 'b';//a代表石头，b代表剪刀，c代表布
		char play2 = 'a';
		//分支流程改进
		if(play1 == play2){
			System.out.println("平局");
		}
		else if(play1 == 'a'){
			if(play2 == 'b'){
				System.out.println("play1赢");
			}
			else if(play2 == 'c'){
				System.out.println("play2赢");
			}
		}
		else if(play1 == 'b'){
			if(play2 == 'a'){
				System.out.println("play2赢");
			}
			else if(play2 == 'c'){
				System.out.println("play1赢");
			}
		}
		else if(play1 == 'c'){
			if(play2 == 'a'){
				System.out.println("play1赢");
			}
			else if(play2 == 'b'){
				System.out.println("play2赢");
			}
		}
	}
}