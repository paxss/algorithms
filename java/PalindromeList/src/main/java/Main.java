
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,2,1};

        if (isPalindrome(array)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    static boolean isPalindrome(int[] array) {
        int j = array.length-1;
        for (int k : array) {
            if (k != array[j]) {
                return false;
            }
            j--;
        }

        return true;

    }
}