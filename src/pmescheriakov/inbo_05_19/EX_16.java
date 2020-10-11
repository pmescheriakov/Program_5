package pmescheriakov.inbo_05_19;

import java.util.Scanner;

public class EX_16 {
    public static int EX__16(int max, int number) {
        int n;

        Scanner in = new Scanner(System.in);

        if (max == 0) {
            max = in.nextInt();
        } else {
            n = in.nextInt();

            if (n == 0) {
                return number;
            }

            if (n == max) {
                ++number;
            }

            if (n > max) {
                max = n;
                number = 0;
            }
        }

        return EX__16(max, number);
    }
}