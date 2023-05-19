package Movies.song.Api.Movies.song.Api.api;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String SongName;
    String songTitle;
    String profileImage;
    @Lob
    Byte[] songImage;
}
