public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"flower","flow","flight"};

        System.out.println(getPrefix(array));
    }

    static String getPrefix(String[] array) {
        String lPrefix = "";
        String checkPrefix = "";

        int count = 0;
        while (true) {

            if (count < array[0].length()) {
                checkPrefix += array[0].charAt(count);
            } else {
                break;
            }

            boolean isFinalyPrefix = false;

            for (int i=0; i<array.length; i++) {
                if (!array[i].startsWith(checkPrefix)) {
                    isFinalyPrefix = true;
                    break;
                }
            }

            if (isFinalyPrefix) {
                break;
            }

            count++;
            lPrefix = checkPrefix;
        }

        return lPrefix;
    }
}
