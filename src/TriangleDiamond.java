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
        TD.printIsosceles(3);
        TD.printDiamond(3);
        TD.printDiamondWithName(3);
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

    private void printIsosceles(int n) {
        for(int i = 0; n > i; i++) {
            for(int y = n - 1; y > i; y--) {
                System.out.print(" ");
            }
            for(double x = -0.5; x < i; x += 0.5) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void printDiamond(int n) {
        for (int i = 1 - n; i <= n; i++) {
            for (int j = 1-n; j <= n; j++) {
                if (Math.abs(i) + Math.abs(j) <= n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void printDiamondWithName(int n) {
        for (int i = 1 - n; i <= n; i++) {
            if (i == 0) {
                System.out.println("Rylan");
            } else {
                for (int j = 1 - n; j <= n; j++) {
                    if (Math.abs(i) + Math.abs(j) <= n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}

