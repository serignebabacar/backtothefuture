package org.entreprise.film.impl;

import org.entreprise.film.IFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormatterTest {
    private final IFormatter formatter = new Formatter();

    @Test
    void testNombreDeFilmApresExtraction() {
        String input = """
                Back to the Future 1
                                
                Back to the Future 2
                                
                Back to the Future 3
                                
                La chèvre
                La chèvre
                """;
        Assertions.assertEquals(formatter.extraireFilm(input).get("La chèvre"), 2);
    }
}