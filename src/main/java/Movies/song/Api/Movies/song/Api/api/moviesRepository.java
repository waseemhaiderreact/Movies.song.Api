package Movies.song.Api.Movies.song.Api.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface moviesRepository extends JpaRepository<Movies,Long> {

    Movies findMoviesById(@Param("id") Long id);
}
