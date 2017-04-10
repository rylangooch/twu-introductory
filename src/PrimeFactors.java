import java.util.ArrayList;

/**
 * Created by rylangooch on 10/04/2017.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(generate(30));
    }

    public static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> Prime = new ArrayList<>();
        for (int x = 2; x <= n; x++) {
            if (n % x == 0) {
                Prime.add(x);
                n /= x;
            }
        }
        return Prime;
    }
}
