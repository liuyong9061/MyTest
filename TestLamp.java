class TestLamp{

	public static void main(String agrs []){

        int i = 1;

        Lamp lamp = LampFactory.getLamp(i);

        lamp.powerOn();

        lamp.powerOff();

	}

}
