package Java;

//Task9
public class Task9 {
    public static void main(String[] args) {
        new Task9().highYear()

    }


    private boolean highYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
