package org.entreprise.film;

public interface ICalculPrixTotal {

    /**
     * Méthode pour calculer le prix total .
     * Cette méthode applique une réduction de 10% pour l'achat de 2 volets DIFFÉRENTS de la saga
     * et une réduction de 20% , pour l'achat de 3 volets DIFFÉRENTS de la saga .
     *
     * @param input Le text contenant les films passés en input.
     * @return Le prix final après l'application de la promotion.
     */
    double calculerPrixTotal(String input);
}
