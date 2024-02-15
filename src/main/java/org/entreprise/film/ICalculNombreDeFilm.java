package org.entreprise.film;

import java.util.Map;

public interface ICalculNombreDeFilm {

     long nombreAutresFilms(Map<String, Integer> films) ;
     int nombreDeVoletsTotal(Map<String, Integer> films);
     long nombreDeVoletsDifferents(Map<String, Integer> films);
}
