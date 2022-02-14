package poo.tp.tp3;

import java.util.ArrayList;

public class Paquet
{
    ArrayList<Carte> cartes;

    public void ajouter(Carte carte)
    {
        // check that not duplicate?
        this.cartes.add(carte);
    }

    public void ajouter(int valeur, Couleur couleur)
    {
        // check that not duplicate?
        Carte carte = new Carte(valeur, couleur);
        this.cartes.add(carte);
    }

    public Carte retirer(Carte carte)
    {
        this.cartes.remove(carte);
        return carte;
    }
}
