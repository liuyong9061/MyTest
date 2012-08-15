public class Ex17{
    public static void main(String[] args) {
        Ex p1 = new Ex();
        Ex p2 = new Ex();
        Ex.age = 20;
        p1.name = "张三";
        p2.name = "李四";
        p1.talk();
        p2.talk();
        p2.age = 18;
        Ex.speak();
        p1.talk();
        p2.talk();
    }
}