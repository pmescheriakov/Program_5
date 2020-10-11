package pmescheriakov.inbo_05_19;

import java.util.Scanner;

public class EX_1 {
    public static int EX__1(int A, int B) {
        if (A == B + 1) {
            return 0;
        }

        if (A > B)
        {
            int temp = A;
            A = B;
            B = temp;
        }

        System.out.println(A);

        return EX__1(A + 1, B);
    }
}
