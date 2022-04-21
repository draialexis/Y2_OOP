package poo.tp.premierspas;

public final class Homme extends Personne
{

    public Homme(String lastName,
                 String firstName,
                 Date weddingDate,
                 Personne spouse,
                 Date dob,
                 Personne p1,
                 Personne p2)
    {
        super(lastName, firstName, weddingDate, spouse, dob, p1, p2);
    }

    @Override
    public void setLastName(String lastName)
    {
        throw new UnsupportedOperationException("Males can't change names");
    }
}
