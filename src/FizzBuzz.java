/**
 * Created by rylangooch on 10/04/2017.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz FB = new FizzBuzz();
        for (int x = 1; x <= 100; x++) {
            FB.go(x);
        }
    }

    private void go(int n) {
        if (DivisableByThreeAndFive(n)) {
            System.out.println("FizzBuzz");
        } else if(DivisableByThree(n)) {
            System.out.println("Fizz");
        } else if (DivisableByFive(n)) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }

    private boolean DivisableByThreeAndFive(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    private boolean DivisableByThree(int num) {
        return num % 3 == 0;
    }

    private boolean DivisableByFive(int num) {
        return num % 5 == 0;
    }
}
