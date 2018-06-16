package com.simply.tp.microflix.movieservice.service;



import com.simply.tp.microflix.persistence.entities.Address;
import com.simply.tp.microflix.persistence.entities.Film;
import com.simply.tp.microflix.persistence.entities.FilmList;

import java.util.List;

/**
 * Created by shreeharshashet on 2/6/18.
 */
public interface MovieService {
    List<FilmList> searchFilmsByTitle(String title);

    Address getAnAddres(int addressId);

    Film getFilmById(int filmId);
}
