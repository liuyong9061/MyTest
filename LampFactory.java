class LampFactory{

        public static Lamp getLamp(int i){

                Lamp lamp = null;

                if(i == 0){

                        lamp = new ALamp();

                }

                else if(i == 1){

                        lamp = new BLamp();

                }

                else if(i == 2){

                        lamp = new CLamp();

                }

                return lamp;

        }

}

