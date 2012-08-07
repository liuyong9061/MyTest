class TestStudent{
	public static void main(String args[]){
		Student n1 = new Student();
		n1.age = 19;
		n1.height = 182;
		n1.weight =65;
		n1.name = "小明";
		n1.study();
		System.out.println(n1.name+"的年龄是"+n1.age+"岁");
		System.out.println(n1.name+"的身高是"+n1.height+"cm");
		System.out.println(n1.name+"的体重是"+n1.weight+"Kg");
	}
}
