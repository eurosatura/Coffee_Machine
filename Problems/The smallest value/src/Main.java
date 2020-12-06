import java.util.Scanner;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        // put your code here
        printBigIntegerResult();

    }

    public static void printBigIntegerResult() {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigM = scanner.nextBigInteger();
        BigInteger i = BigInteger.ONE;
        BigInteger result = BigInteger.ONE;

        while (result.compareTo(bigM) == -1) {
            i = i.add(BigInteger.ONE);
            result = result.multiply(i);
        }
        System.out.println(i);
    }

    public static void test() {
        BigInteger number = BigInteger.ONE;

        number = number.add(BigInteger.ONE);
        System.out.println(number);
    }

    public static void printIntegerResult() {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigM = scanner.nextBigInteger();
        long i = 1;
        long result = 1;

        while (BigInteger.valueOf(result).compareTo(bigM) == -1) {
            i++;
            result *= i;
        }
        System.out.println(i);
    }
}