public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int rowNo=1; rowNo<=number; rowNo++) {
                for (int colNo=1; colNo<=number; colNo++) {
                    if ((rowNo==1) || (rowNo == number) || (colNo == 1) || (colNo == number) || (rowNo == colNo) || (rowNo + colNo == number + 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
