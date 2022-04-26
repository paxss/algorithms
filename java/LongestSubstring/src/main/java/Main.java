import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(getLongestSubstring(s));
    }

    //get longest substring without repeating characters
    static int getLongestSubstring(String s) {
        int longest = 0;

        for (int i=0; i<s.length(); i++) {

            String substr = "";
            for (int j=i; j<s.length(); j++) {
                String ch = Character.toString(s.charAt(j));
                if (!substr.contains(ch)) {
                    substr += ch;
                } else {
                    break;
                }

                if (longest < substr.length()) {
                    longest = substr.length();
                }
            }
        }

        return longest;
    }
}
