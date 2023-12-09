package service;

import models.Movie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface SortAble {
    List< Movie> sortByMovieName(String ascOrDesc);
    List< Movie> sortByYear(String ascOrDesc);
    List< Movie> sortByProducer(String ascOrDesc);

}
