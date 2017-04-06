/**
 * Created by rylangooch on 06/04/2017.
 */
public class TriangleDiamond {

    public static void main(String[] args) {
        TriangleDiamond TD = new TriangleDiamond();
        TD.printOneAsterisk();
        TD.printHorizontalLine(8);
        TD.printVerticalLine(3);
        TD.printTriangle(3);
    }

    private void printOneAsterisk() {
        System.out.println("*");
    }

    private void printHorizontalLine(int n) {
        for(int i = 1; n > i; i++) {
            System.out.print("*");
        }
    }

    private void printVerticalLine(int n) {
        for(int i = 0; n >= i; i++) {
            System.out.println("*");
        }
    }

    private void printTriangle(int n) {
        for(int i = 1; n >= i; i++) {
            for(int x = 0; i > x; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
