public class Main {
    public static void main(String[] args) {
        String numberAsString = "2022";
        System.out.println("numberAsString = " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
//        System.out.println("Number = " + number);

        double num = Double.parseDouble(numberAsString);
        System.out.println("Number = " + num);

        numberAsString += 1;
        num += 1;
//        number += 1;

        System.out.println("numberAsString = " + numberAsString);
//        System.out.println("Number = " + number);
        System.out.println("Number = " + num);

    }
}
