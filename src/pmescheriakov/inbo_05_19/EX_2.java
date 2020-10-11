package pmescheriakov.inbo_05_19;

public class EX_2 {
    public static int EX__2(int n, int depth) {
        if (depth == 0) {
            return 0;
        }

        int temp = n - depth + 1;


        System.out.println(temp);

        return EX__2(n, depth - 1);
    }
}
