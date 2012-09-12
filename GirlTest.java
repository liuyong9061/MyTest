class GirlTest{
	public static void main(String[] args) {
		Girl girl = new Girl();
		try{
			girl.setAge(-10);
		}catch(Exception e){
			System.out.println(e);
		}finally{
			girl.age = 0;
			System.out.println("年龄值设置为" + girl.age + "。");
			System.out.println("年龄输入有误，年龄数值已重置！");
		}
	}
}