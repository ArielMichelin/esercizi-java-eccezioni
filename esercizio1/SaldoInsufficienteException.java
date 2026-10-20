public class SaldoInsufficienteException extends Exception {

    private final double saldoAttuale;
    private final double importoRichiesto;

    public SaldoInsufficienteException(double saldoAttuale, double importoRichiesto) {
        super("Saldo insufficiente: saldo " + saldoAttuale + ", richiesto " + importoRichiesto);
        this.saldoAttuale = saldoAttuale;
        this.importoRichiesto = importoRichiesto;
    }

    public double getSaldoAttuale() {
        return saldoAttuale;
    }

    public double getImportoRichiesto() {
        return importoRichiesto;
    }

    public double getDeficit() {
        return importoRichiesto - saldoAttuale;
    }
}
