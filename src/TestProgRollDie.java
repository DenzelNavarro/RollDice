import java.util.*;

public class TestProgRollDie {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        RollDie die1 = new RollDie();
        RollDie die2 = new RollDie();

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);

        System.out.println("After rolling die 1: " + die1.roll());
        System.out.println("After rolling die 2: " + die2.roll());

        System.out.println("Sum of the numbers rolled by the dice is: " + (die1.getNum() + die2.getNum()));

        System.out.println("After rolling again, the sum of the numbers rolled is: " + (die1.roll() + die2.roll()));
    }
}
