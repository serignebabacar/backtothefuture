package org.entreprise.film;

import java.util.Map;

public interface ICalculNombreDeFilm {

    /**
     * Méthode pour calculer le nombre d'autres films.
     *
     * @param films les films achetés sous forme de Map<String , Integer> .
     * @return Le nombre d'autres films.
     */
    long nombreAutresFilms(Map<String, Integer> films);

    /**
     * Méthode pour calculer le nombre de Volets Total acheté
     *
     * @param films les films achetés sous forme de Map<String , Integer> .
     * @return Le nombre de volets total
     */
    long nombreDeVoletsTotal(Map<String, Integer> films);

    /**
     * Méthode pour calculer le nombre de Volets Différents acheté.
     *
     * @param films les films achetés sous forme de Map<String ,Integer> .
     * @return Le nombre de volets Différents de la saga  pour l'application de la reduction .
     */
    long nombreDeVoletsDifferents(Map<String, Integer> films);
}
