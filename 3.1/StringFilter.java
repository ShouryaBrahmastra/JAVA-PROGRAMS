public class StringFilter implements NumberFilter, CharacterFilter {
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
