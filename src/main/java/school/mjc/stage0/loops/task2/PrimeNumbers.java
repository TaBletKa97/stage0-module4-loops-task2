package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            boolean isSimple = true;
            for (int i = 2; i < printToInclusive; i++) {
                if (counter % i == 0 && counter != i) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println(counter);
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        new PrimeNumbers().printPrimeNumbers(33);
    }
}
