public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;    // firstNumber with this is the field and right one is the parameter firstNumber
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getSecondNumber() * getFirstNumber();
    }

    public double getDivisionResult() {
        if (getSecondNumber() == 0) {
            return 0;
        } else {
            return getFirstNumber() / getSecondNumber();
        }
    }
}
