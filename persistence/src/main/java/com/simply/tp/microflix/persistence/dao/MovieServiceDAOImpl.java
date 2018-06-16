package com.simply.tp.microflix.persistence.dao;

import com.simply.tp.microflix.persistence.entities.Address;
import com.simply.tp.microflix.persistence.entities.Film;
import com.simply.tp.microflix.persistence.entities.FilmList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by shreeharshashet on 2/7/18.
 */
@Component
public class MovieServiceDAOImpl implements MovieSeviceDAO {
    protected Logger logger = LoggerFactory.getLogger(MovieServiceDAOImpl.class);

    @PersistenceContext
    EntityManager em;

    @Override
    public List<FilmList> searchFilmsByTitle(String title) {

        logger.debug("searchFilmsByTitle called with " +title);

        Query qry = em.createNamedQuery("FilmList.findByTitle");
        qry.setParameter("title","%"+title+"%");
        qry.setHint("org.hibernate.cacheable", true);
        return qry.getResultList();
    }

    @Override
    public Film getFileById(int fid){
        logger.debug("getFileById called with " + fid);
        return em.find(Film.class,fid);
    }

    public Address getAnAddres(int addressId){
        return em.find(Address.class,addressId);
    }
}
