public class MainComputer {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Apple", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch UltraGear","LG" , 27, new Resolution(2540, 1440));

        MotherBoard theMotherBoard = new MotherBoard("M2", "Apple", 1, 1, "Open Firmware");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        thePC.powerUp();
    }
}
