package src;

public class Main {
    public static void main(String[] args) {
       GareebBank acc= new GareebBank(7218, "Eknath",1000, 4.5 );
       acc.addMoney(100);
       acc.withdrawMoney(50);
        System.out.println("your balance is"+acc.checkBalance());
        System.out.println("The interest for the year is"+acc.calculateInterest());
    }
}
