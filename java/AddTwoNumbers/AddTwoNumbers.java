import java.util.LinkedList;
import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args){
        LinkedList<Integer> l1 = getListFromNumber(55);
        LinkedList<Integer> l2 = getListFromNumber(110);

        int result = getNumberFromList(l1) + getNumberFromList(l2);

        System.out.println(getListFromNumber(reverseNumber(result)));
    }

    static LinkedList getListFromNumber(int number) {
        LinkedList<Integer> listNumber = new LinkedList();

        String strNumber = Integer.toString(number);

        for (int i=0; i < strNumber.length(); i++) {
            listNumber.add(Character.getNumericValue(strNumber.charAt(i)));
        }

        return listNumber;
    }

    static int getNumberFromList(LinkedList listNumber) {
        String strNumber = "";

        for (int i=0; i < listNumber.size(); i++) {
            strNumber += listNumber.get(i);
        }

        return Integer.parseInt(strNumber);
    }

    static int reverseNumber(int number) {
        String strNumber = Integer.toString(number);
        String reverseStr = "";

        for (int i=strNumber.length()-1; i >= 0; i--) {
            reverseStr += strNumber.charAt(i);
        }

        return Integer.parseInt(reverseStr);
    }
}
