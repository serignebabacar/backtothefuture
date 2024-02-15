package org.entreprise.film.impl;

import org.entreprise.film.ICalculNombreDeFilm;
import org.entreprise.film.ICalculPrixTotal;
import org.entreprise.film.IFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculPrixTotalTest {
    private final ICalculNombreDeFilm calculNombreDeFilm = new CalculNombreDeFilm();
    private final IFormatter formatter = new FormatterImpl();
    private final ICalculPrixTotal calculPrixTotal = new CalculPrixTotal(calculNombreDeFilm, formatter);




    @Test
    void calculerPrixTotalAvec_20_POURCENT_Reduction() {
        String input = """
            Back to the Future 1
                            
            Back to the Future 2
                            
            Back to the Future 3
                            
            La chèvre
            La chèvre
            """;
        Assertions.assertEquals(calculPrixTotal.calculerPrixTotal(input), 76);
    }

    @Test
    void calculerPrixTotalAvec_10_POURCENT_Reduction() {
        String input = """
            Back to the Future 1
                            
            Back to the Future 2
                            
            La chèvre
            La chèvre
            """;
        Assertions.assertEquals(calculPrixTotal.calculerPrixTotal(input), 67);
    }
}