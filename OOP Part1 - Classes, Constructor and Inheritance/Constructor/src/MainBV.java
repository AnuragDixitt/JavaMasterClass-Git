public class MainBV {
    public static void main(String[] args) {

//        BankAccount account = new BankAccount(); // ("7355471472", 0, "anshiva.dixit76@gmial.com", "Anurag", 123);
//
//        System.out.println(account.getBalance());
//        System.out.println(account.getCustomerName());
//        System.out.println(account.getEmail());
//        System.out.println(account.getNumber());
//        System.out.println(account.getPhoneNumber());


//        account.withdrawFunds(100.0);
//        account.depositFunds(50);
//        account.withdrawFunds(100);
//
//        account.depositFunds(51);
//        account.withdrawFunds(100);
//
//        BankAccount anuragAccount = new BankAccount("Anurag", "anshi@email.com", "2345");
//        System.out.println(anuragAccount.getNumber() + " name " + anuragAccount.getCustomerName());

        VipCustomer customer = new VipCustomer("Anurag", 23400);
        System.out.println(customer.getCreditLimit() +"\n"+ customer.getName());

        VipCustomer vishnu = new VipCustomer();
        System.out.println(vishnu.getCreditLimit() + "\n" + vishnu.getName() +"\n"+ vishnu.getEmailAddress());

        VipCustomer papa = new VipCustomer("Brijendra", 50000, "dixit@gmail.com");
        System.out.println(papa.getName()+"\n" + papa.getCreditLimit() +"\n"+ papa.getEmailAddress());
    }
}