package poo.tp.tp3;

import java.util.Objects;

enum Couleur
{
    PIQUE, COEUR, CARREAU, TREFLE
}

public class Carte implements Comparable<Carte>
{
    private final int valeur;
    private final Couleur couleur;

    Carte(int valeur, Couleur couleur)
    {
        boolean isValid = false;
        for (Couleur c : Couleur.values())
        {
            if (c.name().equals(couleur.name()))
            {
                isValid = true;
                break;
            }
        }
        if (!isValid)
        {
            throw new IllegalArgumentException("yadda yadda yadda");
        }
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int getValeur()
    {
        return this.valeur;
    }

    Couleur getCouleur()
    {
        return couleur;
    }

    @Override
    public String toString()
    {
        return Integer.toString(getValeur());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return valeur == carte.valeur && couleur == carte.couleur;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(valeur, couleur);
    }

    @Override
    public int compareTo(Carte o)
    {
        if (this.equals(o)) return 0;
        if (this.valeur < o.valeur) return -1;
        if (this.valeur > o.valeur) return 1;
        if (this.couleur == poo.tp.tp3.Couleur.PIQUE) return 1;
        if (o.couleur == poo.tp.tp3.Couleur.PIQUE) return -1;
        if (this.couleur == poo.tp.tp3.Couleur.TREFLE) return -1;
        if (o.couleur == poo.tp.tp3.Couleur.TREFLE) return 1;
        if (this.couleur == poo.tp.tp3.Couleur.CARREAU) return 1;
        System.out.println("This should never have happened (compareTo(), Carte)");
        return 42;//this shouldn't be possible
    }
}
