public class EroeNonIdoneoException extends Exception {

    private final String nomeEroe;
    private final int livello;

    public EroeNonIdoneoException(String nomeEroe, int livello) {
        super("Eroe non idoneo: " + nomeEroe + " (livello " + livello + ")");
        this.nomeEroe = nomeEroe;
        this.livello = livello;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public int getLivello() {
        return livello;
    }
}
