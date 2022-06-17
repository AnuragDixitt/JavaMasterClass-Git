public class Car extends Vehicle{
        
        private int wheels;
        private int doors;
        private int gears;
        private boolean isManual;
         
        private int currentGear;

        public Car(String name, String string, int wheels, int doors, int gears, boolean isManual) {
                super(name, string);
                this.wheels = wheels;
                this.doors = doors;
                this.gears = gears;
                this.isManual = isManual;
                this.currentGear = 1;
        }

        public void changeGear(int currentGear) {
                this.currentGear = currentGear;
                System.out.println("Car.setCurrGear() : Changed to " + this.currentGear + " gear.");
        }

        public void changevelocity(int speed, int direction) {
                System.out.println("Car.changeVelocity : Velocity "+ speed + " direction " + direction);
                move(speed, direction);
        }
}
