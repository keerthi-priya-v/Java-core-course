package chapter7;
public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this.owner = owner;
    }
    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Amount should be greater than 1");
        }
        else {
            balance += amount;
            System.out.println("Your amount is successfully credited");
            System.out.println("Owner: "+ getOwner());
            System.out.println("balance: "+getBalance());
        }
    }

    public void withdraw(int amount){
        if(amount<=balance) {
            balance -= amount;
            System.out.println("Amount has be debited ");
            System.out.println("Owner: "+ getOwner());
            System.out.println("balance: "+getBalance());
        }
        else{
            System.out.println("Your balance is too low to withdraw");
        }
    }

    public String getOwner(){
        return owner;
    }

    public int getBalance(){

        return balance;
    }
}