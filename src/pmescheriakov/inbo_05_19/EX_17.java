package pmescheriakov.inbo_05_19;

import java.util.Scanner;

public class EX_17 {
    public static int EX__17(int max) {
        int n;

        Scanner in = new Scanner(System.in);

        if (max == 0) {
            max = in.nextInt();
        } else {
            n = in.nextInt();

            if (n == 0) {
                return max;
            }

            if (n > max) {
                max = n;
            }
        }

        return EX__17(max);
    }
}
