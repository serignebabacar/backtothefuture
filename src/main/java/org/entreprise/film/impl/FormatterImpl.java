package org.entreprise.film.impl;

import org.entreprise.film.IFormatter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FormatterImpl implements IFormatter {
    @Override
    public Map<String, Integer> extraireFilm(String input) {
        Map<String, Integer> films = new HashMap<>();
        String[] split = input.split("\\n");
        Arrays.stream(split)
                .filter(s -> !s.isBlank())
                .forEach(
                        s -> {
                            String key = s.trim();
                            films.put(key, films.getOrDefault(key, 0) + 1);
                        }
                );
        return films;
    }
}
