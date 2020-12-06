import java.math.BigInteger;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger numA = new BigInteger(scanner.next());
        BigInteger numB = new BigInteger(scanner.next());
        BigInteger numC = new BigInteger(scanner.next());
        BigInteger numD = new BigInteger(scanner.next());

        System.out.println(numB.multiply(numA.negate()).add(numC).subtract(numD));
    }
}