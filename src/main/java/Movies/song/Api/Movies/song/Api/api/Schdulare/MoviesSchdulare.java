package Movies.song.Api.Movies.song.Api.api.Schdulare;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MoviesSchdulare {
    private static final Logger logger = LoggerFactory.getLogger(MoviesSchdulare.class);
    public void logLevelDisplay () {
        logger.error("Error message");
        logger.warn("Warning message");
        logger.info("Info message");
        logger.debug("Debug message");
        logger.trace("Trace message");
    }

}
