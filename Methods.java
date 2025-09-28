public class Methods {
    public static void visaResultatRutan(String utskrift) {
        int längd = utskrift.length();
        String linge = "=".repeat(längd + 4);
        System.out.println(linge);
        System.out.println("| " + utskrift + " |");
        System.out.println(linge);
        System.out.println();
        
    }
}
