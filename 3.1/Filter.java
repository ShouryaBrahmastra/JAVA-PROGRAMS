import java.util.Scanner;

interface NumberFilter {
    void filterNum();
}

interface CharacterFilter {
    void filterChar();
}

class StringFilter implements NumberFilter, CharacterFilter {
    String S;

    StringFilter(String S) {
        this.S = S;
    }

    public void filterNum() {
        int i = 0;
        for (i = 0; i < S.length(); i++) {
            if ((int) S.charAt(i) >= 48 && (int) S.charAt(i) <= 57) {
                System.out.println(S.charAt(i) + "");
            }
        }
    }

    public void filterChar() {
        int i = 0;
        for (i = 0; i < S.length(); i++) {
            if ((int) S.charAt(i) >= 60 && (int) S.charAt(i) <= 126) {
                System.out.println(S.charAt(i) + "");
            }
        }
    }
}

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
