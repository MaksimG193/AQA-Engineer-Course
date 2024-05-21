import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательно");
        }

    }
}