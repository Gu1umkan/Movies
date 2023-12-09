import models.enums.Genre;
import myException.MyException;
import service.FindAble;
import service.SortAble;
import service.impl.MovieFindImpl;
import service.impl.MovieSortImpl;

import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindAble findAble = new MovieFindImpl();
        SortAble sortAble = new MovieSortImpl();
        outLoop:
        while (true) {
            showCommands();
            switch (scanner.nextLine()) {
                case "1" -> System.out.println(findAble.getAllMovies());
                case "2" -> {
                    System.out.print("Enter name movie or part name: ");
                    System.out.println(findAble.findMovieByNameOrPartName(scanner.nextLine()));
                }
                case "3" -> {
                    System.out.print("Enter  actor's name for find movies: ");
                    System.out.println(findAble.findMovieByActorName(scanner.nextLine()));
                }
                case "4" -> {
                    System.out.print("Enter year movie:");
                    System.out.println(findAble.findMovieByYear(Year.of(new Scanner(System.in).nextInt())));
                }
                case "5" -> {
                    System.out.print("Enter producer name: ");
                    System.out.println(findAble.findMovieByProducer(scanner.nextLine()));
                }
                case "6" -> {
                    Genre[] genres = Genre.values();
                    for (int i = 0; i < genres.length; i++) {
                        System.out.println(i + 1 + "." + genres[i]);
                    }
                    System.out.print("Enter a genre: ");
                    System.out.println(findAble.findMovieByGenre(genres[new Scanner(System.in).nextInt()]));
                }
                case "7" -> {
                    System.out.print("Enter role for find movie by role: ");
                    System.out.println(findAble.findMovieByRole(scanner.nextLine()));
                }
                case "8" -> {
                    System.out.print("Write ascending 'A to Z' or descending 'A to Z': \n'asc' or 'desc' -> ");
                    System.out.println(sortAble.sortByMovieName(scannerChek()));
                }
                case "9" -> {
                    System.out.print("Write ascending or descending: 'asc' or 'desc'->");
                    System.out.println(sortAble.sortByYear(scannerChek()));
                }
                case "10" -> {
                    System.out.print("Write ascending or descending: 'asc' or 'desc' -> ");
                    System.out.println(sortAble.sortByProducer(scannerChek()));
                }
                case "0" -> {
                    return;
                }
                default -> System.out.println("Uncorrect choice");
            }

        }
    }

    public static void showCommands() {
        System.out.println("""
                ❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️❇️
                  1.  Get all Movies 
                  2.  Find Movie by name or part name
                  3.  Find Movie by actor name
                  4.  Find Movie by year  
                  5.  Find Movi by producer
                  6.  Find Movie by genre
                  7.  Find Movie by role
                  8.  Sort by Movie name 
                  9.  Sort by year
                  10. Sort by producer
                  """);
    }

    public static String scannerChek() {
        while (true) {
            try {
                String ascOrDesc = new Scanner(System.in).nextLine();
                if (ascOrDesc.equalsIgnoreCase("asc") || ascOrDesc.equalsIgnoreCase("desc")) return ascOrDesc;
                else throw new MyException("should be write \"asc\" or \"desc\" ");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


