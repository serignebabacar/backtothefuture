package org.entreprise.film.impl;

import org.entreprise.film.ICalculNombreDeFilm;

import java.util.Map;

public class CalculNombreDeFilm implements ICalculNombreDeFilm {

    private static final String BACK_TO_THE_FUTURE = "Back to the Future";

    @Override
    public long nombreAutresFilms(Map<String, Integer> films) {
        return films
                .entrySet()
                .stream()
                .filter(s -> !s.getKey().contains(BACK_TO_THE_FUTURE))
                .mapToInt(Map.Entry::getValue)
                .sum();
    }

    @Override
    public int nombreDeVoletsTotal(Map<String, Integer> films) {
        return films
                .entrySet()
                .stream()
                .filter(s -> s.getKey().startsWith(BACK_TO_THE_FUTURE))
                .mapToInt(Map.Entry::getValue)
                .sum();
    }

    @Override
    public long nombreDeVoletsDifferents(Map<String, Integer> films) {
        return films
                .keySet()
                .stream()
                .filter(s -> s.startsWith(BACK_TO_THE_FUTURE))
                .count();
    }
}
