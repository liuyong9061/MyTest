class Cat{
    String name;
    String color;
    int age;
    Cat(int age){
        this.age = age;
        System.out.println("无参数构造函数");
        System.out.println("猫的年龄为"+age);
    }
    Cat(String name,int age){
        this(age);
        this.name = name;
        System.out.println("两个参数的构造函数");
        System.out.println("叫"+name+"的猫的年龄为"+age);
    }
    Cat(String name,String color,int age){
        this(name,age);   
        this.color = color;
        System.out.println("三个参数的构造函数");
        System.out.println("叫"+name+"的猫颜色为"+color+",年龄为"+age);
    }
    void info(){
        System.out.println("猫的信息为：年龄"+age+", 颜色"+color+", 姓名"+name);
    }
}