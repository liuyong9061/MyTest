public class Boy{
	int age;
	public void setAge(int age){
		if(age < 0){
			RuntimeException r = new RuntimeException("年龄输入有误！");
			throw r; 
		}
		this.age = age;
	}
}