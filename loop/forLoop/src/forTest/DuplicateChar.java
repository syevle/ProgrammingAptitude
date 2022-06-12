package forTest;

public class DuplicateChar {
    public static void main(String[] args) {

        String str = new String("Microsofft");
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");

        /*
         *  initialized a for-loop with two counters
         *  to compare if character at i index and i+1 index
         *  are equal or not. It will print the characters
         *  if they are equal.
         */

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    count++;
                    break;
                }

            }
        }
    }
}
