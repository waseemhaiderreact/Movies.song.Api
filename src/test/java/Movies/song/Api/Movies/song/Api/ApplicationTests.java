package Movies.song.Api.Movies.song.Api;

import Movies.song.Api.Movies.song.Api.api.Movies;
import Movies.song.Api.Movies.song.Api.api.moviesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class ApplicationTests {


	@Test
	void contextLoads() {
	}
	@Autowired
	 moviesRepository moviesRepository;
	@Test
	void isMoviesExits(){
		Movies movies=new Movies(27L,"Time Travel");
		moviesRepository.save(movies);

		Boolean actualResult= moviesRepository.existsById(27L);
		assertThat(actualResult).isTrue();
		System.out.println("Hello Haider");
	}
}
