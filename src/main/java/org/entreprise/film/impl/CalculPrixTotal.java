package org.entreprise.film.impl;

import org.entreprise.film.ICalculNombreDeFilm;
import org.entreprise.film.ICalculPrixTotal;
import org.entreprise.film.IFormatter;

import java.util.Map;

public class CalculPrixTotal implements ICalculPrixTotal {
    private static final int PRIX_BACK_TO_THE_FUTURE = 15;
    private static final int PRIX_FILM = 20;
    private static final double REDUCTION_10_POURCENT = 0.9;
    private static final double REDUCTION_20_POURCENT = 0.8;

    private final ICalculNombreDeFilm calculNombreDeFilm;
    private final IFormatter formatter;

    public CalculPrixTotal(ICalculNombreDeFilm calculNombreDeFilm, IFormatter formatter) {
        this.calculNombreDeFilm = calculNombreDeFilm;
        this.formatter = formatter;
    }

    public double calculerPrixTotal(String input) {
        Map<String, Integer> panier = formatter.extraireFilm(input);
        long nombreDeVoletsDifferents = calculNombreDeFilm.nombreDeVoletsDifferents(panier);
        long nombreAutresFilms = calculNombreDeFilm.nombreAutresFilms(panier);
        int nombreDeVoletsTotal = calculNombreDeFilm.nombreDeVoletsTotal(panier);
        double pourcentage = 1;
        if (nombreDeVoletsDifferents == 2) {
            pourcentage = REDUCTION_10_POURCENT;
        } else if (nombreDeVoletsDifferents >= 3) {
            pourcentage = REDUCTION_20_POURCENT;
        }
        return (pourcentage * PRIX_BACK_TO_THE_FUTURE * nombreDeVoletsTotal) + (nombreAutresFilms * PRIX_FILM);
    }
}
