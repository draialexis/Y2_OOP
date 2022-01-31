package poo.tp.premierspas;

public class Personne {
    // 1)

    private String name;
    private String surname;
    private char gender;
    private Date dob;

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setSurname(String surname) throws IllegalAccessException {
        if (gender == 'f') {
            this.surname = surname;
        } else {
            throw new IllegalAccessException("male individuals can't change their surnames");
        }
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

    void marry(Personne p, Date d) throws IllegalAccessException {
        if (p.getDob().compareTo(d) >= 0 || dob.compareTo(d) >= 0) {
            throw new IllegalArgumentException("someone's date of birth is posterior or equal to their wedding date");
        }
        p.setMarried(true);
        String tmp = p.getSurname();
        if (p.getGender() == 'f') {
            p.setSurname(this.surname);
        }
        if (gender == 'f') {
            this.surname = tmp;
        }
        this.married = true;
        p.setWeddingDate(d);
        this.weddingDate = d;
    }

    public Personne(String name, String surname, char gender, Date dob, Personne mother, Personne father) {
        this(name, surname, gender, dob, false, null, mother, father);
    }

    public Personne(String name, String surname, char gender, Date dob) {
        this(name, surname, gender, dob, false, null, null, null);
    }

    public Personne(String name, String surname, char gender, Date dob, boolean married, Date weddingDate,
                    Personne mother, Personne father) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dob = dob;
        this.married = married;
        this.weddingDate = weddingDate;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Personne{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", dob=" + dob + ", married="
                + married + ", weddingDate=" + weddingDate + ", parent_1=" + mother + ", parent_2=" + father + '}';
    }

    // ex5, 1)

    Personne mother;
    Personne father;

    public Personne getMother() {
        return mother;
    }

    public Personne getFather() {
        return father;
    }

    // 2)

    boolean isSibling(Personne p) {
        return (((p.mother != null && this.mother != null) || (p.father != null && this.father != null))
                && (this.mother == p.mother || this.father == p.father));
    }

    // 3)
    // goddamnit
}
