package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        if (power < 0) {
            System.out.println("too much power");
        }
        while (counter <= power) {
            System.out.println((int) Math.pow(2, counter++));
        }
    }

    public static void main(String[] args) {
        new PowerOfTwo().printPower(4);
    }
}
