public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String phoneNumber, double balance, String email, String customerName, int number) {
        System.out.println("Bank Account Constructor with parameter called");
        this.number = number;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerName = customerName;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(phoneNumber, 200.5, customerName, email, 4324);
    }

    public BankAccount() {
        this("1234567891", 2.50, "default name", "default address", 0);
        System.out.println("Empty constructor called");
    }



    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Current balance: " + this.balance);
    }

    public void withdrawFunds(double withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Insufficient funds " + this.balance +"\n"+ "Withdrawal not processed" );
        } else {
            this.balance -= withdraw;
            System.out.println("Withdraw = " + withdraw + "\n" + "Remaining Balance = " + this.balance);
        }
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
