import java.util.Scanner;

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