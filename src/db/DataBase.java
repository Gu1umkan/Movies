package db;

import models.Actor;
import models.Movie;
import models.Producer;
import models.enums.Genre;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataBase {
    private Actor actor1 = new Actor(1, "Daniel Radcliffe", "Harry Potter");
    private Actor actor2 = new Actor(2, "Adrian Rawlins", "James Potter");
    private Actor actor3 = new Actor(3, "Geraldine Somerville", "Lily Potter");
    private Actor actor4 = new Actor(4, "Саят Исембаев", "Саян");
    private Actor actor5 = new Actor(5, "Аружан Джазильбекова", "Альбина");
    private Actor actor6 = new Actor(6, "Жан Байжанбаев", "Жан");
    private Actor actor7 = new Actor(7, "Альмира Турсын", "Томирис");
    private Actor actor8 = new Actor(8, "Адиль Ахметов", "Аргун");
    private Actor actor9 = new Actor(9, "Еркебулан Дайыров", "Харасп");
    private Actor actor10 = new Actor(10, "Жамал Сейдакматова", "Курманжан Датка");
    private Actor actor11 = new Actor(11, "Азиз Мурадилаев", "Алымбек Датка");
    private Actor actor12 = new Actor(12, "Адилет Усубалиев", "Камчыбек");
    private Producer producer1 = new Producer(2, "Садык", "Шер-Нияз");
    private Producer producer2 = new Producer(1, "David", "Heyman");
    private Producer producer3 = new Producer(3, "Акан", "Сатаев");

    public List<Movie> movies = new LinkedList<>(
            Arrays.asList(new Movie(1, "Harry Potter", Year.of(2001), Genre.FANTASY, producer2, Arrays.asList(actor1, actor2, actor3)),
            new Movie(2, "Курманжан Датка", Year.of(2019), Genre.ROMANCE, producer1, Arrays.asList(actor10, actor11, actor12)),
            new Movie(3, "Томирис", Year.of(2019), Genre.DRAMA, producer3, List.of(actor7, actor8, actor9)),
            new Movie(4, "Рэкетир", Year.of(2007), Genre.COMEDY, producer3, List.of(actor4, actor5, actor6))));
}
