package poo.tp.premierspas;

public class Personne {
    // 1)

    String name;
    String surname;
    Date dob;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // 2)

    boolean married;
    Date weddingDate;

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }

    void marry(Personne p, Date d) {
        if (p.getDob().compareTo(d) >= 0 || dob.compareTo(d) >= 0) {
            throw new IllegalArgumentException("someone's date of birth is posterior or equal to wedding date");
        }
        p.setMarried(true);
        p.setSurname(this.surname);
        this.married = true;
        p.setWeddingDate(d);
        this.weddingDate = d;
    }

    public Personne(String name, String surname, Date dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", married=" + married +
                ", weddingDate=" + weddingDate +
                '}';
    }
}
