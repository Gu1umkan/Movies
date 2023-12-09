package service.impl;

import db.DataBase;
import models.Movie;
import service.SortAble;

import java.util.*;

public class MovieSortImpl implements SortAble {
    DataBase db = new DataBase();

    @Override
    public List<Movie> sortByMovieName(String ascOrDesc) {
        Comparator<Movie> movieNameComparator = Comparator.comparing(Movie::getName);
        boolean isAsc = ascOrDesc.toLowerCase().contains("asc");
        db.movies.sort(isAsc ? movieNameComparator : movieNameComparator.reversed());
        return db.movies;
    }

    @Override
    public List<Movie> sortByYear(String ascOrDesc) {
        Comparator<Movie> movieYear = Comparator.comparing(Movie::getYear);
        if (ascOrDesc.toLowerCase().contains("asc")) {
            db.movies.sort(movieYear);
            return db.movies;
        } else if (ascOrDesc.toLowerCase().contains("desc")) {
            db.movies.sort(movieYear.reversed());
            return db.movies;
        }
        return null;
    }


    public static Comparator<Movie> comparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getProducer().getFirstName().compareTo(o2.getProducer().getLastName());
        }
    };
    @Override
    public List<Movie> sortByProducer(String ascOrDesc) {
        boolean isAsc = ascOrDesc.toLowerCase().contains("asc");
        db.movies.sort( isAsc ? comparator : comparator.reversed());
        return db.movies;
    }
}
