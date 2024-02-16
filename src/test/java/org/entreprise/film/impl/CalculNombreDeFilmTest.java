package org.entreprise.film.impl;

import org.entreprise.film.ICalculNombreDeFilm;
import org.entreprise.film.IFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculNombreDeFilmTest {

    private final ICalculNombreDeFilm calculNombreDeFilm = new CalculNombreDeFilm();
    private final IFormatter formatter = new Formatter();
    private final String input = """
            Back to the Future 1
                            
            Back to the Future 2
                            
            Back to the Future 3
                            
            La chèvre
            La chèvre
            """;

    @Test
    void testNombreAutresFilms() {
        Assertions.assertEquals(calculNombreDeFilm.nombreAutresFilms(formatter.extraireFilm(input)), 2);
    }

    @Test
    void testNombreDeVoletsTotal() {
        Assertions.assertEquals(calculNombreDeFilm.nombreDeVoletsTotal(formatter.extraireFilm(input)), 3);
    }

    @Test
    void testNombreDeVoletsDifferents() {
        Assertions.assertEquals(calculNombreDeFilm.nombreDeVoletsDifferents(formatter.extraireFilm(input)), 3);
    }
}