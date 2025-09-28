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
                    double[] addition = talInmatning(inmatning);
                    if (addition != null) {
                        String utskrift = String.format("Resultat blir: %.3g + %.3g = %.3g",
                                addition[0], addition[1], addition[0] + addition[1]);
                        Methods.visaResultatRutan(utskrift);
                    }
                    break;

                case 2:
                    double[] subtraktion = talInmatning(inmatning);
                    if (subtraktion != null) {
                        String utskrift = String.format("Resultat blir: %.3g - %.3g = %.3g",
                                subtraktion[0], subtraktion[1], subtraktion[0] - subtraktion[1]);
                        Methods.visaResultatRutan(utskrift);
                    }
                    break;

                case 3:
                    double[] multiplikation = talInmatning(inmatning);
                    if (multiplikation != null) {
                        String utskrift = String.format("Resultat blir: %.3g * %.3g = %.3g",
                                multiplikation[0], multiplikation[1], multiplikation[0] * multiplikation[1]);
                        Methods.visaResultatRutan(utskrift);
                    }
                    break;

                case 4:
                    double[] division = talInmatning(inmatning);
                    if (division != null) {
                        if (division[1] == 0) {
                            System.out.println("Fel - kan inte dividera med noll");
                        } else {
                            String utskrift = String.format("Resultat blir: %.3g / %.3g = %.3g",
                                    division[0], division[1], division[0] / division[1]);
                            Methods.visaResultatRutan(utskrift);
                        }
                    }
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