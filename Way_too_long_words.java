import java.util.Scanner;

public class Way_too_long_words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terms = input.nextInt();
        for (int i = 0; i < terms; i++) {
            String word = input.next();
            if (word.length() > 10) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                int inBetween = word.length() - 2;
                System.out.printf("%c%d%c\n", first, inBetween, last);
            } else System.out.println(word);
        }
    }
}
