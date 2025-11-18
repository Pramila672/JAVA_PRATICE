public class BankAS {
    String accountholder;
    double balance;

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited amount: " + amount + " .New Balance" + balance);
    }

    void withdraw(double amount){
        if(balance >= amount ){
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount + " .New Balance" +balance);
        }else {
            System.out.println("Insufficient balance");
        }
    }

    void displayInfo(){
        System.out.println("AccountHolder:" + accountholder + "Balance:" + balance);
    }
}

