import java.util.Scanner;

interface Dosa {
    void show();
}

class MasalaDosa implements Dosa {
    public void show() {
        System.out.println("This dosa is decorated with Masala Curry");
    }
}

class OnionDosa implements Dosa {
    public void show() {
        System.out.println("This dosa is decorated with onion curry");
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Dosa House\nPress 1 for Masala Dosa \nPress 2 for Onion Dosa");

        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();

            switch (choice) {
                case (1): {
                    MasalaDosa md = new MasalaDosa();
                    md.show();
                    break;
                }
                case (2): {
                    OnionDosa od = new OnionDosa();
                    od.show();
                    break;
                }
                default: {
                    System.out.println("This dosa doesn't exists");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}