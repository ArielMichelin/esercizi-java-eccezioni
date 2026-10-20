public class Main {

    private static final int DIFFICOLTA_MISSIONE = 75;
    private static final int TENTATIVI = 5;

    public static void main(String[] args) {
        Reclutatore reclutatore = new Reclutatore();
        System.out.println("Missione con difficolta' " + DIFFICOLTA_MISSIONE + "\n");

        for (int i = 1; i <= TENTATIVI; i++) {
            System.out.println("--- Tentativo " + i + " ---");
            try {
                String eroe = reclutatore.recluta(DIFFICOLTA_MISSIONE);
                System.out.println("Reclutato: " + eroe + "\n");
            } catch (EroeNonIdoneoException e) {
                System.out.println("Scartato: " + e.getNomeEroe() + " e' troppo debole (livello "
                        + e.getLivello() + " < " + DIFFICOLTA_MISSIONE + "). Prossimo candidato.\n");
            }
        }
    }
}
