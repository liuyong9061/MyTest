class PeopleBoy extends People{
    String address;
    void intro(){
        super.intro();
        System.out.println("我的地址是" + address);
    }
}

