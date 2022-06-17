public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0  || smallCount < 0 || goal < 0) {
            return false;
        }

        while (bigCount > 0 && goal >= 5)  { // subtract 5 from goal for each bigcount
            goal -= 5;
            bigCount --;
        }
        return smallCount >= goal;
    }
}
