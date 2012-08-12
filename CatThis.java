class CatThis{
    public static void main(String[] args) {
        Cat catA = new Cat(5);
        catA.name = "A";
        catA.age = 6;
        catA.color = "White";
        catA.info();
        Cat catB = new Cat("b",7);
        catB.name = "B";
        catB.age = 8;
        catB.color = "black";
        catB.info();
        Cat catC = new Cat("c","blue",9);
        catC.name = "C";
        catC.age = 10;
        catC.color = "yellow";
        catC.info();
    }

}