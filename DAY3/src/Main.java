//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*System.out.println("I am ROBOT 1");
        Robot r1 = new Robot("TOM", "RED", 40);
        r1.introduceSelf();

        System.out.println("-------------------------");
        System.out.println("I am ROBOT 2");
        Robot r2 = new Robot("Jerry", "BLUE", 50);
        r2.introduceSelf();


        //for dog class
        Dog d1 = new Dog();
        d1.name = "Luna";
        d1.bark();
        } */

        //FOR BANK ACCOUNT SYSTEM

        BankAS acc1 = new BankAS();
        acc1.accountholder = "Pramila Khadka";
        acc1.balance = 100;

        BankAS acc2 = new BankAS();
        acc2.accountholder = "Ram Khadka";
        acc2.balance = 5000;

        acc1.deposit(1000);
        acc1.withdraw(1500);
        acc2.withdraw(1000);

        acc1.displayInfo();
        acc2.displayInfo();

    }
}