public class Main {

    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(100.0);

        // Scenario 1: prelievo eccessivo (checked exception + finally)
        System.out.println("--- Scenario 1: prelievo eccessivo ---");
        try {
            conto.preleva(250.0);
            System.out.println("Prelievo riuscito");
        } catch (SaldoInsufficienteException e) {
            System.out.println("Errore: " + e.getMessage());
            System.out.println("Mancano " + e.getDeficit() + " euro");
        } finally {
            System.out.println("Fine operazione. Saldo attuale: " + conto.getSaldo());
        }

        // Scenario 2: prelievo negativo (unchecked exception)
        System.out.println("\n--- Scenario 2: prelievo negativo ---");
        try {
            conto.preleva(-50.0);
            System.out.println("Prelievo riuscito");
        } catch (ImportoNonValidoException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (SaldoInsufficienteException e) {
            // il compilatore richiede di gestire la checked exception dichiarata nella firma
            System.out.println("Errore: " + e.getMessage());
        }

        // Scenario 3: prelievo valido
        System.out.println("\n--- Scenario 3: prelievo valido ---");
        try {
            conto.preleva(40.0);
            System.out.println("Prelievo completato. Nuovo saldo: " + conto.getSaldo());
        } catch (SaldoInsufficienteException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
