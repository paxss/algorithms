import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = numberToList(9999999);
        LinkedList<Integer> l2 = numberToList(9999);

        int result = listToNumber(l1) + listToNumber(l2);

        System.out.println(numberToList(reverseNumber(result)));

    }

    static LinkedList numberToList(int number) {
        LinkedList<Integer> listNumber = new LinkedList<>();

        String strNumber = Integer.toString(number);

        for (int i=0; i < strNumber.length(); i++) {
            listNumber.add(Character.getNumericValue(strNumber.charAt(i)));
        }

        return listNumber;
    }

    static int listToNumber(LinkedList list) {
        String strNumber = "";

        for (int i=0; i<list.size(); i++) {
            strNumber += list.get(i);
        }

        return Integer.parseInt(strNumber);
    }

    static int reverseNumber(int number) {
        String strNumber = Integer.toString(number);
        String reverseStr = "";

        for (int i=strNumber.length()-1; i>=0; i--) {
            reverseStr += strNumber.charAt(i);
        }

        return Integer.parseInt(reverseStr);
    }
}
