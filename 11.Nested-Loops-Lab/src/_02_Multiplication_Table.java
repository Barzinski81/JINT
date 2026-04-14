public class _02_Multiplication_Table {
    public static void main(String[] args) {
        for (int numberA = 1; numberA < 11; numberA++) {
            for (int numberB = 1; numberB < 11; numberB++) {
                System.out.printf("%d * %d = %d%n", numberA, numberB, numberA * numberB);
            }
        }
    }
}
