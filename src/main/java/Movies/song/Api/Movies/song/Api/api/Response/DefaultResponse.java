package Movies.song.Api.Movies.song.Api.api.Response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class DefaultResponse {

    private String responseCode;
    private String Description;
    private String identifier;

    public DefaultResponse(String responseCode, String description, String identifier) {
        this.responseCode = responseCode;
        Description = description;
        this.identifier = identifier;
    }
}
