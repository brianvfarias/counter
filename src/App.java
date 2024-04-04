import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inser n1: ");
        int n1 = scan.nextInt();
        System.out.println("Insert n2: ");
        int n2 = scan.nextInt();
        scan.close();
        try {
            count(n1, n2);
        } catch (InvalidSecondParameterException | NegativeParameterException e) {
            System.err.println(e);
        }
    }

    public static void count(int n1, int n2) throws InvalidSecondParameterException, NegativeParameterException {
        if (n1 < 0 || n2 < 0) {
            throw new NegativeParameterException("Count does not accept negative parameters");
        }
        if (n1 >= n2) {
            throw new InvalidSecondParameterException("The second parameter can't be less than the first parameter");
        }
        for (int i = 0; i < (n2 - n1); i++) {
            System.out.println("Counting up to " + (n2 - n1));
            System.out.println("We're at: " + (i + 1));
        }
    }
}
