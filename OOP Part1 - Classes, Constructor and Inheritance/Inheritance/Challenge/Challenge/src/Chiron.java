public class Chiron extends Car{
        private int roadServiceMonths;

        public Chiron(int roadServiceMonths) {
                super("Bugatti Chiron", "4WD", 4, 5, 7, false);
                this.roadServiceMonths = roadServiceMonths;
        }

        public void accelerate(int rate) {

                int newVelocity = getCurrVelocity() + rate;
                if (newVelocity == 0) {
                        stop();
                        changeGear(1);
                } else if(newVelocity > 0 && newVelocity <= 10) {
                        changeGear(1);
                } else if (newVelocity > 10 && newVelocity <= 20) {
                    changeGear(2);    
                } else if (newVelocity > 20 && newVelocity <= 30) {
                        changeGear(3);
                } else {
                        changeGear(4);
                }

                if (newVelocity > 0) {
                        changevelocity(newVelocity, getCurrDirection());
                }
        }

        
}