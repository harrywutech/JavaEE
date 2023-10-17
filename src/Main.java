// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// "static void main" must be defined in a public class.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        //System.out.print(r);

        int codes[] = {12, 33, 54, 26, 8};
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }

        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}