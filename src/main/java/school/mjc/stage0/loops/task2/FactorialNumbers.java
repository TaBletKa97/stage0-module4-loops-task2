package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            int result = 1;
            for (int i = 1; i <= counter; i++) {
                result *= i;
            }
            System.out.println(result);
            counter++;
        }
    }
}
