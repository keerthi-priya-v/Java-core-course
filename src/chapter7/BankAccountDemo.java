package chapter7;
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount("Keerthi", 5000);
        System.out.println("Owner: "+  bobAccount.getOwner());
        System.out.println("balance: "+ bobAccount.getBalance());

        bobAccount.deposit(10000);
        bobAccount.withdraw(4000);

        System.out.println();

        BankAccount myAccount = new BankAccount("Priya", 10000);
        System.out.println("Owner: "+  myAccount.getOwner());
        System.out.println("balance: "+ myAccount.getBalance());

        myAccount.deposit(20000);
        myAccount.withdraw(8000);

    }//end main
}