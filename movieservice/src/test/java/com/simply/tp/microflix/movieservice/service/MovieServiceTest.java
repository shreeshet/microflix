package com.simply.tp.microflix.movieservice.service;

/**
 * Created by shreeharshashet on 2/7/18.
 */


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MovieServiceTest {

    @Autowired
    MovieService movieService;

    @Test
    public void movieServiceTest(){
        movieService.searchFilmsByTitle("GANDHI");
    }

}
