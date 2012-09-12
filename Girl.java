class Girl{
	int age;
	public void setAge(int age) throws Exception{
		if(age < 0){
			Exception e = new Exception("年龄输入有误！");
			throw e;
		}
		this.age = age;
	}
}