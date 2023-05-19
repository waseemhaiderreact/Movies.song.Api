package Movies.song.Api.Movies.song.Api;

import Movies.song.Api.Movies.song.Api.api.MoviesController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class Application {


	private static final Logger logger = LoggerFactory.getLogger(MoviesController.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("My name is Muhammad Waseem haider");
		log.warn("You know me Who am i");
		}
}
