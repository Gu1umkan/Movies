package service.impl;

import db.DataBase;
import models.Actor;
import models.Movie;
import models.enums.Genre;
import service.FindAble;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

public class MovieFindImpl implements FindAble {
    private DataBase db;

    public MovieFindImpl() {
        db = new DataBase();
    }

    @Override
    public List<Movie> getAllMovies() {
        return db.movies;
    }

    @Override
    public Movie findMovieByNameOrPartName(String name) {
        for (Movie movie : db.movies) {
            if (movie.getName().equalsIgnoreCase(name)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByActorName(String actorName) {
        for (Movie movie : db.movies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getRole().equalsIgnoreCase(actorName)) {
                    return movie;
                }
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByYear(Year year) {
        for (Movie movie : db.movies) {
            if (movie.getYear().equals(year)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByProducer(String producerName) {
        for (Movie movie : db.movies) {
            if (movie.getProducer().getFirstName().equalsIgnoreCase(producerName)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByGenre(Genre genre) {
        System.out.println("GENRE : \n "+Genre.values());
        for (Movie movie : db.movies) {
            if (movie.getGenre().equals(genre)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByRole(String role) {
        for (Movie movie :db.movies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getRole().equalsIgnoreCase(role)) {
                    return movie;
                }
            }
        }return null;
    }
}
