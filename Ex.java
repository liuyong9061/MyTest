class Ex{
    static int age;
    static{
        System.out.println("我是静态代码块");
    }
    static void speak(){
        System.out.println("我的年龄是" + age);
    }
    String name;
    void talk(){
        System.out.println("我的姓名是" + this.name + ",我的年龄是" + age);
    }
}