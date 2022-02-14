package poo.tp.tp3;

import java.util.Objects;

enum couleur
{
    PIQUE, COEUR, CARREAU, TREFLE
}

public class Carte implements Comparable
{
    private final int valeur;
    private final couleur couleur;

    Carte(int valeur, couleur couleur)
    {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int getValeur()
    {
        return this.valeur;
    }

    couleur getCouleur()
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
    public int compareTo(Object o)
    {
        if (this.equals(o)) return 0;
        Carte carte = (Carte) o;
        if (this.valeur < carte.valeur) return -1;
        if (this.valeur > carte.valeur) return 1;
        if (this.couleur == poo.tp.tp3.couleur.PIQUE) return 1;
        if (carte.couleur == poo.tp.tp3.couleur.PIQUE) return -1;
        if (this.couleur == poo.tp.tp3.couleur.TREFLE) return -1;
        if (carte.couleur == poo.tp.tp3.couleur.TREFLE) return 1;
        if (this.couleur == poo.tp.tp3.couleur.CARREAU) return 1;
        System.out.println("This should never have happened (compareTo(), Carte)");
        return 42;//this shouldn't be possible
    }
}
