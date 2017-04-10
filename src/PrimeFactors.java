import java.util.ArrayList;

/**
 * Created by rylangooch on 10/04/2017.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        PrimeFactors PM = new PrimeFactors();
        PM.generate(30);
    }

    public void generate(int n) {
        ArrayList<Integer> Prime = new ArrayList<>();
        for(int x = 2; x <= n/2; x++) {
            if (n % x == 0) { Prime.add(x); }
        }
        System.out.println(Prime);
    }
}
