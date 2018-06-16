package com.simply.tp.microflix.persistence.dao;

import com.simply.tp.microflix.persistence.entities.Address;
import com.simply.tp.microflix.persistence.entities.Film;
import com.simply.tp.microflix.persistence.entities.FilmList;


import java.util.List;

/**
 * Created by shreeharshashet on 2/7/18.
 */
public interface MovieSeviceDAO {
    List<FilmList> searchFilmsByTitle(String title);

    Film getFileById(int fid);

    Address getAnAddres(int addressId);
}
