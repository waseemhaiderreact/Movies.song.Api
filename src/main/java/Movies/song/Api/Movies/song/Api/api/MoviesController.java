package Movies.song.Api.Movies.song.Api.api;

import Movies.song.Api.Movies.song.Api.api.Request.addMoviesRequest;
import Movies.song.Api.Movies.song.Api.api.Response.DefaultResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
public class MoviesController {
    private static final Logger logger = LoggerFactory.getLogger(MoviesController.class);
    @Autowired
    MoviesService service;

    @PostMapping("/add/movies")
    ResponseEntity addmovies(@RequestBody addMoviesRequest request){

        ResponseEntity responseEntity=null;

        try {
            logger.warn("hi are in movies controller ");
          DefaultResponse response=service.addMovie(request);
            responseEntity=new ResponseEntity(request.getMovies(), HttpStatus.OK);

        }catch (Exception e){
            responseEntity=new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("/all/movies")
    List<Movies> fetchallmovies(){
        log.info("fetching all movies through internet ");
        return service.fetchallmovies();
    }

    @PostMapping("/image")
    void addPicMovies(@RequestParam("file") MultipartFile file,@Param("id") Long id) throws IOException {
        service.addPicMovies(file,id);
    }

}
