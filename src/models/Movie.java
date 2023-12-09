package models;

import models.enums.Genre;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

public class Movie {
    private long id;
    private String name;
    private Year year;
    private Genre genre;
    private Producer producer;
    private List<Actor> actors = new LinkedList<>();

    public Movie(long id, String name, Year year, Genre genre, Producer producer, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actors = actors;
    }

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(LinkedList<Actor> actors) {
        this.actors = actors;
    }


    @Override
    public String toString() {
        return STR."Movie: " +
                "id: " + id +"    "+
                "name: " + name + "    "+
                "year: " + year +"     "+
                "genre: " + genre +
                "\n" + producer +
                "\n" + actors+"\n";
    }
}
