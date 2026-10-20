import net.datafaker.Faker;

public class Reclutatore {

    private final Faker faker = new Faker();

    public String recluta(int difficoltaMissione) throws EroeNonIdoneoException {
        String nome = faker.superhero().name();
        int potere = faker.number().numberBetween(1, 101); // estremo superiore escluso -> 1..100

        System.out.println("Candidato: " + nome + " | potere: " + potere);

        if (potere < difficoltaMissione) {
            throw new EroeNonIdoneoException(nome, potere);
        }
        return nome;
    }
}
