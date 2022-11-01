import java.util.Scanner;

class Account {
    String name, actype;
    int AccNo;
    public double balance;

    Account(String name, String actype, int AccNo) {
        this.name = name;
        this.actype = actype;
        this.AccNo = AccNo;
    }

    Account() {
    }
}

class Curr extends Account {
    double minbal;
    String a, b;
    int c;

    Curr(String a, String b, int c, double minbal) {
        super(a, b, c);
        this.minbal = minbal;
        balance = minbal;
    }

    Curr() {
    }

    void display() {
        System.out.println("\n Name of the account holder is : " + name + "\nAccount Type is : " + actype
                + "\nBalance is : " + balance);
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the amount you want to deposit :");
        double amnt = sc.nextDouble();
        balance += amnt;
        System.out.print("\n After deposition balance is : " + balance + "\n");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the amount you want to withdraw :");
        double amnt = sc.nextDouble();
        if (balance >= amnt) {
            if ((balance - amnt) < minbal) {
                amnt += 10;
                System.out.print("\n Rs.10 SERVICE CHARGE HAS BEEN IMPOSED \n");
            }
            balance -= amnt;
            System.out.print("\n After withdrawl balance is : " + balance + "\n");
        } else {
            System.out.print("\n INSUFFICIENT BALANCE! \n");
        }
    }
}

class Sav extends Account {
    double minbal;
    String a, b;
    int c;

    Sav(String a, String b, int c, double minbal) {
        super(a, b, c);
        this.minbal = minbal;
        balance = minbal;
    }

    Sav() {
    }

    void display() {
        System.out.println("\n Name of the account holder is : " + name + "\nAccount Type is : " + actype
                + "\nBalance is : " + balance);
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the amount you want to deposit :");
        double amnt = sc.nextDouble();
        balance += amnt;
        System.out.print("\n After deposition balance is : " + balance + "\n");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the amount you want to withdraw :");
        double amnt = sc.nextDouble();
        if (balance >= amnt) {
            if ((balance - amnt) < minbal) {
                amnt += 10;
                System.out.print("\n Rs.10 SERVICE CHARGE HAS BEEN IMPOSED \n");
            }
            balance -= amnt;
            System.out.print("\n After withdrawl balance is : " + balance + "\n");
        } else {
            System.out.print("\n INSUFFICIENT BALANCE! \n");
        }
    }

    void Interest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the Year of interest : ");
        double year = sc.nextDouble();
        double rate = 10;
        double ir = ((balance * rate * year) / 100);
        System.out.println("\n" + year + "Year interest rate is : " + ir);
        balance += ir;
        System.out.print("\n After adding the Yearly interest, Balance is : " + balance);
    }
}

class Banking {
    public static void main(String[] args) {
        int x = 2;
        while (x > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter the Name : ");
            String nam = sc.nextLine();
            System.out.print("\nEnter the Account Type : ");
            String typ = sc.nextLine();
            System.out.print("\nEnter the Account Number : ");
            int no = sc.nextInt();
            System.out.print("\nEnter the minimum Balance : ");
            double min = sc.nextDouble();
            if (typ.equals("Savings")) {
                Sav obj = new Sav(nam, typ, no, min);
                obj.display();
                obj.deposit();
                obj.withdraw();
                obj.Interest();
            }
            if (typ.equals("Current")) {
                Curr obj = new Curr(nam, typ, no, min);
                obj.display();
                obj.deposit();
                obj.withdraw();
            }
            x--;
        }
    }
}