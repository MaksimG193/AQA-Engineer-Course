package Java;
//Task 6
import java.util.Scanner;
public class NumPosOrNeg {

    public static void numPosOrNeg(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательно");
        }

    }
}
