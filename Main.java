import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inmatning = new Scanner(System.in);
        boolean running = true;

        while (running) {
            Meny.displayMeny();
            int val;
            try {
                val = inmatning.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Ogiltig val - ange en siffra mellan 1 till 5");
                inmatning.nextLine();
                continue;
            }
            switch (val) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 0:
                    running = false;
                    System.out.println("Kalkylatorn avslutad");
                    break;

                default:
                    System.out.println("Ogiltig val - ange en siffra mellan 1 till 5");
                    break;
            }
        }
    }

    public static double[] talInmatning(Scanner talen) {
        double forstaTalet, andraTalet;

        try {
            System.out.println("Skriv första talet och tryck på Enter");
            forstaTalet = talen.nextDouble();
            System.out.println("SKriv andra talet och tryck på Enter");
            andraTalet = talen.nextDouble();
            return new double[] { forstaTalet, andraTalet };
        } catch (InputMismatchException e) {
            System.out.println("Ogiltig inmatning - age ett tal mellan 1-5");
            talen.nextLine();
            return null;
        }

    }
}