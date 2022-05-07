import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    static int reverse(int number) {
        String strNumber = Integer.toString(number);
        String reversed = "";
        boolean isNegative;

        if (strNumber.startsWith("-")) {
            reversed += "-";
            isNegative = true;
        } else {
            isNegative = false;
        }


        for (int i=strNumber.length()-1; i >= 0; i--) {
            char ch = strNumber.charAt(i);
            if (isNegative && i == 0) { } else {
                reversed += strNumber.charAt(i);
            }
        }

        try {
            return Integer.parseInt(reversed);
        } catch (NumberFormatException ex) {
            System.out.println("This is not integer!");
            return 0;
        }
    }
}
