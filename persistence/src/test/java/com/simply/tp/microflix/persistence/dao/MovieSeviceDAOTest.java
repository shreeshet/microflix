package com.simply.tp.microflix.persistence.dao;

import com.simply.tp.microflix.persistence.entities.Film;
import com.simply.tp.microflix.persistence.entities.FilmList;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by shreeharshashet on 6/16/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MovieSeviceDAOTest {

    @Autowired
    MovieSeviceDAO movieSeviceDAO;

    @Test
    @Ignore
    public void testSearchFilmsByTitle() throws Exception {
        List<FilmList> res = movieSeviceDAO.searchFilmsByTitle("gandhi");
    }

    @Test
    @Ignore
    public void testGetFileById() throws Exception {
        Film res = movieSeviceDAO.getFileById(100);
    }

    @Test
    public void testGetAnAddres() throws Exception {
        movieSeviceDAO.getAnAddres(1);
    }
}