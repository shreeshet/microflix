package com.simply.tp.microflix.movieservice.controller;

import com.simply.tp.microflix.movieservice.service.MovieServiceImpl;
import com.simply.tp.microflix.persistence.entities.Film;
import com.simply.tp.microflix.persistence.entities.FilmList;
import com.simply.tp.microflix.persistence.entities.Address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shreeharshashet on 2/6/18.
 */
@RestController
public class MoviesSearchController {
    protected Logger logger = LoggerFactory.getLogger(MoviesSearchController.class);


    @Autowired
    MovieServiceImpl movieService;


    @RequestMapping(value="/hello/{name}",method=RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+ name;
    }

    @RequestMapping(value="/movie/title/{titleLike}",method=RequestMethod.GET)
    public List<FilmList> searchsearchFilmsByTitle(@PathVariable("titleLike") String titleLike){

        List<FilmList> retList = movieService.searchFilmsByTitle(titleLike);

        logger.debug("got * *********** "+ retList.size());

        return  retList;
    }

    @RequestMapping(value="/movie/{fid}",method=RequestMethod.GET)
    public Film getFilmById(@PathVariable("fid")int fid){
        return movieService.getFilmById(fid);
    };

    @RequestMapping(value="/address/{addressId}",method=RequestMethod.GET)
    public Address getAnAddres(@PathVariable("addressId")int addressId){
        return movieService.getAnAddres(addressId);
    }
}
