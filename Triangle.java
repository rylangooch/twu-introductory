import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a number: ");
        int input = Integer.parseInt(sc.nextLine());

        for(int x = 0; x < input; x++) {
            System.out.print("*");
        }

    }
}