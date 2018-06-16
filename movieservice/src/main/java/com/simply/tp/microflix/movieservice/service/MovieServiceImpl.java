package com.simply.tp.microflix.movieservice.service;

import com.simply.tp.microflix.persistence.dao.MovieSeviceDAO;
import com.simply.tp.microflix.persistence.entities.Address;
import com.simply.tp.microflix.persistence.entities.Film;
import com.simply.tp.microflix.persistence.entities.FilmList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by shreeharshashet on 2/7/18.
 */
@Component
public class MovieServiceImpl implements MovieService{
    @Autowired
    MovieSeviceDAO movieSeviceDAO;

    @Override
    public List<FilmList> searchFilmsByTitle(String title) {
        return movieSeviceDAO.searchFilmsByTitle(title);
    }

    @Override
    public Address getAnAddres(int addressId) {
        return movieSeviceDAO.getAnAddres(addressId);
    }

    @Override
    public Film getFilmById(int filmId) {
        return movieSeviceDAO.getFileById(filmId);
    }


}
