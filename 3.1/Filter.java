import java.util.Scanner;

class Filter {
    public static void main(String args[]) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter the String: \n");
            String s = ob.nextLine();

            StringFilter str = new StringFilter(s);
            System.out.println("\nFilter number\n");
            str.filterNum();
            System.out.println("\nFilter character\n");
            str.filterChar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
