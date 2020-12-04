import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine().toLowerCase();
        int index = string.indexOf("the");
        System.out.println(index);
    }
}