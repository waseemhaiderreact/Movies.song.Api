package Movies.song.Api.Movies.song.Api.api;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String movieName;
    Date moviesReleaseDate;

    @Lob
    byte[] images;

    public Movies(String movieName,Date moviesReleaseDate) {
        this.movieName = movieName;
        this.moviesReleaseDate = moviesReleaseDate;
    }

    public Movies(Long id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

//    @OneToMany
//    private List<Song> songList;
}
