package org.entreprise.film;

import java.util.Map;

public interface IFormatter {

    /**
     * Méthode pour extraire les films contenus dans l'input vers un Map<String , Integer>.
     *
     * @param input Le text contenant les films passés en input.
     * @return Le Map<String , Integer> avec comme cle le film et comme value le nombre d'occurence du film dans l'input.
     */
    Map<String, Integer> extraireFilm(String input);
}
