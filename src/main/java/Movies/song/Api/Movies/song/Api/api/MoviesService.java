package Movies.song.Api.Movies.song.Api.api;

import Movies.song.Api.Movies.song.Api.api.Request.addMoviesRequest;
import Movies.song.Api.Movies.song.Api.api.Response.DefaultResponse;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class MoviesService {

    @Autowired
    moviesRepository moviesRepository;

    private static final Logger logger = LoggerFactory.getLogger(MoviesController.class);
    DefaultResponse addMovie(addMoviesRequest request){
        DefaultResponse defaultResponse=null;

        try {

            Movies movies=new Movies(request.getMovies().getMovieName(),new Date());
            moviesRepository.save(movies);
            logger.warn("Hi My name is Muhammad Waseem Haider");
            logger.error("hi error");
            logger.info("my name is info what is learning today");
            defaultResponse=new DefaultResponse("200","student has been added","Successful");

        }catch (Exception e){
            defaultResponse=new DefaultResponse("500","student has been not added","Failed");
        }
        return defaultResponse;
    }


    void addPicMovies(MultipartFile file,Long id) throws IOException {

        byte[] imageArr=file.getBytes();

        Movies movies=moviesRepository.findMoviesById(id);

        movies.setImages(imageArr);

        moviesRepository.save(movies);
    }
    List<Movies> fetchallmovies(){
        return moviesRepository.findAll();
    }
}
