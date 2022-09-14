import B.Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(128, "Shourya Gupta", "Kolkata", 354548);
        System.out.println(acc1);
        acc1.update("Shourya Gupta", "DB block, New Town", 146589);
        System.out.println(acc1);
        Account acc2 = new Account(115, "Aditya Azad", "Patna", 834677);
        System.out.println(acc2);
    }
}