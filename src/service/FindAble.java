package service;

import models.Movie;
import models.enums.Genre;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

public interface FindAble {
    List<Movie> getAllMovies();
    Movie findMovieByNameOrPartName(String name);
    Movie findMovieByActorName(String actorName);
    Movie findMovieByYear(Year  year);
    Movie findMovieByProducer(String producerName);
    Movie findMovieByGenre(Genre genre);
    Movie findMovieByRole(String role);

}
