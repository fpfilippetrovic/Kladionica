
public class KazinoProgram {
    public static void main(String[] args) {
        Kazino kazino = new Kazino(
                new Kladionicar[]{
                        new Kladionicar("Pera", "poker", 15000),
                        new Kladionicar("Zika", "ajnc", 17000),
                        new Kladionicar("Mika", "rulet", -1500),
                        new Kladionicar("Bora", "poker", 22000)}
        );
        System.out.println(kazino);
        System.out.println("Najprofitabilnija igra trenutno je " +
                kazino.najprofitabilnijaIgra() + ".");
    }
}
