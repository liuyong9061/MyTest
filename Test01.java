public class Test01{
	public static void main(String args[]){
		int score;
		score = 100;
		//注意IF结构的顺序为从大到小，因为IF语句执行完毕后会跳出结构，故可省略对最大值范围的判断
		if(score > 100 || score < 0){
			System.out.println("输入错误！");
			System.out.println("错误值："+score);
		}
		else if(score >= 90){
			System.out.println("成绩为优秀！");
			System.out.println("您的成绩为"+score);
		}
		else if(score >= 75){
			System.out.println("成绩为良");
			System.out.println("您的成绩为"+score);
		}
		else if(score >=60){
			System.out.println("成绩为中");
			System.out.println("您的成绩为"+score);
		}
		else
		{
			System.out.println("成绩为差");
			System.out.println("您的成绩为"+score);
		}
	}
}